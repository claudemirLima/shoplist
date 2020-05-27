package com.shoplist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shoplist.entity.ItensShopList;
import com.shoplist.service.ItensShopListService;

@Component
public class ItensShopListController {
	
	
	@Autowired
	private ItensShopListService itensShopListService;
	
	public List<ItensShopList> findAll() {
		return itensShopListService.findAll();
	}
	
	
	
}
