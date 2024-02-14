package com.bookworm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookworm.entities.Cart;
import com.bookworm.entities.Customer;

public interface CartRepository extends JpaRepository<Cart, Integer>
{
	List<Cart> findByCustomer(Customer customer);
}
