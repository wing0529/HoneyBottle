package com.likelion.honeyBottle.controller;

import com.likelion.honeyBottle.domain.Dto.CreatePostDto;
import com.likelion.honeyBottle.domain.Post;
import com.likelion.honeyBottle.service.PostService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/* 구인 구직 게시판 관리 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/job_offer")
public class JobController {
    private final PostService postService;
    @GetMapping({"/recruit", ""}) // 모집합니다
    public String recruit(){
        return "recruit";
    }
    @GetMapping("/apply") // 지원합니다
    public String apply(){
        return "apply";
    }
}
