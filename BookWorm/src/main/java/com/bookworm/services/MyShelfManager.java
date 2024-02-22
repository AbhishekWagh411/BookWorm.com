package com.bookworm.services;

import java.util.List;

import com.bookworm.entities.Cart;
import com.bookworm.entities.MyShelf;

public interface MyShelfManager {

	public List<MyShelf> findallby();

    public List<MyShelf> getByCustomerId(long id);
    
   public MyShelf addToShelf(MyShelf shelf);
   public List<MyShelf> geTransType(String tranType);
}
