package com.openclassrooms.data.layer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.openclassrooms.data.layer.model.Category;
import com.openclassrooms.data.layer.model.Product;
import com.openclassrooms.data.layer.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Iterable<Product> getProducts() {
		return productRepository.findAll();
	}

	public Optional<Product> getProductById(Integer id) {
		return productRepository.findById(id);
	}

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public void deleteProductById(Integer id) {
		productRepository.deleteById(id);
	}

	public Iterable<Product> getProductsByName(String name) {
		return productRepository.findByName(name);
	}

	public Iterable<Product> getProductsByNameAndCost(String name, Integer cost) {
		return productRepository.findByNameAndCost(name, cost);
	}
	
	public Iterable<Product> findByCategoryName(String name) {
		return productRepository.findByCategoriesName(name);
	}
	
	public Iterable<Product> findByNameJPQL(String name) {
		return productRepository.findByNameJPQL(name);
	}
	
	public Iterable<Product> findByCostNative(Integer cost) {
		return productRepository.findByCostNative(cost);
	}
	
	public Iterable<Product> getProductsByCostLessThan(Integer cost) {
		return productRepository.findByCostLessThan(cost);
	}
}
