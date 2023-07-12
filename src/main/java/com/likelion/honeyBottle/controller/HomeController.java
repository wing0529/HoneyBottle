package com.likelion.honeyBottle.controller;

import com.likelion.honeyBottle.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/* 홈페이지 관리 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/HoneyBottle")
public class HomeController {
    private final PostService postService;
    @GetMapping() // HoneyBottle 사이트 최초 접속
    public String home()
    {
        return "HoneyBottle";
    }

    @GetMapping("/sign_in") // 로그인
    public String signIn(){
        return "sign_in";
    }

    @GetMapping("/sign_up") // 회원가입
    public String signUp(){
        return "sign_up";
    }
}
