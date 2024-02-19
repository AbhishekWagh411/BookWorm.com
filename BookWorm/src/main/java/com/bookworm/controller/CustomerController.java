package com.bookworm.controller;

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

import com.bookworm.entity.Customer;
import com.bookworm.entity.User;
import com.bookworm.security.JwtResponse;
import com.bookworm.service.CustomUserDetailsService;
import com.bookworm.service.CustomerManager;
import com.bookworm.service.JwtUtil;


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
	public ResponseEntity<JwtResponse> checkCustomer(@RequestBody User user1) {
		Customer customerResponse = manager.loginUser(user1.getEmail(), user1.getPassword());
		
		if(customerResponse!=null) {
			customUserDetailsService.setPassword(user1.getPassword());
			UserDetails userDetails= customUserDetailsService.loadUserByUsername(user1.getEmail());
			String token= jwtUtil.generateToken(userDetails, customerResponse);
			return ResponseEntity.ok(new JwtResponse(token));
		}
		else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}
	
	
}
