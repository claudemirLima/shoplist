package com.shoplist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shoplist.entity.TypeItem;

@Repository
public interface TypeItemRepository extends  MongoRepository<TypeItem, String>{

}
