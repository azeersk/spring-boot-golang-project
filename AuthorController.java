package com.example.springGolang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springGolang.model.Posts;
import com.example.springGolang.service.AuthorService;


@RestController
@RequestMapping("post")
public class AuthorController {
	
	
	@Autowired
	AuthorService authorService;
	
	
	@PostMapping
	public ResponseEntity<Posts> savePosts(@RequestBody Posts post){
		Posts myPosts = authorService.savePosts(post);
		
		return new ResponseEntity<Posts>(myPosts, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Posts>> getAuthors()
	{
		
	List<Posts> authors=authorService.getAllAuthors();
	
		return new ResponseEntity<List<Posts>>(authors,HttpStatus.FOUND);
		
	}
	
	
	
}
