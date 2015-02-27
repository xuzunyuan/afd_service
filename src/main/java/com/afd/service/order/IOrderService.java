package com.afd.service.order;

import java.util.List;
import java.util.Map;

import com.afd.common.mybatis.Page;
import com.afd.model.order.Order;
import com.afd.model.order.OrderItem;
import com.afd.param.cart.Trade;
import com.afd.param.order.OrderInfo;
import com.afd.param.order.OrderCondition;

public interface IOrderService {

	/**
	 * 根据订单号查询订单
	 * @param orderId
	 * @return
	 */
	public Order getOrderById(Long orderId);
	
	public List<Order> getOrdersByIds(Long[] orderIds);
	/**
	 * 根据订单id和用户id获取订单
	 * @param orderIds
	 * @param userId
	 * @return
	 */
	public List<Order> getOrdersByIdsAndUserId(Long[] orderIds,Long userId);
	
	/**
	 * 取消订单
	 * @param optName 操作人
	 * @param cancelReason 取消原因
	 * @param orderIds 订单id
	 * @return
	 */
	public int cancelOrderByIds(String optName, String cancelReason, Long... orderIds);
	
	/**
	 * 根据用户id获取订单列表
	 * @param userId
	 * @return
	 */
	public Page<Order> getOrdersByUserId(Long userId, Page<Order> page);
	
	/**
	 * 根据用户Id和订单状态取得订单列表
	 * @param userId
	 * @param status
	 * @return
	 */
	public Page<Order> getOrdersByUserIdAndStatus(Long userId, String status, Page<Order> page);
	
	/**
	 * 批量生成订单
	 * @param trades
	 * @return
	 * @throws Exception 
	 * @throws InventoryException 
	 */
	public List<OrderInfo> batchSaveOrders(List<Trade> trades) throws Exception;
	
	/**
	 * boss系统查询订单
	 * @param map
	 * @param page
	 * @return
	 */
	public Page<Order> queryOrderByCondition(Map<String, ?> map, Page<Order> page);
	
	/**
	 * 获取订单详情列表
	 * @param orderId 订单Id
	 * @return
	 */
	public List<OrderItem> getOrderItemsByOrderId(Integer orderId);
	
	/**
	 * 根据查询条件获取订单
	 * @param orderCondition
	 * @return
	 */
	public Page<Order> getOrdersByOrderConditon(OrderCondition orderCondition, Page<Order> page);

	/**
	 * 根据订单明细id获取订单明细
	 * @param orderItemId
	 * @return
	 */
	public OrderItem getOrderItemById(Long orderItemId);
}
