package com.example.Springbootrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {// representational
	@GetMapping("/")
	public String home() {
		return "Hello World!";
	}

	@PostMapping("/courses")
	public String home2() {
		return "hi";
	}
}
