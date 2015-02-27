package com.afd.service.order;

import com.afd.common.mybatis.Page;
import com.afd.model.order.ReturnOrder;

public interface IRetOrderService {
	/**
	 * 根据用户id获取退货订单
	 * @param userId
	 * @return
	 */
	public Page<ReturnOrder> getRetOrdersByUserId(long userId,Page<ReturnOrder> page);

	/**
	 * 生成退货单
	 * @param retOrder
	 */
	public int addRetOrder(ReturnOrder retOrder);
		
	public ReturnOrder getRetOrderByRetOrderId(Long retOrderId);
	
	/**
	 * 买家取消退货单
	 * @param retOrderId
	 * @param uid
	 */
	public int cancelRetOrderById(Long retOrderId, Long uid);
}
