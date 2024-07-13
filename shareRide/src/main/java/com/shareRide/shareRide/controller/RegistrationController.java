package com.shareRide.shareRide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shareRide.shareRide.dto.UserDTO;
import com.shareRide.shareRide.exception.RegistartionExceptipon;
import com.shareRide.shareRide.service.RegistrationService;

import jakarta.validation.Valid;


@RestController
public class RegistrationController {
	
	
	@Autowired
    private RegistrationService registerService;

	@PostMapping("/register")
	public ResponseEntity<String> registerPatient(@RequestBody  @Valid UserDTO user)throws RegistartionExceptipon
	
	{	
		return new ResponseEntity<String>(registerService.register(user),HttpStatus.ACCEPTED);
		
	}
	
}
