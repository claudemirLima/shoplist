package com.shoplist.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sholist.enuns.EnumTypeColumn;

@Document(collection = "database_sequences")
public class DatabaseSequence {

	@Id
    private Integer _id;
	@Transient
	private Integer typeSequenceColumn;
	@Transient
	private EnumTypeColumn enumTypeColumn; 
    private Integer seq;
    
    public void setTypeSequenceColumn(Integer typeSequenceColumn) {
		this.typeSequenceColumn = typeSequenceColumn;
	}
    public Integer getTypeSequenceColumn() {
    	typeSequenceColumn = enumTypeColumn.getCode();
		return typeSequenceColumn;
	}
    public void setEnumTypeColumn(EnumTypeColumn enumTypeColumn) {
		this.enumTypeColumn = enumTypeColumn;
	}
    public EnumTypeColumn getEnumTypeColumn() {
		return enumTypeColumn;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public Integer get_id() {
		return _id;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer  seq) {
		this.seq = seq;
	}
    
}
