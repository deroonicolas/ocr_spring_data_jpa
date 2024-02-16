package com.openclassrooms.data.layer.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.data.layer.model.Comment;
 
 
@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {
 
	Iterable<Comment> findByContentContaining(String expression);
}
