package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.MyShelf;

public interface MyShelfManager {

	Optional<MyShelf> getById(Long shelfId);

    public List<MyShelf> getByCustomerId(long id);
    
   public MyShelf addToShelf(MyShelf shelf);
}
