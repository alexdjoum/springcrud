package com.socialnetwork.services;

import java.util.List;

import com.socialnetwork.models.User;



public interface UserService {
	public User saveUser(User user);
	public List<User> getAllUsers();  
}
