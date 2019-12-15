package org.nagesh.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicThymeLfController {
	
	@Value("${spring.application.name}")
	String appName;
	
	@GetMapping("/tlf")
	public String homePage(Model model) {
		
		model.addAttribute("appName", this.appName);
		return "index";
		
		
	}

}
