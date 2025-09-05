package com.example.foodorderback.dto;

import com.example.foodorderback.model.Role;
import com.example.foodorderback.model.User;

public class UserEditDTO {

	private Long id;

	private String firstName;	
	private String lastName;
	private String username;
	private String email;
	
	private String phoneNumber;
	private String address;
	
	public UserEditDTO() {
		
	}
   //just taking users as prameter and taking all tha crdntial from them
	public UserEditDTO(User user) {
		this.id = user.getId();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.username = user.getUsername();
		this.email = user.getEmail();
		this.phoneNumber = user.getPhoneNumber();
		this.address = user.getAddress();
	}
}
