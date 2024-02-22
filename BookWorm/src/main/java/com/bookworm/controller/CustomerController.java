package com.bookworm.controllers;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entities.Customer;
import com.bookworm.entities.User;
import com.bookworm.security.JwtResponse;
import com.bookworm.services.CustomUserDetailsService;
import com.bookworm.services.CustomerManager;
import com.bookworm.services.JwtUtil;


@RestController  
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	CustomerManager manager;
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	@Autowired
	JwtUtil jwtUtil;
	
	@PostMapping(value = "api/SignUp")
	 public void addpro(@RequestBody Customer cust)
	 {
		System.out.println("addCustomer called");
		manager.addCustomer(cust);
	 }
	
	@PostMapping(value = "api/Login")
	public ResponseEntity<Customer> checkCustomer(@RequestBody User user1) {
		Customer customerResponse = manager.loginUser(user1.getEmail(), user1.getPassword());
		
		if(customerResponse!=null) {
			customUserDetailsService.setPassword(user1.getPassword());
//			UserDetails userDetails= customUserDetailsService.loadUserByUsername(user1.getEmail());
//			String token= jwtUtil.generateToken(userDetails, customerResponse);
			return ResponseEntity.ok(customerResponse);
		}
		else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}
	
	
}
