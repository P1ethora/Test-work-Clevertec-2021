package com.plethora.TestworkClevertec2021.repo;

import com.plethora.TestworkClevertec2021.model.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * связь с таблицей News в базе данных
 */
@Repository
public interface NewsRepo extends PagingAndSortingRepository<News,Long> {
}