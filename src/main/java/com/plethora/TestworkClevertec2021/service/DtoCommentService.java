package com.plethora.TestworkClevertec2021.service;

import com.plethora.TestworkClevertec2021.dto.CommentDto;
import com.plethora.TestworkClevertec2021.dto.ListOfComment;
import com.plethora.TestworkClevertec2021.model.Comment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис связанный с dto комментариев
 */
@Service
public class DtoCommentService {

    /**
     * создание proto dto на остове комментария
     * @param comment объект
     * @return proto dto
     */
    public CommentDto toDto(Comment comment) {
        return CommentDto.newBuilder()
                .setId(comment.getId())
                .setUsername(comment.getUsername())
                .setText(comment.getText())
                .setDate(comment.getDate().toString())
                .build();
    }

    /**
     * Прото объекта - список комментариев
     * @param comments список
     * @return proto списка комментариев
     */
    public ListOfComment toListOfComment(List<Comment> comments) {

        List<CommentDto> commentDtoList = new ArrayList<>();
        for (Comment comment : comments) {
            commentDtoList.add(toDto(comment));//используется метод toDto описанный выше
        }
        return ListOfComment.newBuilder()
                .addAllComments(commentDtoList)
                .build();
    }

}