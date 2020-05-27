package com.shoplist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoplist.entity.Item;
import com.shoplist.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}
	@Override
	public Item insert(Item item) {
		return itemRepository.insert(item);
	}
	
	@Override
	public List<Item> findByItemdAndTypeID(int itemId, int typeID) {
		return itemRepository.findByItemdAndTypeID(itemId, typeID);
	}
}
