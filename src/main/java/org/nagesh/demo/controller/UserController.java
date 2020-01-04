package org.nagesh.demo.controller;

import java.util.List;

import org.nagesh.demo.modal.User;
import org.nagesh.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		
		return (List<User>)userRepo.findAll();
		
	}
	
	public void addUser(@RequestBody User user) {
		userRepo.save(user);
		
	}
}
