package com.plethora.TestworkClevertec2021.service;

import com.plethora.TestworkClevertec2021.dto.*;
import com.plethora.TestworkClevertec2021.model.Comment;
import com.plethora.TestworkClevertec2021.model.News;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис связанный с dto новостей
 */
@Slf4j
@Service
@AllArgsConstructor
public class DtoNewsService {

    private final DtoCommentService dtoCommentService;

    /**
     * Конвертация в proto dto новости, используется список комментариев из страницы
     * @param news новость
     * @param comments содержимое страницы комментариев данной новости
     * @return
     */
    public NewsDto toDtoNews(News news, List<Comment> comments) {
        log.info("Converting News " + news.getId() + " to DTO");
        return NewsDto.newBuilder()
                .setId(news.getId())
                .setText(news.getText())
                .setDate(news.getDate().toString())
                .setTitle(news.getTitle())
                .setListComment(dtoCommentService.toListOfComment(comments))//вызывается метод преобразования в proto список комментариев
                .build();
    }

    /**
     * Генерация proto dto заголовка новости
     * @param news новость
     * @return dto заголовка новости
     */
    public NewsDtoTitle toNewsDtoTitle(News news) {
        log.info("Converting News " + news.getId() + " to DTO title");
        return NewsDtoTitle.newBuilder()
                .setId(news.getId())
                .setDate(news.getDate().toString())//дата в proto представленна в виде строки
                .setTitle(news.getTitle())
                .setSizeComments(news.getComments().size())
                .build();
    }

    /**
     * Создание proto списка новостей
     * @param newsList список новостей
     * @return proto список новостей
     */
    public ListOfNewsTitle getListNewsDtoTitle(List<News> newsList) {
        log.info("Converting a news list to a proto list java");
        List<NewsDtoTitle> newsDtoTitles = new ArrayList<>();
        for (News news: newsList) {
            newsDtoTitles.add(toNewsDtoTitle(news));
        }

        return ListOfNewsTitle.newBuilder()
                .addAllNewsDtoTitles(newsDtoTitles)
                .build();
    }

}