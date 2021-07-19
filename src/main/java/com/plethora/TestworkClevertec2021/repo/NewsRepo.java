package com.plethora.TestworkClevertec2021.repo;

import com.plethora.TestworkClevertec2021.model.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * связь с таблицей в базе данных News
 */
@Repository
public interface NewsRepo extends PagingAndSortingRepository<News,Long> {


    @Query(value = "SELECT u FROM News u WHERE u.text LIKE '%' || :keyword || '%'", nativeQuery = true)
    List<News> search(String keyword);

    List<News> findAllByTextContains(String text);
}