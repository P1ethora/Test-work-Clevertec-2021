package com.plethora.TestworkClevertec2021.service;


import com.plethora.TestworkClevertec2021.DataExpected;
import com.plethora.TestworkClevertec2021.dto.NewsDto;
import com.plethora.TestworkClevertec2021.model.Comment;
import com.plethora.TestworkClevertec2021.model.News;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest(classes = {DtoNewsService.class, DtoCommentService.class})
class DtoNewsServiceTest {

    @Autowired
    public DtoNewsService dtoNewsService;


    @Test
    void toDtoNews() {
        News news = DataExpected.news;
        List<Comment> commentList = DataExpected.commentList;

        NewsDto expected = DataExpected.newsDto;
        NewsDto actual = dtoNewsService.toDtoNews(news, commentList);

        Assertions.assertEquals(expected, actual);
    }
//
//    @Test
//    void toNewsDtoTitle() {
//    }
//
//    @Test
//    void getListNewsDtoTitle() {
//    }
}