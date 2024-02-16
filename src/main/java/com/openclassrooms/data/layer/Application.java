package com.openclassrooms.data.layer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openclassrooms.data.layer.model.Category;
import com.openclassrooms.data.layer.model.Comment;
import com.openclassrooms.data.layer.model.Product;
import com.openclassrooms.data.layer.service.CategoryService;
import com.openclassrooms.data.layer.service.CommentService;
import com.openclassrooms.data.layer.service.ProductService;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ProductService productService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private CategoryService categoryService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

//		Iterable<Product> products = productService.getProducts();
//		products.forEach(product -> System.out.println(product.getName()));
//		
//		Iterable<Category> categories = categoryService.getCategories();
//		categories.forEach(category -> System.out.println(category.getName()));
//		
//		Iterable<Comment> comments = commentService.getComments();
//		comments.forEach(comment -> System.out.println(comment.getContent()));
//		
//		Optional<Product> optProduct = productService.getProductById(1);
//		Product productId1 = optProduct.get();
//		System.out.println(productId1.getName());
//		
//		Optional<Category> optCategory = categoryService.getCategoryById(1);
//		Category categoryId1 = optCategory.get();
//		System.out.println(categoryId1.getName());
//		
//		Optional<Comment> optComment = commentService.getCommentById(1);
//		Comment commentId1 = optComment.get();
//		System.out.println(commentId1.getContent());

		// OneToMany
//		Optional<Product> optProduct = productService.getProductById(1);
//		Product productId1 = optProduct.get();
//
//		System.out.println(productId1.getName());
//
//		productId1.getComments().forEach(
//				comment -> System.out.println(comment.getContent()));
		
		// ManyToMany
//		Optional<Category> optCategory = categoryService.getCategoryById(1);
//		Category categoryId1 = optCategory.get();
//		
//		System.out.println("Nom Categorie : " + categoryId1.getName() + "\nProduits :");	
// 
//		categoryId1.getProducts().forEach(
//				product -> System.out.println(product.getName()));
//		
//		
//		Optional<Comment> optComment = commentService.getCommentById(1);
//		Comment commentId1 = optComment.get();
//		
//		System.out.println("\nCommentaire : " + commentId1.getContent());
//		System.out.println("Produit : " + commentId1.getProduct().getName());
		
		// Save
//		categoryService.getCategories().forEach(
//				category -> System.out.println(category.getName()));
//		
//		Category newCategory = new Category();
//		newCategory.setName("Promotion");
//		
//		newCategory = categoryService.saveCategory(newCategory);
//		
//		categoryService.getCategories().forEach(
//				category -> System.out.println(category.getName()));
//		
//		Product newProduct = new Product();
//		newProduct.setName("AssuranceAuTiersFidelite");
//		newProduct.setDescription("Les garanties de l'assurance au tiers à un prix moindre grâce à votre fidélité!");
//		newProduct.setCost(1100);
//		
//		newCategory.addProduct(newProduct);
//		
//		newProduct = productService.saveProduct(newProduct);
//		
//		productService.getProducts().forEach(
//				product -> System.out.println(product.getName()));
//
//		newProduct.getCategories().forEach(
//				category -> System.out.println(category.getName()));
//		
//		Comment newComment = new Comment();
//		newComment.setContent("Assurance extraordinaire!");
//		newProduct.addComment(newComment);
//
//		commentService.saveComment(newComment);
//		
//		Product productAssuranceAuTiers = productService.getProductById(1).get();	
//		Comment newComment2 = new Comment();
//		newComment.setContent("Assurance peu intéressante.");
//		productAssuranceAuTiers.addComment(newComment2);
//		
//		
//		Category newCategory2 = new Category();
//		newCategory.setName("-25ans");
//			
//		Product newProduct2 = new Product();
//		newProduct.setName("AssuranceAuTiers-25ans");
//		newProduct.setDescription("Assurance au tiers réservée aux conducteurs de -25 ans.");
//		newProduct.setCost(2000);
//			
//		newCategory.addProduct(newProduct2);
//		categoryService.saveCategory(newCategory2);
		
		// Update
//		Product existingProduct = productService.getProductById(1).get();
//		System.out.println(existingProduct.getCost());
//		
//		existingProduct.setCost(5000);
//		productService.saveProduct(existingProduct);
//		
//		existingProduct = productService.getProductById(1).get();
//		System.out.println(existingProduct.getCost());
		
		// Derived Queries
		Iterable<Product> searchResults = productService.getProductsByName("AssuranceTousRisques");
		searchResults.forEach(product -> System.out.println(product.getProductId()));
		
		searchResults = productService.findByCategoryName("Standard");
		searchResults.forEach(product -> System.out.println(product.getName()));



	}
}
