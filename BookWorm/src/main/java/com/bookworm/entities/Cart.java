package com.bookworm.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cartId;
	
@OneToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
private Product product;
@OneToOne(fetch = FetchType.EAGER, cascade =  CascadeType.ALL)
private Customer customer;
private int quantity;


public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@Override
public String toString() {
	return "Cart [cartId=" + cartId + ", product=" + product + ", customer=" + customer + ", quantity=" + quantity
			+ "]";
}



}
