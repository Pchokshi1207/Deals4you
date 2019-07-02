package com.springboot.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Post;
import com.springboot.service.PostsService;

@RestController
public class PostsController {
	@Autowired
	private PostsService service;

	@RequestMapping("/posts")
	public List<Post> getPosts() {
		return service.getPosts();
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/posts")
	public void addPost(@RequestBody Post listElement) {
		service.addPost(listElement);
	}

	

	

}
