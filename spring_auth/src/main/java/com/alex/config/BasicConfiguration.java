package com.alex.config;

import com.alex.service.CustomUserDetailsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class BasicConfiguration {

    @Bean
    public AuthenticationProvider userDetailsService(PasswordEncoder passwordEncoder,
                                                     CustomUserDetailsService userDetailsService) {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder);
        provider.setUserDetailsService(userDetailsService);
        return provider;
    }

    @Bean
    public SecurityFilterChain configure(HttpSecurity http,
                                         AuthenticationFailureHandler failureHandler) throws Exception {
        http.authorizeHttpRequests(requests -> requests
                        .antMatchers(HttpMethod.GET, "/about", "/css/**").permitAll()
                        .antMatchers(HttpMethod.GET, "/admin").hasAnyAuthority("VIEW_ADMIN")
                        .antMatchers(HttpMethod.GET, "/info").hasAnyAuthority("VIEW_INFO")
                        .anyRequest().authenticated())
                .formLogin(login -> login.loginPage("/login")
                        .failureHandler(failureHandler)
                        .permitAll())
                .logout(logout -> logout
                        .deleteCookies("JSESSIONID")
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/logoutSuccess")
                        .permitAll());
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        Map<String, PasswordEncoder> encoders = new HashMap<>();
        encoders.put("bcrypt", new BCryptPasswordEncoder());
        return new DelegatingPasswordEncoder("bcrypt", encoders);
    }
}
