package com.example.springGolang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springGolang.Dao.AuthorDao;
import com.example.springGolang.model.Posts;

@Service
public class AuthorServiceImp implements AuthorService {
	
	@Autowired
	AuthorDao authorDao;

	@Override
	public Posts savePosts(Posts post) {
		// TODO Auto-generated method stub
		return authorDao.save(post);
	}

	@Override
	public List<Posts> getAllAuthors() {
		// TODO Auto-generated method stub
		return (List<Posts>) authorDao.findAll();
	}
	

}
