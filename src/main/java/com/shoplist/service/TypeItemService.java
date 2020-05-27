package com.shoplist.service;

import java.util.List;
import java.util.Optional;

import com.shoplist.entity.TypeItem;

public interface TypeItemService {
	List<TypeItem> findAll();
	TypeItem insert(TypeItem item);
	Optional<TypeItem> findById(String id);
}
