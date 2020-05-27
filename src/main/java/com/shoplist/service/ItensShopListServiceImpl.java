package com.shoplist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoplist.entity.ItensShopList;
import com.shoplist.repository.IntensShopListRepository;

@Service
public class ItensShopListServiceImpl implements ItensShopListService {
	
	@Autowired
	private IntensShopListRepository intensShopListRepository;
	
	@Override
	public List<ItensShopList> findAll() {
		return intensShopListRepository.findAll();
	}
	
	@Override
	public ItensShopList save(ItensShopList entity) {
		return intensShopListRepository.save(entity);
	}
	
}
