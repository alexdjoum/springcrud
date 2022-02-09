package com.socialnetwork.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialnetwork.models.Post;
import com.socialnetwork.models.User;

public interface PostRepository extends JpaRepository<Post, Integer> {

	static List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return null;
	}

}
