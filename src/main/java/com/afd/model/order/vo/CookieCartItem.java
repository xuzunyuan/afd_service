package com.afd.model.order.vo;

import java.io.Serializable;

public class CookieCartItem implements Serializable {
	// skuid
	private Long skuId;
	// 数量
	private Long num;
	// 是否选中
	private boolean selected;

	public Long getSkuId() {
		return skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public CartItem transferCartItem(){
		CartItem cartItem = new CartItem();
		cartItem.setNum(this.num);
		cartItem.setSkuId(this.skuId);
		cartItem.setSelected(this.selected);

		return cartItem;
	}

}
