package com.bookworm.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class MyShelf {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shelfId;

    private int customerId;
   
    private int productId;
    
    private String tranType;
    private LocalDate  productExpiryDate;
    private boolean isActive;
    
	public Long getShelfId() {
		return shelfId;
	}
	public void setShelfId(Long shelfId) {
		this.shelfId = shelfId;
	}
	public int getProduct() {
		return productId;
	}
	public void setProduct(int productId) {
		this.productId = productId;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public LocalDate getProductExpiryDate() {
		return productExpiryDate;
	}
	public void setProductExpiryDate(LocalDate localDate) {
		this.productExpiryDate = localDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "MyShelf [shelfId=" + shelfId + ", customerId=" + customerId + ", productId=" + productId + ", tranType="
				+ tranType + ", productExpiryDate=" + productExpiryDate + ", isActive=" + isActive + "]";
	}
	

}
