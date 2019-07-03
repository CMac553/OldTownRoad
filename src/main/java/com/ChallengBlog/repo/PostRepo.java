package com.ChallengBlog.repo;

import org.springframework.data.repository.CrudRepository;

import com.ChallengBlog.model.Post;

public interface PostRepo extends CrudRepository<Post, Long>{

}
