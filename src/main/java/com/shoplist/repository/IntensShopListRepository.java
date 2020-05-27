package com.shoplist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shoplist.entity.ItensShopList;

@Repository
public interface IntensShopListRepository extends MongoRepository<ItensShopList, Integer>{
	
}
