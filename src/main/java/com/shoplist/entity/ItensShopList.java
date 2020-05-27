package com.shoplist.entity;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "list_itens")
public class ItensShopList {
	
	@DBRef
	private ShopList shopList;
	@DBRef
	private Item item;
	private Integer quantity;
	private Double price;

	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public void setShopList(ShopList shopList) {
		this.shopList = shopList;
	}
	public ShopList getShopList() {
		return shopList;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
	
}
