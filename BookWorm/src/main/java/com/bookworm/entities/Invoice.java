package com.bookworm.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Invoice {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invoice_id;
	private LocalDateTime invoice_date;
	private int customer_id;
	private double invoice_amount;
	
	public int getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}
	public LocalDateTime getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(LocalDateTime invoice_date) {
		this.invoice_date = invoice_date;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public double getInvoice_amount() {
		return invoice_amount;
	}
	public void setInvoice_amount(double invoice_amount) {
		this.invoice_amount = invoice_amount;
	}
}
