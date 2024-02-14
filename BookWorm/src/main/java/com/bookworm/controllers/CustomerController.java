package com.bookworm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entities.Customer;
import com.bookworm.entities.User;
import com.bookworm.services.CustomerManager;

@RestController  
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	CustomerManager manager;
	
	
	@PostMapping(value = "api/SignUp")
	 public void addpro(@RequestBody Customer cust)
	 {
		System.out.println("addCustomer called");
		manager.addCustomer(cust);
	 }
	
	@PostMapping(value = "api/Login")
	public boolean checkCustomer(@RequestBody User user1) {
		return manager.loginUser(user1.getEmail(), user1.getPassword());
	}
	
	
}
