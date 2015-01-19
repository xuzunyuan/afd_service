package com.afd.service.order;

import java.util.List;

import com.afd.model.order.Order;

public interface IOrderService {

	/**
	 * 根据订单号查询订单
	 * @param orderId
	 * @return
	 */
	public Order getOrderById(Long orderId);
	
	/**
	 * 根据订单id和用户id获取订单
	 * @param orderIds
	 * @param userId
	 * @return
	 */
	public List<Order> getOrdersByIdsAndUserId(Long[] orderIds,Long userId);
	
	/**
	 * 取消订单(boss系统取消订单)
	 * @param orderIds 订单id
	 * @param cancelReason 
	 * @param userId  用户id
	 * @return
	 */
	public int cancelOrderByBoss(List<Long> orderIds, String optName, String cancelReason);
	
	/**
	 * 根据用户id获取订单列表
	 * @param userId
	 * @return
	 */
	public List<Order> getOrdersByUserId(Long userId);
}
