package com.shareRide.shareRide.service;

import com.shareRide.shareRide.dto.LoginRequst;
import com.shareRide.shareRide.exception.RegistartionExceptipon;

public interface LoginService {

	

	String login(LoginRequst loginReq) throws RegistartionExceptipon;



	

}
