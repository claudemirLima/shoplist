package com.shoplist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoplist.entity.ShopList;
import com.shoplist.service.ShopListService;

@RestController(value = "/shopList")
public class ShopListController {
	
	@Autowired
	private ShopListService shopListService;
	
	
	@GetMapping(value = "/allList")
	public ResponseEntity<List<ShopList>> findAll() {
		return ResponseEntity.ok(shopListService.findAll());
	}
	
	

	@PostMapping(value = "/insert")
	public ResponseEntity<ShopList> insert(@RequestBody ShopList shopList) {
		return ResponseEntity.ok(shopListService.save(shopList));
	}
}
