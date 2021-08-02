package com.springrest.restassignment3.service;

import org.springframework.stereotype.Service;

@Service
public class UserValidation implements UserService {

	@Override
	public String userValidation(String user, String password) {
		
		if(user=="Deepti" && password=="deepti")
			return "valid user";
		return "invalid user";
	}

}
