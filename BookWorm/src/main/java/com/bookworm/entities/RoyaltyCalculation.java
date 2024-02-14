package com.bookworm.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RoyaltyCalculation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int royalty_calculation_id;
	private int invoice_id;
	private int beneficiary_id;
	private LocalDateTime royalty_calculation_date;
	private int product_id;
	private int quantity;
	private char transaction_type;
	private double base_price;
	private double sale_price;
	private double royalty_on_base_price;
	
	
	public int getRoyalty_calculation_id() {
		return royalty_calculation_id;
	}
	public void setRoyalty_calculation_id(int royalty_calculation_id) {
		this.royalty_calculation_id = royalty_calculation_id;
	}
	public int getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}
	public int getBeneficiary_id() {
		return beneficiary_id;
	}
	public void setBeneficiary_id(int beneficiary_id) {
		this.beneficiary_id = beneficiary_id;
	}
	public LocalDateTime getRoyalty_calculation_date() {
		return royalty_calculation_date;
	}
	public void setRoyalty_calculation_date(LocalDateTime royalty_calculation_date) {
		this.royalty_calculation_date = royalty_calculation_date;
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
	public char getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(char transaction_type) {
		this.transaction_type = transaction_type;
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
	public double getRoyalty_on_base_price() {
		return royalty_on_base_price;
	}
	public void setRoyalty_on_base_price(double royalty_on_base_price) {
		this.royalty_on_base_price = royalty_on_base_price;
	}
	

}
