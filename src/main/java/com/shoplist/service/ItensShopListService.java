package com.shoplist.service;

import java.util.List;

import com.shoplist.entity.ItensShopList;

public interface ItensShopListService {
	List<ItensShopList> findAll();
	ItensShopList save(ItensShopList entity);
}
