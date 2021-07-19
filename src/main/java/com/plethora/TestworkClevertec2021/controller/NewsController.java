package com.plethora.TestworkClevertec2021.controller;

import com.plethora.TestworkClevertec2021.dto.NewsDto;
import com.plethora.TestworkClevertec2021.enumerated.ResponseType;
import com.plethora.TestworkClevertec2021.model.Comment;
import com.plethora.TestworkClevertec2021.model.News;
import com.plethora.TestworkClevertec2021.service.CommentService;
import com.plethora.TestworkClevertec2021.service.DtoNewsService;
import com.plethora.TestworkClevertec2021.service.NewsService;
import com.plethora.TestworkClevertec2021.util.ProtoUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/news")
@AllArgsConstructor
public class NewsController {

    private final NewsService newsService;
    private final DtoNewsService dtoNewsService;
    private final CommentService commentService;

    @GetMapping(path = "/{id}")
    public News getNews(@PathVariable int id) {
        try {
            return newsService.getNews(id);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
//TODO Доработать
//    @GetMapping
//    public List<News> getAllNews(@PageableDefault(page = 1, size = 5) Pageable pageable) {
//        return newsService.getAllNews(pageable);
//    }


    @GetMapping
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    //TODO Решить вапрос с NewsDto, возможно стоит принимать string
    @PostMapping()
    public ResponseEntity<?> addNews(@RequestBody NewsDto newsDto) {
        newsService.addNews(newsDto);
        return new ResponseEntity<>(ResponseType.ADDED, HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<ResponseType> updateNews(@RequestBody NewsDto newsDto) {
        try {
            newsService.updateNews(newsDto);
            return new ResponseEntity<>(ResponseType.UPDATED, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseType> deleteNews(@PathVariable int id) {
        newsService.deleteNews(id);
        return new ResponseEntity<>(ResponseType.DELETED, HttpStatus.OK);
    }
}