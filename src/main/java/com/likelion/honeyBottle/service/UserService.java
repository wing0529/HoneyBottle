package com.likelion.honeyBottle.service;

import com.likelion.honeyBottle.domain.Dto.LoginRequestDto;
import com.likelion.honeyBottle.domain.HoneyPost;
import com.likelion.honeyBottle.domain.User;
import com.likelion.honeyBottle.repository.PostRepository;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
@RequiredArgsConstructor
public class UserService {
    private final PostRepository postRepository;

    public void createID(String title, String content, User user) {
        HoneyPost post = HoneyPost.builder()
                .title(title)
                .content(content)
                .user(user)
                .build();
        postRepository.save(post);

    }

    public Boolean login(LoginRequestDto loginRequestDto, HttpServletResponse response) {
        return true;
    }
}
