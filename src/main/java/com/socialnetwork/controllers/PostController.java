package com.socialnetwork.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialnetwork.models.Post;
import com.socialnetwork.services.PostService;

@RestController
@RequestMapping("/users")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/all")
	public List<Post> getAllPosts() {
		return postService.getAllPosts();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Post post) {
		postService.savePost(post);
		return "New post is added";
	}
}
