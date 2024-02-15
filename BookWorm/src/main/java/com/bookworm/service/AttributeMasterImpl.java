package com.bookworm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entity.AttributeMaster;
import com.bookworm.repository.AttributeMasterRepository;

@Service
public class AttributeMasterImpl implements AttributeMasterInterface
{
	
	@Autowired
	private  AttributeMasterRepository repository;
	@Override
	public List<AttributeMaster> getAllAttribute() {
		 return repository.findAll();
	}

	@Override
	public void addAttribute(AttributeMaster a) {
		 repository.save(a);
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public void update(AttributeMaster a,int id) {
		repository.update(a.getAttribute_desc(),id);
		
	}

}
