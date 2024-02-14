package com.bookworm.services;

import com.bookworm.entities.Product;
import java.util.List;
import java.util.Optional;

public interface IProductService {
	void addProduct(Product product);
	
	List<Product> getAllProducts();
	
	Optional<Product> getProductById(long id);
	
	List<Product> getProductsByType(long typeId, long lanId);
}
