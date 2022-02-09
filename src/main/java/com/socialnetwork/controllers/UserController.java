package com.socialnetwork.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialnetwork.models.User;
import com.socialnetwork.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public String add(@RequestBody User user) {
		userService.saveUser(user);
		return "New user is added";
	}
	
	@GetMapping("/getAll")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	
	
	/***@GetMapping("/test")
	String test() {
		return "we are doing a test";
	}*/
	
	/***@PostMapping("/post")
	public String add(@RequestBody )*/

}
