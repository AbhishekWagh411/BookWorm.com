package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.BeneficiaryMaster;

public interface BeneficiaryManager {

	List<BeneficiaryMaster> getAllBeneficiary();
	Optional<BeneficiaryMaster> getByBeneficiaryId(long id);
	BeneficiaryMaster addBeneficiary(BeneficiaryMaster benMaster);
	
	String updateBeneficiary(long id ,BeneficiaryMaster benMaster );
	
}
