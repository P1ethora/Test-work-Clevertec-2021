package com.plethora.TestworkClevertec2021.repo;

import com.plethora.TestworkClevertec2021.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Long> {
}
