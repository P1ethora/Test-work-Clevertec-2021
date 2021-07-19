package com.plethora.TestworkClevertec2021.service;

import com.plethora.TestworkClevertec2021.dto.CommentDto;
import com.plethora.TestworkClevertec2021.dto.ListOfComment;
import com.plethora.TestworkClevertec2021.dto.NewsDto;
import com.plethora.TestworkClevertec2021.model.Comment;
import com.plethora.TestworkClevertec2021.model.News;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class DtoNewsService {

    private final DtoCommentService dtoCommentService;
//TODO может дать сбой, не проверил
    public NewsDto toDto(News news) {

        return NewsDto.newBuilder()
                .setId(news.getId())
                .setText(news.getText())
                .setDate(news.getDate().toString())
                .setTitle(news.getTitle())
                .setComments(1, toListOfComment(news.getComments()))
                .build();
    }

    public ListOfComment toListOfComment(List<Comment> comments) {

        List<CommentDto> commentDtoList = new ArrayList<>();

        for (Comment comment : comments) {
            commentDtoList.add(dtoCommentService.toDto(comment));
        }

        return ListOfComment.newBuilder()
                .addAllComments(commentDtoList)
                .build();
    }

}