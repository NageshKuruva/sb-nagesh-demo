package org.nagesh.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	private String message;
	
	@GetMapping("/welcome")
	public String getMsg() {
		return "Hi, How are you";
		
	}

}
