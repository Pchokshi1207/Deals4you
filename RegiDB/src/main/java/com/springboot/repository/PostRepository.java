package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Post;

public interface PostRepository extends CrudRepository<Post, Integer>{
	

}
