package com.piyush;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	// @ResponseBody
	public String sayHello() {
		return "index";
	}

	@RequestMapping(value = "/Welcome", method = RequestMethod.GET)
	public String sayG() {
		return "helloWorld";
	}

}
