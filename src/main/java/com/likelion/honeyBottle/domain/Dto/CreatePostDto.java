package com.likelion.honeyBottle.domain.Dto;

import com.likelion.honeyBottle.domain.User;
import lombok.*;


@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class CreatePostDto {
    private String title;
    private String content;
    private User user;
}
