package spring.springsecurity_demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
public class Securityconfig {

	  @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .authorizeRequests()
	            .requestMatchers("/").permitAll()  // Allow access to home page without login
	            .anyRequest().authenticated()  // Other pages require login
	            // Use the default login form
	            .and()
	            .logout().permitAll() ;
	       
	        // Allow logout for all users
	        return http.build();
	    }
	
	
}
