package com.beignner.feignclientDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/user")
	public String getName()
	{
		return "Play java";
	}
	@GetMapping("/address")
	public String getAddress()
	{
		return "India";
	}
	@GetMapping("/City")
	public String getCity()
	{
		return "Delhi";
	}
	

}
