package com.afd.common.util;

import java.util.ArrayList;
import java.util.List;

import com.afd.param.cart.Cart;
import com.afd.param.cart.CartItem;
import com.afd.param.cart.CookieCartItem;

public final class CartTransferUtils {
	private CartTransferUtils(){}
	public static List<CookieCartItem> cartToCookieCartItems(List<Cart> carts){
		List<CookieCartItem> cookieCartItems = null;
		if(carts != null && carts.size() > 0){
			cookieCartItems = new ArrayList<CookieCartItem>();
			for(Cart cart : carts){
				cookieCartItems.addAll(cartItemsToCookieCartItems(cart.getCartItems()));
			}
		}
		
		return cookieCartItems;
	}
	
	public static List<CookieCartItem> cartItemsToCookieCartItems(List<CartItem> cartItems){
		List<CookieCartItem> cookieCartItems = new ArrayList<CookieCartItem>();
		if(cartItems != null && cartItems.size() > 0){
			for(CartItem cartItem : cartItems){
				cookieCartItems.add(cartItem.transferCookieCartItem());
			}
		}
		return cookieCartItems;
	}
	
	public static List<CartItem> cookieCartToCartItem(List<CookieCartItem> cookieCartItems){
		List<CartItem> cartItems = null;
		if(cookieCartItems != null && cookieCartItems.size() > 0){
			cartItems = new ArrayList<CartItem>();
			for(CookieCartItem cookieCartItem : cookieCartItems){
				cartItems.add(cookieCartItem.transferCartItem());
			}
		}
		return cartItems;
	}
}
