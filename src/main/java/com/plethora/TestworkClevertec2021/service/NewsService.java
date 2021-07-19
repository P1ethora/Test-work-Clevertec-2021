package com.plethora.TestworkClevertec2021.service;

import com.plethora.TestworkClevertec2021.dto.NewsDto;
import com.plethora.TestworkClevertec2021.model.News;
import com.plethora.TestworkClevertec2021.repo.NewsRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Date;


@Service
@AllArgsConstructor
public class NewsService {

    private final NewsRepo newsRepo;

    public News getNews(long newsId) {
        return newsRepo.findById(newsId).orElseThrow(NoSuchElementException::new);
    }

    public List<News> getAllPageableNews(Pageable pageable) {
        return newsRepo.findAll(pageable).toList();
    }

    public List<News> getAllNews() {
        return (List<News>) newsRepo.findAll();
    }

    public void addNews(NewsDto newsDto) {
        Date date = new Date();
        News news = new News();
        news.setText(newsDto.getText());
        news.setTitle(newsDto.getTitle());
        news.setDate(date);
        news.setComments(new ArrayList<>());
    newsRepo.save(news);
    }

    public void updateNews(NewsDto newsDto) {
        News news = getNews(newsDto.getId());
        news.setTitle(newsDto.getTitle());
        news.setText(newsDto.getText());
        newsRepo.save(news);
    }

    public void deleteNews(long newsId) {
        newsRepo.deleteById(newsId);
    }

}