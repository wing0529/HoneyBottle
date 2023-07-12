package com.likelion.honeyBottle.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "Post")
public class HoneyPost {
    @Id
    private String post_id;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    @Column
    private String title;
    @Column
    private String content;
    @OneToMany(mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();
}
