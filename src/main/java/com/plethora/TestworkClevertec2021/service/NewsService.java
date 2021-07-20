package com.plethora.TestworkClevertec2021.service;

import com.plethora.TestworkClevertec2021.dto.NewsDto;
import com.plethora.TestworkClevertec2021.model.News;
import com.plethora.TestworkClevertec2021.repo.NewsRepo;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.apache.lucene.search.Query;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.FullTextQuery;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Date;

/**
 * Сервис обрабатывающий запросы связанные с новостями
 */
@Service
@AllArgsConstructor
public class NewsService {

    private final NewsRepo newsRepo;
    private final EntityManagerFactory emf;

    /**
     * Получить новость по её id
     *
     * @param newsId id новости
     * @return возвращает новость
     */
    public News getNews(long newsId) {
        return newsRepo.findById(newsId).orElseThrow(NoSuchElementException::new);
    }

    /**
     * Позволяет получить список новостей с постраничным представлением
     *
     * @param pageable из запроса
     * @return список новостей
     */
    public List<News> getAllPageableNews(Pageable pageable) {
        return newsRepo.findAll(pageable).toList();
    }


//    public List<News> getAllNews() {
//        return (List<News>) newsRepo.findAll();
//    }

    /**
     * Добавление новости
     *
     * @param newsDto proto dto новости
     */
    public void addNews(NewsDto newsDto) {
        Date date = new Date();
        News news = new News();
        news.setText(newsDto.getText());
        news.setTitle(newsDto.getTitle());
        news.setDate(date);
        news.setComments(new ArrayList<>());
        newsRepo.save(news);
    }

    /**
     * Обновление новости
     *
     * @param newsDto dto новости
     */
    public void updateNews(NewsDto newsDto) {
        News news = getNews(newsDto.getId());
        news.setTitle(newsDto.getTitle());
        news.setText(newsDto.getText());
        newsRepo.save(news);
    }

    /**
     * Удаление новости
     *
     * @param newsId id новости
     */
    public void deleteNews(long newsId) {
        newsRepo.deleteById(newsId);
    }

    /**
     * Поиск
     *
     * @param keyword введенный текст
     * @return найденные новости
     */

    @SneakyThrows
    public List<News> search(String keyword, String param) {

        if (param.equals("text") || param.equals("title")) {
            EntityManager em = emf.createEntityManager();
            FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(em);
            fullTextEntityManager.createIndexer().startAndWait();

            Query query = getQuery(getQueryBuilder(fullTextEntityManager),param,keyword);

            FullTextQuery jpaQuery
                    = fullTextEntityManager.createFullTextQuery(query, News.class);


            return jpaQuery.getResultList();
        } else {
            return null;
        }
    }

    private QueryBuilder getQueryBuilder(FullTextEntityManager fullTextEntityManager) {
        return fullTextEntityManager.getSearchFactory()
                .buildQueryBuilder()
                .forEntity(News.class)
                .get();
    }

    private Query getQuery(QueryBuilder queryBuilder, String param, String keyword) {
        return queryBuilder
                .keyword()
                .onField(param)
                .matching(keyword)
                .createQuery();
    }


}