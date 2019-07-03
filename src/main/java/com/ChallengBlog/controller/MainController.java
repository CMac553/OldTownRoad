package com.ChallengBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ChallengBlog.model.Post;
import com.ChallengBlog.repo.PostRepo;

@Controller
public class MainController {

    @Autowired
    PostRepo postRepo;

    @GetMapping("/")
    public String renderIndex(Post post, Model model) {
        model.addAttribute("posts", postRepo.findAll());
        return "index";
    }

    @GetMapping("/new")
    public String renderNewPostPage(Post post, Model model) {
        Post myPost = new Post();
        model.addAttribute("post", myPost);
        return "posts/makePost";
    }

    @PostMapping("/new")
    public String makeNewPost(Post post, Model model) {

        postRepo.save(post);
        model.addAttribute("title", post.getTitle());
        model.addAttribute("author", post.getAuthor());
        model.addAttribute("description", post.getDescription());
        model.addAttribute("status", post.getStatus());

        return "changes";
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable Long id){
        postRepo.deleteById(id);
        return "changes";

    }

    @GetMapping("/edit/{id}")
    public String getEditPostPage(@PathVariable Long id, Model model){
        Post post = postRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("bad id"));
        model.addAttribute("post", post);
        return "posts/editPost";
    }

    @PutMapping("/edit/{id}")
    public String editPost(@PathVariable Long id, Post post, Model model) {

        Post editedPost = postRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("lame sauce"));

        editedPost.setTitle(editedPost.getTitle());
        editedPost.setAuthor(editedPost.getAuthor());
        editedPost.setDescription(editedPost.getDescription());
        editedPost.setStatus(editedPost.getStatus());

        postRepo.save(post);

        model.addAttribute("title", editedPost.getTitle());
        model.addAttribute("author", editedPost.getAuthor());
        model.addAttribute("description", editedPost.getDescription());
        model.addAttribute("status", editedPost.getStatus());

        return "changes";
    }


}



