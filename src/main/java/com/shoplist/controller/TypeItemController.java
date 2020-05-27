package com.shoplist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoplist.entity.TypeItem;
import com.shoplist.service.TypeItemService;

@RestController
@RequestMapping(value = "/typeItem")
public class TypeItemController {

	//@Autowired
	//private SequenceGeneratorService sequenceGeneratorService;

	@Autowired
	private TypeItemService typeItemService;

	@GetMapping(value = "/alltypes")
	public ResponseEntity<List<TypeItem>> findAll() {
		return ResponseEntity.ok(typeItemService.findAll());
	}

	@PostMapping(value = "/insert")
	public ResponseEntity<TypeItem> insert(@RequestBody TypeItem typeItem) {
		//typeItem.set_id(sequenceGeneratorService.generateSequence(TypeItem.SEQUENCE_NAME.getCode()));
		return ResponseEntity.ok(typeItemService.insert(typeItem));
	}

}
