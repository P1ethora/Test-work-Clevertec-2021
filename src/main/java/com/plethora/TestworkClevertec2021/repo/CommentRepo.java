package com.plethora.TestworkClevertec2021.repo;

import com.plethora.TestworkClevertec2021.model.Comment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * связь с таблицей в базе данных Comment
 */
@Repository
public interface CommentRepo extends PagingAndSortingRepository<Comment,Long> {

    List<Comment> findAllByIdNews(long idNews, Pageable pageable);
}
