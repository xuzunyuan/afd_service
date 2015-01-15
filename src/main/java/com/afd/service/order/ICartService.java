package com.afd.service.order;

import java.util.List;

import com.afd.param.cart.Cart;

public interface ICartService {
	public List<Cart> showCart(String cookieCart, boolean isLogin,
			long userId, int source, boolean isBuyNow);
}
