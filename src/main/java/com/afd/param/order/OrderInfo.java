package com.afd.param.order;

import java.io.Serializable;

import com.afd.model.order.Order;

public class OrderInfo implements Serializable {
	private static final long serialVersionUID = -761349533523103275L;
	private boolean success;
	private long storeId;
	private long code;
	private Order order;
	/**
	 * 是否创建订单成功
	 * @return
	 */
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public long getStoreId() {
		return storeId;
	}
	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}
	/**
	 * 如果订单创建成功，则是订单id
	 * 如果订单创建不成功，则是错误码
	 * @return
	 */
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

}
