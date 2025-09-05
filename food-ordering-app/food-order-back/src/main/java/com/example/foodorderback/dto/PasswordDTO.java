package com.example.foodorderback.dto;

public class PasswordDTO {
//mistake i have done to not consider and implment lombook here ....if we do then we dont have to write the long code as for using getter and setter here ...simple ek dependency add krna tha
	private String oldPassword;
	private String newPassword;
	
	public PasswordDTO() {
		
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	
	
}
