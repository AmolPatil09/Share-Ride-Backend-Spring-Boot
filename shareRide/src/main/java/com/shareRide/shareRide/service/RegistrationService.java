package com.shareRide.shareRide.service;

import com.shareRide.shareRide.dto.UserDTO;
import com.shareRide.shareRide.exception.RegistartionExceptipon;


public interface RegistrationService {

	String register(UserDTO user)throws RegistartionExceptipon;

}
