package com.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Post;
import com.springboot.repository.PostRepository;

@Service
public class PostsService {
	
	@Autowired
	private PostRepository repo;
	
	public List<Post> getPosts(){
		List<Post> list=new ArrayList<>();
		for(Post post:repo.findAll()) {
			list.add(post);
		}
		
		return list;
	}
	
	
	
	
	
	public void addPost(Post listElement) {
		repo.save(listElement);
		
	}
	
	

}
