package com.plethora.TestworkClevertec2021.repo;

import com.plethora.TestworkClevertec2021.model.News;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


/**
 * связь с таблицей News в базе данных
 */
@Repository
public interface NewsRepo extends PagingAndSortingRepository<News,Long> {
}