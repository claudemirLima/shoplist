package com.shoplist.service;

import java.util.List;

import com.shoplist.entity.ShopList;

public interface ShopListService {
	List<ShopList> findAll();
	ShopList save(ShopList entity);
}
