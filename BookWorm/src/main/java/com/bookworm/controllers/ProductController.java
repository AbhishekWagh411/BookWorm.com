package com.bookworm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.dtos.ProductDto;
import com.bookworm.entities.Product;
import com.bookworm.services.IProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@PostMapping("/addProduct")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@GetMapping("/getProducts")
	public List<Product> getAllProducts(){
		
		List<Product> productList = productService.getAllProducts();
		return productList;
	}
	
	@GetMapping("/getProduct/{id}")
	public Optional<Product> getProductById(@PathVariable long id){
		
		Optional<Product> product = productService.getProductById(id);
		return product;
	}
	
	@GetMapping("/getProductByType/{typeId}/{langId}")
	public List<Product> getProductBytype(@PathVariable long typeId, @PathVariable long langId){
		List<Product> productList = productService.getProductsByType(typeId, langId);
		return productList;
	}
	
}
