package org.omoknoone.omokhub.auth.security;

import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.omoknoone.omokhub.auth.service.AuthService;
import org.omoknoone.omokhub.user.command.service.MemberService;
import org.springframework.core.env.Environment;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Slf4j
public class JwtFilter extends OncePerRequestFilter {

    private final Environment environment;
    private final AuthService authService;
    private final JwtUtil jwtUtil;
    private final JwtTokenProvider jwtTokenProvider;

    public JwtFilter(MemberService memberService, Environment environment, AuthService authService, JwtUtil jwtUtil, JwtTokenProvider jwtTokenProvider) {
        this.environment = environment;
        this.authService = authService;
        this.jwtUtil = jwtUtil;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {
        String authorizationHeader = request.getHeader("Authorization");
        String refreshTokenId = request.getHeader("refreshTokenId");

        /* 설명. JWT에 헤더가 있는 경우 */
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            String token = authorizationHeader.substring(7);

            try {
                if(jwtUtil.validateToken(token)) {
                    Authentication authentication = jwtUtil.getAuthentication(token);
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            } catch (ExpiredJwtException e) {
                System.out.println("[doFilterInternal] 잡았다!!!");
                        /* 설명. accessToken이 만료 됐으면 refreshToken 확인 */
                if(authService.checkRefreshToken(refreshTokenId)) {     // refreshToken이 있는 경우 재발급
//                    String newAccessToken = jwtTokenProvider.generateToken(parseClaims(token), accessTokenExpTime);
                    Long accessExpirationTime = Long.valueOf(environment.getProperty("token.access-expiration-time"));
                    String newAccessToken =
                            jwtTokenProvider.generateToken(jwtUtil.parseClaims(token), accessExpirationTime);

                    response.addHeader("accessToken", newAccessToken);
                }
            }
        }
        filterChain.doFilter(request, response);
    }
}
