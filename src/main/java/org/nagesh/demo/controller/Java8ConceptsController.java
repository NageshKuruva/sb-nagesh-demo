package org.nagesh.demo.controller;

import org.nagesh.demo.controller.service.StreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/javap")
public class Java8ConceptsController {
	
	@Autowired
	private StreamService streamService;
	
	@GetMapping("/list/practices")
	public String listOfPractices() {
		return "LIST-InProgress-Add Json/csv file to add ideas-read the file";
	}
	
	@GetMapping("/11p/lamdas")
	public String knowLambdas() {
		
		return "lambda";
		
	}
	
	@GetMapping("/11p/streams")
	public String knowStreams() {
		
		//trigger the method convertStringToInteger with filter even numbers
		String output = streamService.convertStringToInt();
		System.out.println("output"+output);
		return "streams-Inprogress";
		
	}
	
	@GetMapping("/11p/read/{fileType}")
	public String readFile() {
		
		return "Inprogress";
		
	}
}
