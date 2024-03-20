package org.omoknoone.omokhub.auth.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.omoknoone.omokhub.auth.service.AuthService;
import org.omoknoone.omokhub.user.command.service.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.naming.AuthenticationException;
import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Component
public class JwtUtil {

    private final Key key;
    private final MemberService memberService;

    public JwtUtil(
            @Value("${token.secret}") String secretKey,
            @Value("${token.access-expiration-time}") long accessTokenExpTime,
            MemberService memberService) {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        this.key = Keys.hmacShaKeyFor(keyBytes);
        this.memberService = memberService;
    }
    
    /* 설명. 넘어온 AccessToken으로 인증 객체 추출 */
    public Authentication getAuthentication(String token) {
        UserDetails userDetails = memberService.loadUserByUsername(this.getUserId(token));

        /* 설명. 토큰에서 claim들 추출(토큰 복호화) */
        Claims claims = parseClaims(token);
        System.out.println("넘어온 AccessToken claims 확인: " + claims);

        if (claims.get("role") == null) {
            throw new RuntimeException("권한 정보가 없는 토큰입니다.");
        }

        /* 설명. 클레임에서 권한 정보 가져오기 */
//        String roles = (String) claims.get("auth");
//        List<String> authList = new ArrayList<>();
//        authList.add(roles);
//        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(roles);
//        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
//        simpleGrantedAuthorities.add(simpleGrantedAuthority);

        Collection<? extends GrantedAuthority> authorities = Stream.of(new SimpleGrantedAuthority((String) claims.get("role")))
                .collect(Collectors.toList());

        return new UsernamePasswordAuthenticationToken(userDetails, "", authorities);
    }
    
    /* 설명. Token 검증 */
    public boolean validateToken(String token) throws ExpiredJwtException {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);

            return true;
        } catch (io.jsonwebtoken.security.SecurityException | MalformedJwtException e) {
//            log.info("Invalid JWT Token {}", e);
        } catch (ExpiredJwtException e) {
            throw e;
        } catch (UnsupportedJwtException e) {
//            log.info("Unsupported JWT Token {}", e);
        } catch (IllegalArgumentException e) {
//            log.info("JWT claims strig si empty {}", e);
        }

        return false;
    }

    /* 설명. Token에서 User의 Id 개념 추출 */
    public String getUserId(String token) {
        return parseClaims(token).getSubject();
    }

    /* 설명. Token에서 Claims 추출 */
    public Claims parseClaims(String token) {
        try {
            return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
        } catch (ExpiredJwtException e) {
            return e.getClaims();
        }
    }
}
