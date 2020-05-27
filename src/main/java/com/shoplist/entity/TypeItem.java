package com.shoplist.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.sholist.enuns.EnumTypeColumn;

@Document(collection =  "type_item")
public class TypeItem {
	
	@Transient
    public static final EnumTypeColumn SEQUENCE_NAME = EnumTypeColumn.TYPE_ITEM;
	
	@Id
	@JsonSerialize(using= ToStringSerializer.class)
	private ObjectId _id;
	private String descript;
	
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
	
	
}
