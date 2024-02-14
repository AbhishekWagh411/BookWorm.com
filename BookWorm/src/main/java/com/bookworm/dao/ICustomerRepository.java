package com.bookworm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bookworm.entities.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> 
{
	@Query(value = "SELECT * FROM Customer", nativeQuery = true)
	List<Customer> loginUser(@Param("email") String email, @Param("password")String password);
}
