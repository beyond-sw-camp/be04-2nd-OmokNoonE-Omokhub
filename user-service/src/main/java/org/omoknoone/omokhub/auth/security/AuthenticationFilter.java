package org.omoknoone.omokhub.auth.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.omoknoone.omokhub.auth.service.AuthService;
import org.omoknoone.omokhub.user.command.dto.MemberDTO;
import org.omoknoone.omokhub.user.command.service.MemberService;
import org.omoknoone.omokhub.user.command.vo.RequestLogin;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;
import java.util.ArrayList;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final MemberService memberService;
    private final AuthService authService;
    private final Environment environment;

    public AuthenticationFilter(AuthenticationManager authenticationManager, MemberService memberService, AuthService authService, Environment environment) {
        super(authenticationManager);
        this.memberService = memberService;
        this.authService = authService;
        this.environment = environment;
    }

    /* 설명. 로그인 시도 시 동작하는 기능(POST 방식의 /login 요청) -> request body에 담겨온다. */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        try {
            RequestLogin requestLogin =
                    new ObjectMapper().readValue(request.getInputStream(), RequestLogin.class);

            /* 설명. id와 비밀번호를 기준으로 로그인을 한다 */
            return getAuthenticationManager().authenticate(
                    new UsernamePasswordAuthenticationToken(
                            requestLogin.getMemberId(), requestLogin.getPassword(), new ArrayList<>()
                    )
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* 설명. 로그인 성공 시 JWT 토큰 생성하는 기능 */
    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {

        String id = ((User) authResult.getPrincipal()).getUsername();

        /* 설명. DB를 다녀와 사용자의 고유 아이디(memberId)를 가져올 예정(Principal 객체(Authentication)에는 없는 값이므로) */
        MemberDTO memberDetails = memberService.getMemberDetailsByMemberId(id);
        String memberId = memberDetails.getMemberId();
        String roleName = memberDetails.getRoleName();
        String name = memberDetails.getName();

        Claims claims = Jwts.claims().setSubject(memberId);
        claims.put("role", roleName);
        claims.put("name", name);

//        Claims claims2 = Jwts.claims().setSubject(memberId);
//        claims.put("role2", roleName);
//        claims.put("name2", name);

        String accessToken = Jwts.builder()
//                .setSubject(memberId)
                .setClaims(claims)
                .setExpiration(new java.util.Date(System.currentTimeMillis()
                        + Long.valueOf(environment.getProperty("token.access-expiration-time"))))
                .signWith(SignatureAlgorithm.HS512, environment.getProperty("token.secret"))
                .compact();

        String refreshToken = Jwts.builder()
//                .setClaims(claims2)
                .setSubject(memberId)
                .setExpiration(new java.util.Date(System.currentTimeMillis()
                        + Long.valueOf(environment.getProperty("token.refresh-expiration-time"))))
                .signWith(SignatureAlgorithm.HS512, environment.getProperty("token.secret"))
                .compact();

        /* 설명. refreshToken 관리를 위해 redis에 회원 정보 전달 */
        authService.successLogin(memberId, refreshToken);

        response.addHeader("accessToken", accessToken);
        response.addHeader("refreshToken", refreshToken);
        response.addHeader("memberId", memberId);
    }
}
