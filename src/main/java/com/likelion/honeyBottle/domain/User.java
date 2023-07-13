package com.likelion.honeyBottle.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id; // 유저 아이디

    @Column(nullable = false)
    private String id; // 별명?
    @Column(nullable = false)
    private String password;

    // 유효성 검사 구현 가능
//
//    @OneToMany(mappedBy = "user")
//    private List<HoneyPost> posts = new ArrayList<>();
//    @OneToMany(mappedBy = "user")
//    private List<Comment> comments = new ArrayList<>();
}
