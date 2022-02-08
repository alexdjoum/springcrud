package com.socialnetwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialnetwork.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
