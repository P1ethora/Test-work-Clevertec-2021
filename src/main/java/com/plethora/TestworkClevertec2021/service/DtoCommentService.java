package com.plethora.TestworkClevertec2021.service;

import com.plethora.TestworkClevertec2021.dto.CommentDto;
import com.plethora.TestworkClevertec2021.model.Comment;
import org.springframework.stereotype.Service;

@Service
public class DtoCommentService {

    public CommentDto toDto(Comment comment) {
        return CommentDto.newBuilder()
                .setId(comment.getId())
                .setUsername(comment.getUsername())
                .setText(comment.getText())
                .setDate(comment.getDate().toString())
                .build();
    }

}
