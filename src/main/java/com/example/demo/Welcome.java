package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@Autowired
	private WelcomeService service;
	@RequestMapping("/welcome")
	public String welcomeMessage(){
		return service.welcomeRetriver();
	}

}

@Component
class WelcomeService{
	
	public String welcomeRetriver(){
		return "Hey everyone !!!!!!!!!!";
	}

}