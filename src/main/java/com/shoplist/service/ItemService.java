package com.shoplist.service;

import java.util.List;

import com.shoplist.entity.Item;

public interface ItemService {
	List<Item> findAll();
	Item insert(Item item);
	List<Item> findByItemdAndTypeID(int itemId, int typeID);
}
