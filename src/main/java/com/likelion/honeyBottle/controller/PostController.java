package com.likelion.honeyBottle.controller;

import com.likelion.honeyBottle.domain.Dto.PostDto;
import com.likelion.honeyBottle.domain.Post;
import com.likelion.honeyBottle.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping("/post/create")
    public String createPost(@RequestBody PostDto post){

    }
}
