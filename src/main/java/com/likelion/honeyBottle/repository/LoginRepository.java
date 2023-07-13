package com.likelion.honeyBottle.repository;


import com.likelion.honeyBottle.domain.HoneyPost;
import com.likelion.honeyBottle.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface LoginRepository extends JpaRepository<User, String> {
    @Override
    Optional<User> findById(String s);
}
