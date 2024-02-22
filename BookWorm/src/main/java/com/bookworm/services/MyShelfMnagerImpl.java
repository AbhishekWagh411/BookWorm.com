package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.Cart;
import com.bookworm.entities.MyShelf;
import com.bookworm.dao.MyShelfRepository;

@Service
public class MyShelfMnagerImpl implements MyShelfManager {

	@Autowired
	MyShelfRepository myShelfRepository;
	
	@Override
	public List<MyShelf> findallby() {
		
		return myShelfRepository.findAll();
	}

	@Override
	public List<MyShelf> getByCustomerId(long id) {
		 return myShelfRepository.getByCustomerId(id);
		
	}

	@Override
	public MyShelf addToShelf(MyShelf shelf) {
		return myShelfRepository.save(shelf);
	}

	@Override
	public List<MyShelf>geTransType(String tranType) {
		// TODO Auto-generated method stub
		return myShelfRepository.findBytranTypeStartsWith(tranType);
	}

	
	
}
