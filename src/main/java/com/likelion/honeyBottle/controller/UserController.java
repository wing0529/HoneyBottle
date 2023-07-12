package com.likelion.honeyBottle.controller;

import com.likelion.honeyBottle.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/* 구인 구직 게시판 관리 */
@RestController
@RequiredArgsConstructor
public class UserController {
    private final PostService postService;
    @GetMapping({"/setting"}) // 설정
    public String setting(){
        return "setting";
    }

    @GetMapping({"/help"}) // QnA 및 고객선터
    public String help(){
        return "help";
    }
    @GetMapping("/mypage") // 마이페이지
    public String apply(){
        return "mypage";
    }

}
