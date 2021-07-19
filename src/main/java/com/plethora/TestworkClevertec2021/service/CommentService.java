package com.plethora.TestworkClevertec2021.service;

import com.plethora.TestworkClevertec2021.model.Comment;
import com.plethora.TestworkClevertec2021.repo.CommentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentService {

    private final CommentRepo commentRepo;

    public void save(Comment comment) {
        commentRepo.save(comment);
    }

}