package com.likelion.honeyBottle.service;

import com.likelion.honeyBottle.domain.Post;
import com.likelion.honeyBottle.domain.User;
import com.likelion.honeyBottle.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public void createPost(String title, String content, User user) {
            Post post = Post.builder()
                    .title(title)
                    .content(content)
                    .user(user)
                    .build();
            postRepository.save(post);

    }

    public Post readPost(String id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }
}
