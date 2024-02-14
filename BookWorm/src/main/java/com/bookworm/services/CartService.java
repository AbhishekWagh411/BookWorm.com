package com.bookworm.services;


import java.util.List;

import com.bookworm.entities.Cart;
import com.bookworm.entities.Customer;

public interface CartService {

public Cart addToCart(Cart cart);
	
	public List<Cart> getAllCartList();
	
	public List<Cart> getCartByCustomerId(Customer id);
	
	public void deleteAll();

}
