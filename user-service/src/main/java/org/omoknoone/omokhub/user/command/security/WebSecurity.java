package org.omoknoone.omokhub.user.command.security;

import jakarta.servlet.Filter;
import org.omoknoone.omokhub.user.command.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.expression.WebExpressionAuthorizationManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class WebSecurity {

    private final MemberService memberService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final Environment environment;
    private final JwtUtil jwtUtil;

    @Autowired
    public WebSecurity(MemberService memberService,
                       BCryptPasswordEncoder bCryptPasswordEncoder,
                       Environment environment,
                       JwtUtil jwtUtil) {
        this.memberService = memberService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.environment = environment;
        this.jwtUtil = jwtUtil;
    }

    /* 설명. 인가(Authorization)용 메소드 */
    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {

        /* 설명. 로그인 시 추가할 내용 */
        AuthenticationManagerBuilder authenticationManagerBuilder =
                http.getSharedObject(AuthenticationManagerBuilder.class);

        authenticationManagerBuilder.userDetailsService(memberService).passwordEncoder(bCryptPasswordEncoder);

        AuthenticationManager authenticationManager = authenticationManagerBuilder.build();

        /* 설명. JWT 로그인 처리를 할 것이므로 csrf는 신경쓸 필요가 없다. */
        http.csrf((csrf) -> csrf.disable());

        http.authorizeHttpRequests((auth) -> auth
                .requestMatchers(new AntPathRequestMatcher("/user/members/**")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/actuator/**")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/project/**")).permitAll()
                .requestMatchers("/**").access(
                        new WebExpressionAuthorizationManager("hasIpAddress('127.0.0.1') or hasIpAddress('192.168.0.21') or hasIpAddress('192.168.0.250')"))
                .anyRequest().authenticated()
        )
                .authenticationManager(authenticationManager)
                .sessionManagement((session) -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        http.addFilter(getAuthenticationFilter(authenticationManager));
        http.addFilterBefore(new JwtFilter(memberService, jwtUtil), UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    /* 설명. 인증(Authentication)용 메소드 */
    private Filter getAuthenticationFilter(AuthenticationManager authenticationManager) {
        return new AuthenticationFilter(authenticationManager, memberService, environment);
    }

}
