package com.puipuia.thymeleaf.helloworld1.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	// create a mapping for "/hello"
	
	@GetMapping("/hello")
	public String sayHello() {
		
		
		
		return "employees/sourcecode";
	}
	
	@GetMapping("/Login")
	public String LoginForm() {
		
		return "employees/employee-form";
		
	}
	
}
	








