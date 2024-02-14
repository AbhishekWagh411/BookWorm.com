package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.ProductAttribute;

public interface ProductAttributeService {


	 List<ProductAttribute> getAllProductAttributes();
	 Optional<ProductAttribute> getProductAttributeById(int id);
	 ProductAttribute createProductAttribute(ProductAttribute productAttribute) ;
	 void updateProductAttribute(int id, ProductAttribute updatedProductAttribute);
	 void deleteProductAttribute(int id);

}
