package com.shareRide.shareRide.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserDTO {
	
	@NotBlank(message = "name must not be null")
	private String name;
	@NotBlank(message = "username must not be null")
    private String userName;
	@Email(message = "email must be in proper format")
	private String emailId;
	@Pattern(regexp = "\\d{10}",message = "mobile number should be in digit and 10 digit")
	private String mobileNo;
	@NotBlank(message = "Password is required")
	@Size(min = 8, message = "Password must be at least 8 characters long")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$",
    message = "Password must contain at least one lowercase letter, one uppercase letter, one digit, and one special character")
	private String password;
    private String confirmPassword;
	public UserDTO() {
		super();
		
	}
	public UserDTO(String name, String userName, String emailId, String mobileNo, String password,
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
