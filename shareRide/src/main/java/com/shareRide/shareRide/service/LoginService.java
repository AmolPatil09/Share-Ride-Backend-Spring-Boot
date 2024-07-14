package com.shareRide.shareRide.service;

import com.shareRide.shareRide.dto.JwtResponse;
import com.shareRide.shareRide.dto.LoginRequst;
import com.shareRide.shareRide.exception.RegistartionExceptipon;

public interface LoginService {

	

	JwtResponse login(LoginRequst loginReq) throws RegistartionExceptipon;



	

}
