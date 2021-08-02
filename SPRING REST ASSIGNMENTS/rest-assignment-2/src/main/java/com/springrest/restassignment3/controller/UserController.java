package com.springrest.restassignment3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.restassignment3.entities.User;
import com.springrest.restassignment3.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/home")
	public String sayHello() {
		
		return "welcome to this page";
	}
	
	@GetMapping("/validation/{user}/{password}")
	public String validating(@PathVariable String user,@PathVariable String pass) 
	{
		return this.userService.userValidation(user,pass);
	}
	

}
