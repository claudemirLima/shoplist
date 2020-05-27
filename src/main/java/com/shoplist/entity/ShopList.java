package com.shoplist.entity;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Document(collection = "shop_list")
public class ShopList {
	
	@Id
	@JsonSerialize(using= ToStringSerializer.class)
	private ObjectId _id;
	private String name;
	private String description;
	private Date dataBuy;
	
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDataBuy(Date dataBuy) {
		this.dataBuy = dataBuy;
	}
	public Date getDataBuy() {
		return dataBuy;
	}
	
}
