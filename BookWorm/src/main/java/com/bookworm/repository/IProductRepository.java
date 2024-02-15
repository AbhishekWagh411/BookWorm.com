package com.bookworm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bookworm.entity.Product;

import java.util.List;


@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
	
	/*
	 * @Query("Select p from Product p where p.Product_id = :id") Product
	 * getById(@Param("id") long id);
	 */
	
	@Query(value = "Select * from Product where Product.type_id= :type_id and Product.language_Id = :lang_id", nativeQuery = true)
	List<Product> getByTypeId(@Param("type_id") long typeId, @Param("lang_id") long langId);
}
    