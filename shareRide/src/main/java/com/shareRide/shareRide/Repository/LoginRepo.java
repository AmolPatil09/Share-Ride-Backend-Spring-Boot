package com.shareRide.shareRide.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shareRide.shareRide.entity.User;

@Repository
public interface LoginRepo extends JpaRepository<User,String>{

	

	

}
