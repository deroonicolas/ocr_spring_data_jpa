package com.openclassrooms.data.layer.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.data.layer.model.Category;
 
 
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
	
	public Iterable<Category> findByName(String name);
	public Iterable<Category> findByProductsName(String name);
 
}
