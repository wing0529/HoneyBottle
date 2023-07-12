package com.likelion.honeyBottle.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class RecruitPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String comment_id;
    @Id
    @ManyToOne
    private HoneyPost post;
    //    @Column // 생략?
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;
    @Column
    private String content;
}