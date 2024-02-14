package com.bookworm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookworm.dao.CartRepository;
import com.bookworm.entities.Cart;
import com.bookworm.entities.Customer;

public class CartServiceImpl implements CartService
{
	@Autowired
	private CartRepository cartRepo;

	@Override
	public Cart addToCart(Cart cart) {
		return cartRepo.save(cart); 
	}

	@Override
	public List<Cart> getAllCartList() {
		return (List<Cart>) cartRepo.findAll();
	}

	@Override
	public List<Cart> getCartByCustomerId(Customer custObj) {
		return  cartRepo.findByCustomer(custObj);
		
	}


	@Override
	public void deleteAll() {
		cartRepo.deleteAll();
		
	}

}
