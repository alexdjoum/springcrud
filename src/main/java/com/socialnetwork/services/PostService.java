package com.socialnetwork.services;

import java.util.List;

import com.socialnetwork.models.Post;


public interface PostService {
	public List<Post> getAllPosts(); 
	public Post savePost(Post post);
}
