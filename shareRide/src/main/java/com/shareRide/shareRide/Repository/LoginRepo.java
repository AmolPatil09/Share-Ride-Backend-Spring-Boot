package com.shareRide.shareRide.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shareRide.shareRide.entity.User;

public interface LoginRepo extends JpaRepository<User,String>{

	

	

}
