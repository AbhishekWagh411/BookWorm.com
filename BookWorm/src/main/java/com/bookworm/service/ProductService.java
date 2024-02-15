package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entity.Product;
import com.bookworm.repository.IProductRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service 
public class ProductService implements IProductService {
	
	@Autowired
	private IProductRepository productRepo;

	@Override
	public void addProduct(Product product) {
		productRepo.save(product);
		System.out.println("Product Added: " + product);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Optional<Product> getProductById(long id) {
		Optional<Product> prod = productRepo.findById(id);
		if(!prod.isPresent())
			System.out.println("Product is Invalid");
		return prod;
	}
	
	@Override
	public List<Product> getProductsByType(long typeid, long langId) {
		return productRepo.getByTypeId(typeid, langId);
	}

}
