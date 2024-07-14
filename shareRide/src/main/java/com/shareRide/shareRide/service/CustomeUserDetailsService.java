package com.shareRide.shareRide.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.RuntimeBeanNameReference;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.shareRide.shareRide.Repository.LoginRepo;
import com.shareRide.shareRide.dto.JwtResponse;
import com.shareRide.shareRide.entity.User;


@Service
public class CustomeUserDetailsService implements UserDetailsService {
	
	@Autowired
	private LoginRepo repo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User getUser(String username) {
		 Optional<User> optional=repo.findById(username);
		 User user= optional.orElseThrow(()->new RuntimeException("You are not registred user please register"));
		return user;
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
	     UserDetails userDetails = org.springframework.security.core.userdetails.User.builder().
	                username(this.getUser(username).getEmailId())
	                .password(passwordEncoder.encode(this.getUser(username).getPassword())).roles("ADMIN").
	                build();
	     return userDetails;
	}



}
