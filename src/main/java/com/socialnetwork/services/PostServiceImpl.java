package com.socialnetwork.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialnetwork.models.Post;
import com.socialnetwork.repositories.PostRepository;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired 
	PostRepository postRepository;
	
	@Override
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}

	@Override
	public Post savePost(Post post) {
		// TODO Auto-generated method stub
		return postRepository.save(post);
	}
}
