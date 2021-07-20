package com.plethora.TestworkClevertec2021.controller;

import com.plethora.TestworkClevertec2021.dto.CommentDto;
import com.plethora.TestworkClevertec2021.enumerated.ResponseType;
import com.plethora.TestworkClevertec2021.model.Comment;
import com.plethora.TestworkClevertec2021.service.CommentService;
import com.plethora.TestworkClevertec2021.service.DtoCommentService;
import com.plethora.TestworkClevertec2021.util.ProtoUtil;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;


/**
 * Контроллер обрабатывающий запросы связанные с комментариями
 */
@RestController
@RequestMapping(path = "/news/{id}/comment")
@AllArgsConstructor
public class CommentController {

    private final CommentService commentService;
    private final DtoCommentService dtoCommentService;

    /**
     * Позволяет получить часть списка полученную из всех комментариев от конкретной новости,
     * путем деления на страницы через dtoCommentService. Если в request не будут заданы параметры
     * и номер страницы зададутся дефолтные значения.
     * @param id новости
     * @param pageable из request
     * @return Json из списка комментариев
     */
    @GetMapping
    public String getCommentsPageable(@PathVariable("id") long id, @PageableDefault(size = 5)Pageable pageable) {

        List<Comment> commentList = commentService.getListCommentByIdNews(id,pageable); //получаем часть комментариев
        return ProtoUtil.toJson(dtoCommentService.toListOfComment(commentList));//генерация Proto DTO и обращение в json
    }

    /**
     * Добавляет новый комментармий
     * @param id новости из url request
     * @param jsonComment тело запроса с json commentDto
     * @return произведенное действие и http статус
     */
    @PostMapping
    public ResponseEntity<?> addComment(@PathVariable("id") long id, @RequestBody String jsonComment) {
        CommentDto commentDto = ProtoUtil.toProto(jsonComment, CommentDto.getDefaultInstance());//генерация Proto DTO и обращение в json
        commentService.addComment(commentDto,id);//сохранение комментария
        return new ResponseEntity<>(ResponseType.ADDED, HttpStatus.CREATED);
    }

    /**
     * Обновляет комментарий
     * @param jsonComment json комментария
     * @param id новости из url request
     * @return произведенное действие и http статус
     */
    @PutMapping
    public ResponseEntity<ResponseType> updateComment(@RequestBody String jsonComment, @PathVariable String id) {
        try {
            CommentDto commentDto = ProtoUtil.toProto(jsonComment, CommentDto.getDefaultInstance());
            commentService.updateComment(commentDto);// обновление комментария
            return new ResponseEntity<>(ResponseType.UPDATED, HttpStatus.OK);
        } catch (
                NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    /**
     * Удаление комментария
     * @param id комментария из url request
     * @return произведенное действие и http статус
     */
    @DeleteMapping("/{idCom}")
    public ResponseEntity<ResponseType> deleteComment(@PathVariable("idCom") long id) {
        commentService.deleteComment(id); //удаление по id
        return new ResponseEntity<>(ResponseType.DELETED, HttpStatus.OK);
    }

}