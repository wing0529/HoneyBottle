package com.likelion.honeyBottle.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String comment_id;
    @Id
    @ManyToOne
    private Post post;
    @Column
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;
    @Column
    private String content;
}
