/**
 * Copyright (c)2015-? by www.afd.com. All rights reserved.
 * 
 */
package com.afd.service.seller;

import java.util.List;

import com.afd.model.seller.SellerRetAddress;

/**
 * 卖家退货地址服务
 * 
 * @author xuzunyuan
 * @date 2015年2月28日
 */
public interface ISellerRetAddrService {
	public List<SellerRetAddress> getValidAddrListOfSeller(int sellerId);

	public SellerRetAddress getAddrById(int id);
}
