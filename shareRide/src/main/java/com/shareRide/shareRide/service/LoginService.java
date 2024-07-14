package com.shareRide.shareRide.service;

import com.shareRide.shareRide.dto.JwtResponse;
import com.shareRide.shareRide.dto.LoginRequst;
import com.shareRide.shareRide.exception.RegistartionExceptipon;

import jakarta.servlet.http.HttpServletResponse;

public interface LoginService {

	

	JwtResponse login(LoginRequst loginReq) throws RegistartionExceptipon;



	

}
