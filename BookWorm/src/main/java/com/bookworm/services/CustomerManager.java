package com.bookworm.services;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bookworm.entities.Customer;

public interface CustomerManager {
	void addCustomer(Customer c);
	boolean loginUser(String email, String password);
	
	/*List<Product> getProducts();
	void delete(int id);
	void update(Product product,int id);
	Optional<Product> getProduct(int id);
	List<Product> getSelected(String cat);*/
}
