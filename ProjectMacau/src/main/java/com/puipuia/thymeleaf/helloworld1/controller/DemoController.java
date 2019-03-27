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
	
	@GetMapping("/login") 
	public String showLoginForm() {
		
		return "employees/Login";  
	}
	
	@GetMapping("/hello1")
	public String sayHello1() {
		
		
		
		return "employees/helloworld";
	}
	
	@GetMapping("/electric") 
	public String showElectricForm() {
		
		return "employees/ElectricForm";  
	}
	
	
}
	








