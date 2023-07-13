package com.likelion.honeyBottle.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "post")
public class HoneyPost {
    @Id
    private String post_id;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    @Column(name = "date")
    @CreatedDate
    private LocalDateTime creatDate;

    @Column
    private String title;

    @Column()
    private String content;

    @Column(name = "image")
    private String imagePath;

    @Column(name = "category")
    private String category;

    @Column(name = "commentCount")
    private int commentCount;
//    @OneToMany(mappedBy = "post")
//    private List<Comment> comments = new ArrayList<>();
}
