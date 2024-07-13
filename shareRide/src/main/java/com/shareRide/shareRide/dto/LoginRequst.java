package com.shareRide.shareRide.dto;

public class LoginRequst {
	private String emailId;
	private String password;
	public LoginRequst(String emailId, String password) {
		super();
		this.emailId= emailId;
		this.password = password;
	}
	public LoginRequst() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String userName) {
		this.emailId = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
