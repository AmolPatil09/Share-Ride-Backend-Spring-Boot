package com.shareRide.shareRide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shareRide.shareRide.dto.JwtResponse;
import com.shareRide.shareRide.dto.LoginRequst;
import com.shareRide.shareRide.exception.RegistartionExceptipon;
import com.shareRide.shareRide.service.LoginService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;


@RestController
public class LoginConroller {
	
	 @Autowired
	 private LoginService login;
	 
	 @GetMapping("/")
	 public String test() {
	 return "HI";
	 }
	
	@PostMapping("/login")
	public ResponseEntity<JwtResponse> registerPatient(@RequestBody LoginRequst loginReq, HttpServletResponse response)throws RegistartionExceptipon{
		JwtResponse res=login.login(loginReq);
		Cookie cookie = new Cookie("jwt-token", res.getJwtToken());
	        cookie.setHttpOnly(true); 
	        cookie.setSecure(true); 
	        cookie.setPath("/");
	        cookie.setMaxAge(5 * 60 * 60 * 1000); 		        
	        response.addCookie(cookie);
		return new ResponseEntity<JwtResponse>(res,HttpStatus.ACCEPTED);
    
	}

}
