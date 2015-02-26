package com.afd.service.order;

import java.util.List;

import com.afd.model.order.ReturnOrder;

public interface IRetOrderService {
	/**
	 * 根据用户id获取退货订单
	 * @param userId
	 * @return
	 */
	public List<ReturnOrder> getRetOrdersByUserId(long userId);

	/**
	 * 生成退货单
	 * @param retOrder
	 */
	public int addRetOrder(ReturnOrder retOrder);
	
	
	public ReturnOrder getRetOrderByRetOrderId(Integer retOrderId);
}
