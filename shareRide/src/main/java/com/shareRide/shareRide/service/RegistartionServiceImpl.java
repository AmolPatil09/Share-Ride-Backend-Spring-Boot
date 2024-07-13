package com.shareRide.shareRide.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shareRide.shareRide.Repository.RegistationRepo;
import com.shareRide.shareRide.dto.UserDTO;
import com.shareRide.shareRide.entity.User;
import com.shareRide.shareRide.exception.RegistartionExceptipon;


@Service
public class RegistartionServiceImpl implements RegistrationService{
	
	@Autowired
	 private RegistationRepo repo;

	@Override
	public String register(UserDTO user) throws RegistartionExceptipon {
	  Optional<User> optional= repo.findById(user.getEmailId());
	  if(optional.isPresent())
		{
			throw new RegistartionExceptipon("You have alredy registred");
		}
		else
		{
			User userToDB=new User();
			userToDB.setName(user.getName());;
			userToDB.setUserName(user.getUserName());
			userToDB.setEmailId(user.getEmailId());
			userToDB.setMobileNo(user.getMobileNo());
			userToDB.setPassword(user.getPassword());
			repo.save(userToDB);
			return "Rgistration successfully";
		}
		
	}

}
