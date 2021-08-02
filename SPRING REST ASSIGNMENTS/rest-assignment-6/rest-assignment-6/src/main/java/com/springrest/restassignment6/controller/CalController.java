package com.springrest.restassignment6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {
	
	@GetMapping("/home")
	public String home()
	{
		return "welcome to home page";
		
	}
	
	@GetMapping("/calculate")
	public int operation()
	{
		return 1;
//		return this.functionality(int a,int b);
	}

}
