package org.omoknoone.omokhub.project.command.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.expression.WebExpressionAuthorizationManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class WebSecurity {

    private final Environment environment;

    @Autowired
    public WebSecurity(Environment environment) {
        this.environment = environment;
    }

    /* 설명. 인가(Authorization)용 메소드 */
    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {

        /* 설명. JWT 로그인 처리를 할 것이므로 csrf는 신경쓸 필요가 없다. */
        http.csrf((csrf) -> csrf.disable());

        http.authorizeHttpRequests((auth) -> auth
                .requestMatchers(new AntPathRequestMatcher("/actuator/**")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/project/**")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/project/seekingmemberposts/**")).permitAll()
                .requestMatchers("/**").access(
                        new WebExpressionAuthorizationManager("hasIpAddress('127.0.0.1') or hasIpAddress('192.168.0.*')"))
                .anyRequest().authenticated()
        );
//                .sessionManagement((session) -> session
//                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));


        return http.build();
    }

}
