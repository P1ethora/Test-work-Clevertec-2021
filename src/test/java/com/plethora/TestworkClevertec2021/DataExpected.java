package com.plethora.TestworkClevertec2021;

import com.plethora.TestworkClevertec2021.dto.*;
import com.plethora.TestworkClevertec2021.model.Comment;
import com.plethora.TestworkClevertec2021.model.News;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataExpected {

    public static Date date = new Date(1628174745000L);//Thu Aug 05 17:45:45 MSK 2021


    public static Comment comment1 = new Comment();
    public static Comment comment2 = new Comment();
    public static List<Comment> commentList = new ArrayList<>();
    public static News news = new News();
    public static NewsDto newsDto;

    public static List<CommentDto> commentDtoList = new ArrayList<>();
    public static ListOfComment listOfComment;
    public static CommentDto commentDto1;
    public static CommentDto commentDto2;

    public static NewsDtoTitle newsDtoTitle;

    public static List<News> newsList = new ArrayList<>();
    public static ListOfNewsTitle listOfNewsTitle;
    public static List<NewsDtoTitle> newsDtoTitles = new ArrayList<>();

    static {
        comment1.setText("Test comment1");
        comment1.setUsername("Test User1");
        comment1.setIdNews(1);
        comment1.setId(1);
        comment1.setDate(date);

        comment2.setText("Test comment2");
        comment2.setUsername("Test User2");
        comment2.setIdNews(1);
        comment2.setId(2);
        comment2.setDate(date);

        commentList.add(comment1);
        commentList.add(comment2);

        news.setText("Test text news");
        news.setComments(commentList);
        news.setId(1);
        news.setTitle("Test title news");
        news.setDate(date);

        commentDto1 = CommentDto.newBuilder()
                .setId(1)
                .setText("Test comment1")
                .setUsername("Test User1")
                .setDate(date.toString())
                .build();

        commentDto2 = CommentDto.newBuilder()
                .setId(2)
                .setText("Test comment2")
                .setUsername("Test User2")
                .setDate(date.toString())
                .build();

        commentDtoList.add(commentDto1);
        commentDtoList.add(commentDto2);


        listOfComment = ListOfComment.newBuilder()
                .addAllComments(commentDtoList)
                .build();

        newsDto = NewsDto.newBuilder()
                .setId(1)
                .setTitle("Test title news")
                .setText("Test text news")
                .setDate("Thu Aug 05 17:45:45 MSK 2021")
                .setListComment(listOfComment)
                .build();

        newsDtoTitle = NewsDtoTitle.newBuilder()
                .setId(1)
                .setTitle("Test title news")
                .setDate("Thu Aug 05 17:45:45 MSK 2021")
                .setSizeComments(2)
                .build();

        newsList.add(news);

        newsDtoTitles.add(newsDtoTitle);

        listOfNewsTitle = ListOfNewsTitle.newBuilder()
                .addAllNewsDtoTitles(newsDtoTitles)
                .build();
    }

}
