package com.bookworm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import com.bookworm.entity.Customer;


public interface ICustomerRepository extends JpaRepository<Customer,Integer> 
{
	@Query(value = "SELECT * FROM Customer", nativeQuery = true)
	Customer loginUser();
}
