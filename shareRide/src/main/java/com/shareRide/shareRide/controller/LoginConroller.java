package com.shareRide.shareRide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shareRide.shareRide.dto.LoginRequst;
import com.shareRide.shareRide.exception.RegistartionExceptipon;
import com.shareRide.shareRide.service.LoginService;


@RestController
public class LoginConroller {
	
	 @Autowired
	 private LoginService login;
	
	@PostMapping("/login")
	public ResponseEntity<String> registerPatient(@RequestBody LoginRequst loginReq)throws RegistartionExceptipon
	
	{	
    return new ResponseEntity<String>(login.login(loginReq),HttpStatus.ACCEPTED);
		
	}

}
