package com.likelion.honeyBottle.controller;

import com.likelion.honeyBottle.domain.Dto.CreatePostDto;
import com.likelion.honeyBottle.domain.HoneyPost;
import com.likelion.honeyBottle.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping("post/create")
    public String createPost(@RequestBody CreatePostDto post) throws RuntimeException{
        try{
            postService.createPost(post.getTitle(), post.getContent(), post.getUser());
            return "post created";
        }
        catch(Exception e){
            return "Something wrong";
        }
    }
    @GetMapping("/post")
    public HoneyPost ReadPost(@RequestParam("id")String id){
            return postService.readPost(id);
    }

}
