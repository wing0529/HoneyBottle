package com.likelion.honeyBottle.domain.Dto;

import com.likelion.honeyBottle.domain.Comment;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class PostDto {
    private String post_id;
    private String title;
    private String content;
    private List<Comment> comments;
}
