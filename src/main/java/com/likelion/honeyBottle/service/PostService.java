package com.likelion.honeyBottle.service;

import com.likelion.honeyBottle.domain.HoneyPost;
import com.likelion.honeyBottle.domain.User;
import com.likelion.honeyBottle.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public void createPost(String title, String content, User user) {
            HoneyPost post = HoneyPost.builder()
                    .title(title)
                    .content(content)
                    .user(user)
                    .build();
            postRepository.save(post);

    }

    public HoneyPost readPost(String id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());

    }
}
