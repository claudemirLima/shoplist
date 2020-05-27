package com.shoplist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.shoplist.entity.Item;

@Repository
public interface ItemRepository extends  MongoRepository<Item, String>{
	
	@Query(value = "{ '_id' : ?0, 'typeItem._id' : ?1 }", fields = "{ 'typeItem._id' : 1 }")
    List<Item> findByItemdAndTypeID(int itemId, int typeID);
}
