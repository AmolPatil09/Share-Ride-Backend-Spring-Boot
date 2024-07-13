package com.shareRide.shareRide.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.shareRide.shareRide.entity.User;

public interface RegistationRepo extends JpaRepository<User,String>{

}
