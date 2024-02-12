package com.bookworm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.MyShelf;
import com.bookworm.service.MyShelfManager;

@RestController
@CrossOrigin("*")
public class MyShelfController {

	@Autowired
	MyShelfManager myShelfManager;
	
	@GetMapping("/getByID/{shelfId}")
	public Optional<MyShelf> getById(@PathVariable Long shelfId) {
		return myShelfManager.getById(shelfId);
	}

	@GetMapping("getByCustomerId/{id}")
	public List<MyShelf> getByCustomerId(@PathVariable long id) {
		return myShelfManager.getByCustomerId(id);
	}

	@PostMapping("/addToShelf")
	public Long addToShelf(@RequestBody MyShelf shelf) {
		return myShelfManager.addToShelf(shelf).getShelfId();
	}
}
