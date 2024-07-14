package com.shareRide.shareRide.configue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;




@Configuration
public class AppConfigue {
	
//	 @Bean
//	    public UserDetailsService userDetailsService() {
//	        UserDetails userDetails = User.builder().
//	                username("amol@gamil.com")
//	                .password(passwordEncoder().encode("mol@123")).roles("ADMIN").
//	                build();
//	        return new InMemoryUserDetailsManager(userDetails);
//	        
//	    }
	@Bean
	public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	}
	@Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }

}
