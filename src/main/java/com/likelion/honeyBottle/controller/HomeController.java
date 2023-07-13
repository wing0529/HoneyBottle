package com.likelion.honeyBottle.controller;

import com.likelion.honeyBottle.domain.Dto.LoginRequestDto;
import com.likelion.honeyBottle.service.PostService;
import com.likelion.honeyBottle.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/* 홈페이지 관리 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/HoneyBottle")
public class HomeController {
    private final PostService postService;
    private final UserService userService;

    @GetMapping() // HoneyBottle 사이트 최초 접속
    public String home()
    {
        return "HoneyBottle";
    }


    @PostMapping("/sign_in") // 로그인
    public ResponseEntity<String> login(@RequestBody LoginRequestDto loginRequestDto, HttpServletResponse response) {
        userService.login(loginRequestDto, response);
        return new ResponseEntity<>("로그인 성공", HttpStatus.OK);
    }

    @PostMapping("/sign_up") // 회원가입
    public String signUp(){
        return "sign_up";
    }
}
