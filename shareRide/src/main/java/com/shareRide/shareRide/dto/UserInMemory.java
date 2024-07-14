package com.shareRide.shareRide.dto;



public class UserInMemory {

	  private String username;
	    private String password;
	    private String roles;

	    private UserInMemory(Builder builder) {
	        this.username = builder.username;
	        this.password = builder.password;
	        this.roles = builder.roles;
	        
	    }

	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getRoles() {
	        return roles;
	    }
	    public static class Builder {
	        private String username;
	        private String password;
	        private String roles;

	        public Builder username(String username) {
	            this.username = username;
	            return this;
	        }

	        public Builder password(String password) {
	            this.password = password;
	            return this;
	        }
	        
	        public Builder roles(String roles) {
	            this.roles = roles;
	            return this;
	        }

	        public UserInMemory build() {
	            return new UserInMemory(this);
	        }
	    }
}
