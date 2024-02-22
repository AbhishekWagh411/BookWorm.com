package com.bookworm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookworm.entities.BeneficiaryMaster;

@Repository
public interface BeneficiaryRepository extends JpaRepository<BeneficiaryMaster, Long> {

	
}
