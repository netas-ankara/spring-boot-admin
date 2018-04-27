package com.netas.ankara.springbootadminserverbasicauth.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by lenovo510 on 24.04.2018.
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/login.html")
                .loginProcessingUrl("/login")
                .permitAll();
        http
                .logout().logoutUrl("/logout");
        http
                .csrf().disable();
        http
                .authorizeRequests()
                .antMatchers("/login.html", "/**/*.css", "/img/**", "/third-party/**")
                .permitAll();
        http
                .authorizeRequests()
                .antMatchers("/**")
                .authenticated();
        http.httpBasic();
    }
}