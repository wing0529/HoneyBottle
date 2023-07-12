package com.likelion.honeyBottle.repository;


import com.likelion.honeyBottle.domain.HoneyPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PostRepository extends JpaRepository<HoneyPost, String> {
    @Override
    Optional<HoneyPost> findById(String s);
}
