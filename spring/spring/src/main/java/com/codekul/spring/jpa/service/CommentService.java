package com.codekul.spring.jpa.service;

import com.codekul.spring.jpa.dto.CommentRequestDto;
import com.codekul.spring.jpa.entity.Tutorial;

public interface CommentService {
    void saveComments(CommentRequestDto requestDto);

    Tutorial getCommentsByTutorialId(Long tutorialId);

    String updateComments(CommentRequestDto requestDto);

    String deleteComment(Long commentId);
}
