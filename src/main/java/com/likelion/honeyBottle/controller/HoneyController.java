package com.likelion.honeyBottle.controller;

import com.likelion.honeyBottle.domain.Dto.CreatePostDto;
import com.likelion.honeyBottle.domain.Post;
import com.likelion.honeyBottle.service.PostService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/* 꿀팁 게시판 관리*/
@RestController
@RequiredArgsConstructor
@RequestMapping("/honey")
public class HoneyController {
    private final PostService postService;
    @GetMapping({"/part_time", ""}) // 알바 꿀통
    public String part_time(){
        return "part_time";
    }

    @GetMapping("/school") // 학교 꿀통
    public String school(){
        return "school";
    }

    @GetMapping("/apart") // 자취 꿀통
    public String apart(){
        return "apart";
    }

    @GetMapping("/place") // 방문 꿀통
    public String place(){
        return "place";
    }
}
