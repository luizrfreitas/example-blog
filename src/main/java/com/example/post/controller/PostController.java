package com.example.post.controller;

import com.example.post.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/post")
    public Post getPost() {
        return new Post("Hello, World!");
    }
}