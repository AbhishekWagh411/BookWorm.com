package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.Product;

public interface IProductService {
	void addProduct(Product product);
	
	List<Product> getAllProducts();
	
	Optional<Product> getProductById(long id);
	
	List<Product> getProductsByType(long typeId, long lanId);
}
