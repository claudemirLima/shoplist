package com.shoplist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoplist.entity.TypeItem;
import com.shoplist.repository.TypeItemRepository;

@Service
public class TypeItemServiceImpl implements TypeItemService {
	
	@Autowired
	private TypeItemRepository typeItemRepository;
	
	@Override
	public List<TypeItem> findAll() {
		return typeItemRepository.findAll();
	}
	@Override
	public TypeItem insert(TypeItem typeItem) {
		return typeItemRepository.insert(typeItem);
	}
	
	public Optional<TypeItem> findById(String id) {
		return typeItemRepository.findById(id);
	}
}
