package com.codekul.spring.jpa.dto;

import com.codekul.spring.jpa.entity.Tutorial;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentRequestDto {
    private Long id;
    private String content;
    private Tutorial tutorial;
}
