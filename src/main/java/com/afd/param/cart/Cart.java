package com.afd.param.cart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.afd.constants.order.OrderConstants;

/**
 * 购物车展示类
 * @author wxp
 */
public class Cart implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2014294579537371352L;
	
	private Long brandShowId;
	private String storeName;
	private String logoUrl;
	private Long userId;
	private boolean selected;
	private boolean hasProdNormal;
	private List<CartItem> cartItems = new ArrayList<CartItem>();
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getBrandShowId() {
		return brandShowId;
	}

	public void setBrandShowId(Long brandShowId) {
		this.brandShowId = brandShowId;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public boolean isSelected() {
		boolean isSelect = true;
		if(this.cartItems != null && this.cartItems.size() > 0){
			for(CartItem cartItem : this.cartItems){
				if(cartItem.getStatusCode() != OrderConstants.CARTITEM_SUCCESS
						&& cartItem.getStatusCode() != OrderConstants.CARTITEM_SKU_LOWSTOCK
						&& cartItem.getStatusCode() != OrderConstants.CARTITEM_SHOW_EXCEED){
					continue;
				}
				if(!cartItem.isSelected()){
					isSelect = false;
					break;
				}
			}
		}
		
		return isSelect;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public boolean isHasProdNormal() {
		boolean hasProdNormal = false;
		if(this.cartItems != null && this.cartItems.size() > 0){
			for(CartItem cartItem : this.cartItems){
				if(cartItem.getStatusCode() == OrderConstants.CARTITEM_SUCCESS
						|| cartItem.getStatusCode() == OrderConstants.CARTITEM_SKU_LOWSTOCK
						|| cartItem.getStatusCode() == OrderConstants.CARTITEM_SHOW_EXCEED){
					hasProdNormal = true;
					break;
				}
			}
		}
		
		return hasProdNormal;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

}
