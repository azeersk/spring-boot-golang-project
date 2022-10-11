package com.example.springGolang.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springGolang.model.Posts;

@Repository
public interface AuthorDao extends CrudRepository<Posts, Integer> {
	

}
