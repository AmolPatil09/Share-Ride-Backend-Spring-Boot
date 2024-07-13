package com.shareRide.shareRide.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shareRide.shareRide.Repository.LoginRepo;
import com.shareRide.shareRide.dto.LoginRequst;
import com.shareRide.shareRide.entity.User;
import com.shareRide.shareRide.exception.RegistartionExceptipon;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepo repo;

	@Override
	public String login(LoginRequst loginReq) throws RegistartionExceptipon {
	
			Optional<User> optional=repo.findById(loginReq.getEmailId());
			if(optional.isPresent())
			{
				User user=optional.get();
				if(user.getPassword().equals(loginReq.getPassword())) {
					return "Login success";
				}
				else {
					throw new RegistartionExceptipon("Incorrect Password please enter correct password");
				}
				
			}
			else
			{
				throw new RegistartionExceptipon("You are not registred user please register");
			}
			
		}
	}

