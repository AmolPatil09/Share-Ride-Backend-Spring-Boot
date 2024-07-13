package com.shareRide.shareRide.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;


@Entity 
public class User {
	private String name;
    private String userName;
    @Id
	private String emailId;
	private String mobileNo;
	private String password;
	@Transient
    private String confirmPassword;
    
    
	public User() {
		super();
	}


	public User(String name, String userName, String emailId, String mobileNo, String password,
			String confirmPassword) {
		super();
		this.name = name;
		this.userName = userName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
    
}
