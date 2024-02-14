package com.bookworm.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.bookworm.dao.ICustomerRepository;
import com.bookworm.entities.Customer;

@Service
public class CustomerManagerImpl implements CustomerManager
{
	@Autowired
	ICustomerRepository repository;

	@Override
	public void addCustomer(Customer c) {
		repository.save(c);
	}
	
	@Override
	public boolean loginUser(String email, String password) {
		boolean bool = false;
		List<Customer> customerList = repository.loginUser(email, password);
		for(Customer cust: customerList ) {
			if(cust.getemail().equals(email) && cust.getpassword().equals(password))
				bool = true;
		}
		return bool;
	}
		


}
