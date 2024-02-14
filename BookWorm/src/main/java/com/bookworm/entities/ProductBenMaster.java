package com.bookworm.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class ProductBenMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodBenId;
    private int  ProdBen_ben_id ;
    private int  ProdBen_product_id;
    private double  ProdBen_percentage ;
	public int getProdBenId() {
		return prodBenId;
	}
	public void setProdBenId(int prodBenId) {
		this.prodBenId = prodBenId;
	}
	public int getProdBen_ben_id() {
		return ProdBen_ben_id;
	}
	public void setProdBen_ben_id(int prodBen_ben_id) {
		ProdBen_ben_id = prodBen_ben_id;
	}
	public int getProdBen_product_id() {
		return ProdBen_product_id;
	}
	public void setProdBen_product_id(int prodBen_product_id) {
		ProdBen_product_id = prodBen_product_id;
	}
	public double getProdBen_percentage() {
		return ProdBen_percentage;
	}
	public void setProdBen_percentage(double prodBen_percentage) {
		ProdBen_percentage = prodBen_percentage;
	}
	@Override
	public String toString() {
		return "ProductBenMaster [prodBenId=" + prodBenId + ", ProdBen_ben_id=" + ProdBen_ben_id
				+ ", ProdBen_product_id=" + ProdBen_product_id + ", ProdBen_percentage=" + ProdBen_percentage + "]";
	}
   
    
    
    
    
	}
    
    
    
