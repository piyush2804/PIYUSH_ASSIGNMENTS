package com.example.SPRINGREST_2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SPRINGREST_2.services.ZipService;
import com.example.SPRINGREST_2.zips.Zipsinfo;

@RestController
public class Controller {
	@Autowired
	private ZipService zip;

	@GetMapping("/")
	public String home() {
		return "Hello World!";
	}

	@PostMapping("/courses")
	public String home2() {
		return "hi";
	}

	public List<Zipsinfo> getCourses() {
		return this.zip.getZips();

	}

	@GetMapping("/zips/{zip}")
	public Zipsinfo getzipInfo(@PathVariable String zip) {
		return this.zip.getZips(Long.parseLong(zip));
	}

}
