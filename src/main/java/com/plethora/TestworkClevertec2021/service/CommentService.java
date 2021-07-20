package com.plethora.TestworkClevertec2021.service;

import com.plethora.TestworkClevertec2021.dto.CommentDto;
import com.plethora.TestworkClevertec2021.model.Comment;
import com.plethora.TestworkClevertec2021.repo.CommentRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;

/**
 * Сервис обслуживающий запросы связанные с комментариями
 */
@Slf4j
@Service
@AllArgsConstructor
public class CommentService {

    private final CommentRepo commentRepo;

    /**
     * Изъятие из таблицы comment, комментариев по id новости включае постраничное представление
     * @param id новости
     * @param pageable от затроса
     * @return список комментариев согласно странице
     */
    public List<Comment> getListCommentByIdNews(long id,Pageable pageable){
        return commentRepo.findAllByIdNews(id,pageable);
    }

    /**
     * Обновление комментария
     * @param commentDto из запроса
     */
    public void updateComment(CommentDto commentDto) {
       Comment comment = commentRepo.findById(commentDto.getId()).orElse(null);
       comment.setText(commentDto.getText());
       commentRepo.save(comment);
        log.info("The comment " +commentDto.getId() +" has been updated");
    }

    /**
     * Добавление комментария
     * @param commentDto из запрося
     * @param idNews id новости из url запроса
     */
    public void addComment(CommentDto commentDto, long idNews) {
        Date date = new Date();
        Comment comment = new Comment();

        comment.setUsername(commentDto.getUsername());
        comment.setDate(date);
        comment.setIdNews(idNews);
        comment.setText(commentDto.getText());
        commentRepo.save(comment);
        log.info("A comment " + comment.getId() +" has been added");
    }

    /**
     * Удаление комментария
     * @param id комментария из url запроса
     */
    public void deleteComment(long id) {
        commentRepo.deleteById(id);
    }

}