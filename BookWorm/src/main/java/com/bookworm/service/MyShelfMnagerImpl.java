package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entity.MyShelf;
import com.bookworm.repository.MyShelfRepository;

@Service
public class MyShelfMnagerImpl implements MyShelfManager {

	@Autowired
	MyShelfRepository myShelfRepository;
	
	@Override
	public Optional<MyShelf> getById(Long shelfId) {
		
		return myShelfRepository.findById(shelfId);
	}

	@Override
	public List<MyShelf> getByCustomerId(long id) {
		 return myShelfRepository.getByCustomerId(id);
		
	}

	@Override
	public MyShelf addToShelf(MyShelf shelf) {
		return myShelfRepository.save(shelf);
	}

	
}
