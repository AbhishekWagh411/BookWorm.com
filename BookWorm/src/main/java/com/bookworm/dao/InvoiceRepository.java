package com.bookworm.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.bookworm.entities.Invoice;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface InvoiceRepository extends JpaRepository<Invoice , Long>{

	
	

	
}
