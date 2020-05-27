package com.shoplist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoplist.entity.ShopList;
import com.shoplist.repository.ShopListRepository;

@Service
public class ShopListServiceImpl implements ShopListService {
	
	@Autowired
	private ShopListRepository shopListRepository;
	
	@Override
	public List<ShopList> findAll() {
		return shopListRepository.findAll();
	}
	
	@Override
	public ShopList save(ShopList entity) {
		return shopListRepository.save(entity);
	}
	
}
