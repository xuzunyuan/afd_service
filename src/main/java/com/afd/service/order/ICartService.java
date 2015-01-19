package com.afd.service.order;

import java.util.List;
import java.util.Set;

import com.afd.param.cart.Cart;
import com.afd.param.cart.CartItem;

public interface ICartService {
	public List<Cart> showCart(String cookieCart, boolean isLogin,
			long userId, int source, boolean isBuyNow);
	
	
	/**
	 * 
	 * @param cookieCart
	 * @param bsDetailId
	 * @param newQuantity
	 * @param oldQuantity
	 * @param isLogin
	 * @param userId
	 * @param source
	 * @param isBuyNow
	 * @return
	 */
	public List<CartItem> modifyQuantity(String cookieCart, long bsDetailId, long newQuantity, 
			long oldQuantity, boolean isLogin, long userId, int source, boolean isBuyNow);
	
	/**
	 * 
	 * @param cookieCart
	 * @param bsDetailIds
	 * @param isLogin
	 * @param userId
	 * @return
	 */
	public List<CartItem> deleteCartItems(String cookieCart,Set<Long> bsDetailIds, boolean isLogin, long userId);

	/**
	 * 
	 * @param cookieCart
	 * @param isLogin
	 * @param userId
	 * @param source
	 * @return
	 */
	public List<CartItem> clearFailureProduct(String cookieCart, boolean isLogin, long userId, int source);

	/**
	 * 过滤选中的商品
	 * 
	 * @param cartItems
	 */
	public List<CartItem> filterSelectedCart(List<CartItem> cartItems);

	/**
	 * 
	 * @param cartItems
	 * @param source
	 * @param isLogin
	 * @param userId
	 * @return
	 */
	public boolean hasErrorOnSelectedCart(List<CartItem> cartItems, int source,
			boolean isLogin, long userId);

	/**
	 * 
	 * @param cookieCart
	 * @param bsDetailIds
	 * @param checked
	 * @param isLogin
	 * @param userId
	 * @return
	 */
	public List<CartItem> chgChecked(String cookieCart, Set<Long> bsDetailIds,
			boolean checked, boolean isLogin, long userId);
}
