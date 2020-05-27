package com.shoplist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shoplist.entity.ShopList;

@Repository
public interface ShopListRepository extends MongoRepository<ShopList, Integer>{
	
}
