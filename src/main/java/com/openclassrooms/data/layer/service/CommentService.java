package com.openclassrooms.data.layer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.data.layer.model.Category;
import com.openclassrooms.data.layer.model.Comment;
import com.openclassrooms.data.layer.repository.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	public Iterable<Comment> getComments() {
		return commentRepository.findAll();
	}
	
	public Optional<Comment> getCommentById(Integer id) {
		return commentRepository.findById(id);
	}
	
	public Comment saveComment(Comment comment) {
		return commentRepository.save(comment);		
	}
	
	public void deleteCommentById(Integer id) {
		commentRepository.deleteById(id);
	}
	
	public Iterable<Comment> getCommentsContaining(String expression) {
		return commentRepository.findByContentContaining(expression);
	}

}
