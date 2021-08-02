package com.piyush;

import org.springframework.stereotype.Service;

@Service
public class UserModel {
	String user = "piyush";
	String pass = "yo";
	String email = "xyz@gmail.com";

	public boolean User(String user, String pass, String email) {
		if (user.equals(this.user) && pass.equals(this.pass) && email.equals(this.email)) {
			return true;
		} else {
			return false;
		}
	}

}
