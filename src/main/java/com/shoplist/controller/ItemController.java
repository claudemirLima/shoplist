package com.shoplist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoplist.entity.Item;
import com.shoplist.service.ItemService;

@RestController
@RequestMapping(value = "/item")
public class ItemController {
	
	//@Autowired
	//sprivate SequenceGeneratorService sequenceGeneratorService;
	
	@Autowired
	private ItemService itemService;
	
	
	@GetMapping(value = "/allItens")
	public ResponseEntity<List<Item>> findAll() {
		return ResponseEntity.ok(itemService.findAll());
	}
	
	

	@PostMapping(value = "/insert")
	public ResponseEntity<Item> insert(@RequestBody Item item) {
		//item.set_id(sequenceGeneratorService.generateSequence(Item.SEQUENCE_NAME.getCode()));
		return ResponseEntity.ok(itemService.insert(item));
	}
	
	
}
