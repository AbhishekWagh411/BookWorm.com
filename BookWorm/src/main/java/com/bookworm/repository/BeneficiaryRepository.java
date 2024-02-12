package com.bookworm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookworm.entity.BeneficiaryMaster;

@Repository
public interface BeneficiaryRepository extends JpaRepository<BeneficiaryMaster, Long> {

	
}
