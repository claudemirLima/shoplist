package com.sholist.enuns;
/*
 * Enum
 * 
 */
public enum EnumTypeColumn {
	
	TYPE_ITEM("type_item",1),
	ITEM("type_item",2);
	
	private String name;
	private Integer code;
	
	private EnumTypeColumn(String name,Integer code) {
		this.code = code;
		this.name = name;
	}
	public Integer getCode() {
		return code;
	}
	
	public static EnumTypeColumn find(Integer code) {
		for(EnumTypeColumn item : EnumTypeColumn.values()) {
			if(item.code.equals(code)) {
				return item;
			}
		}
		return null;
	}
	
	
}
