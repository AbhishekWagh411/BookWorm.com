package com.bookworm.service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import com.bookworm.entity.Customer;


public interface CustomerManager {
	void addCustomer(Customer c);
	Customer loginUser(String email, String password);
	
	/*List<Product> getProducts();
	void delete(int id);
	void update(Product product,int id);
	Optional<Product> getProduct(int id);
	List<Product> getSelected(String cat);*/
}
