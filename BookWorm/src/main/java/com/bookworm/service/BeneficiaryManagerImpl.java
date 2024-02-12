package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entity.BeneficiaryMaster;
import com.bookworm.repository.BeneficiaryRepository;

@Service
public class BeneficiaryManagerImpl implements BeneficiaryManager{
	
	@Autowired
	BeneficiaryRepository beneficiaryRepository;

	@Override
	public List<BeneficiaryMaster> getAllBeneficiary() {
		return beneficiaryRepository.findAll();
	}

	@Override
	public Optional<BeneficiaryMaster> getByBeneficiaryId(long id) {
		return beneficiaryRepository.findById(id);
	}

	@Override
	public BeneficiaryMaster addBeneficiary(BeneficiaryMaster benMaster) {
		return beneficiaryRepository.save(benMaster);
	}

	@Override
	public String updateBeneficiary(long id, BeneficiaryMaster benMaster) {

	
		Optional<BeneficiaryMaster> getBenMaster ;
		try {
			getBenMaster=beneficiaryRepository.findById(id);
			BeneficiaryMaster ben=getBenMaster.get();
			ben.setBenAccNo(benMaster.getBenAccNo());
			ben.setBenName(benMaster.getBenName());
			beneficiaryRepository.save(ben);
			return "updated";
		}
		catch (Exception e) {
			return "Not Exist";
		}
		
			
		
		
	}

}
