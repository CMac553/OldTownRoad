package com.techtalentsouth.TechTalentBlog.Repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.techtalentsouth.TechTalentBlog.BlogPost;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {

	
}
