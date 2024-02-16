package com.openclassrooms.data.layer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.data.layer.model.Category;
import com.openclassrooms.data.layer.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Iterable<Category> getCategories() {
		return categoryRepository.findAll();
	}
	
	public Optional<Category> getCategoryById(Integer id) {
		return categoryRepository.findById(id);
	}
	
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);		
	}
	
	public void deleteCategoryById(Integer id) {
		categoryRepository.deleteById(id);
	}
	
	public Iterable<Category> getCategoriesByName(String name) {
		return categoryRepository.findByName(name);
	}
	
	public Iterable<Category> getCategoriesByProductName(String name) {
		return categoryRepository.findByProductsName(name);
	}

}
