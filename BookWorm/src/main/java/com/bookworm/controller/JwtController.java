package com.bookworm.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.dao.JwtRepository;
import com.bookworm.entities.Customer;
import com.bookworm.entities.User;
import com.bookworm.security.JwtResponse;
import com.bookworm.services.CustomUserDetailsService;
import com.bookworm.services.CustomerManager;
import com.bookworm.services.JwtUtil;

@RestController
@CrossOrigin("*")
public class JwtController 
{
	@Autowired
	CustomerManager manager;
	
	@Autowired
	private JwtUtil jwtutil;
	
//	@Autowired
//	private JwtRepository repository;
	
	@Autowired
	private CustomUserDetailsService customuserdetailsservice;
	
	@PostMapping("/public/token")
	public ResponseEntity<?> generateToken(@RequestBody User myuser)
	{
		Customer customerResponse = manager.loginUser(myuser.getEmail(), myuser.getPassword());
		try
		{
		System.out.println("inside token method");
		System.out.println(myuser);
//		boolean result=repository.findUser(myuser);
		
		customuserdetailsservice.setPassword(myuser.getPassword());
		UserDetails userdetails=customuserdetailsservice.loadUserByUsername(myuser.getEmail());
		String token=this.jwtutil.generateToken(userdetails , customerResponse);
		System.out.println("JWT "+token);
		return ResponseEntity.ok(new JwtResponse(token));
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
			return null;
		}
	}
}
