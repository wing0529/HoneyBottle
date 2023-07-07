package com.likelion.honeyBottle.repository;


import com.likelion.honeyBottle.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, String> {
}
