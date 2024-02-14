package com.bookworm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class ProductAttribute {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodAttId;
	@OneToOne
    @JoinColumn(name = "attribute_id")
    private AttributeMaster attribute;
    
    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;
    
    private String attributeValue;

	public int getProdAttId() {
		return prodAttId;
	}

	public void setProdAttId(int prodAttId) {
		this.prodAttId = prodAttId;
	}

	public AttributeMaster getAttribute() {
		return attribute;
	}

	public void setAttribute(AttributeMaster attribute) {
		this.attribute = attribute;
	}

	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	@Override
	public String toString() {
		return "ProductAttribute [prodAttId=" + prodAttId + ", attribute=" + attribute + ", product=" + product
				+ ", attributeValue=" + attributeValue + "]";
	}

    

}
