package com.bookworm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InvoiceDetail {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invoice_detail_id;
	private int invoice_id;
	private int product_id;
	private int quantity;
	private double base_price;
	private double sale_price;
	private char transaction_type;
	private int rent_days;
	
	
	public int getInvoice_detail_id() {
		return invoice_detail_id;
	}
	public void setInvoice_detail_id(int invoice_detail_id) {
		this.invoice_detail_id = invoice_detail_id;
	}
	public int getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getBase_price() {
		return base_price;
	}
	public void setBase_price(double base_price) {
		this.base_price = base_price;
	}
	public double getSale_price() {
		return sale_price;
	}
	public void setSale_price(double sale_price) {
		this.sale_price = sale_price;
	}
	public char getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(char transaction_type) {
		this.transaction_type = transaction_type;
	}
	public int getRent_days() {
		return rent_days;
	}
	public void setRent_days(int rent_days) {
		this.rent_days = rent_days;
	}
}
