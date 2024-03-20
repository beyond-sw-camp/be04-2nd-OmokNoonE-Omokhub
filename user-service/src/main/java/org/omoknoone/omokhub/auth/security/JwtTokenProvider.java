package org.omoknoone.omokhub.auth.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    private final Environment environment;

    @Autowired
    public JwtTokenProvider(Environment environment) {
        this.environment = environment;
    }

    String generateToken(Claims claims, Long expriationTime) {

        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(new java.util.Date(System.currentTimeMillis()
                        + expriationTime))
                .signWith(SignatureAlgorithm.HS512, environment.getProperty("token.secret"))
                .compact();
    }
}
