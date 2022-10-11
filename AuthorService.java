package com.example.springGolang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springGolang.model.Posts;

@Service
public interface AuthorService {
	
	public Posts savePosts(Posts post);
	public List<Posts> getAllAuthors();
}
