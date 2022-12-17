package com.generation.jlsg.myappjwtWebSecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class WebSecurityConfig {
	public SecurityFilterChain filterChain(HttpSecurity http, AuthenticationManager AuthManager) {
		return http.httpBasic()
				.and()
				.authorizeHttpRequests()
				.requestMatchers( "/publico/**").permitAll()//url que empiecen con publico
    			.requestMatchers( "/admin/**").hasRole("ADMIN")//url que empiesen con admin son del rol admin
    			.anyRequest()
    			.authenticated()    			
    			.and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .build();
	}
	UserDetailsService userDetailsService( ) {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withUsername("pedrovar")
				.password(PasswordEncoder())
	}

}
