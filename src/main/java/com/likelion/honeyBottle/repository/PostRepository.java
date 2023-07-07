package com.likelion.honeyBottle.repository;


import com.likelion.honeyBottle.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PostRepository extends JpaRepository<Post, String> {
    @Override
    Optional<Post> findById(String s);
}
