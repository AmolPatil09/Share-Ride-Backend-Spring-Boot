package com.shareRide.shareRide.dto;




public class JwtResponse {
    private String jwtToken;
    private String emailId;

    private JwtResponse(Builder builder) {
        this.jwtToken = builder.jwtToken;
        this.emailId = builder.emailId;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public String getEmailId() {
        return emailId;
    }

    public static class Builder {
        private String jwtToken;
        private String emailId;

        public Builder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public Builder emailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public JwtResponse build() {
            return new JwtResponse(this);
        }
    }
}
