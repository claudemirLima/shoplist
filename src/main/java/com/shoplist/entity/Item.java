package com.shoplist.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.sholist.enuns.EnumTypeColumn;

@Document(collection = "item")
public class Item {
	
	@Transient
    public static final EnumTypeColumn SEQUENCE_NAME = EnumTypeColumn.ITEM;
	
	@Id
	@JsonSerialize(using= ToStringSerializer.class)
	private ObjectId _id;
	private String descript;
	private String name;
	@DBRef
	private TypeItem typeItem;
	
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public ObjectId get_id() {
		return _id;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public TypeItem getTypeItem() {
		return typeItem;
	}
	public void setTypeItem(TypeItem typeItem) {
		this.typeItem = typeItem;
	}
	
}
