/**
 * Copyright (c)2013-2014 by www.afd.com. All rights reserved.
 * 
 */
package com.afd.service.seller;

import com.afd.model.seller.Seller;

/**
 * 卖家服务接口
 * 
 * @author xuzunyuan
 * @date 2013年12月26日
 */
public interface ISellerService {
	// 根据登录ID取卖家信息
	public Seller getSellerByLoginId(int loginId);

	// 根据ID取卖家信息
	public Seller getSellerById(int sellerId);

	/**
	 * 更新卖家信息
	 * 
	 * @param seller
	 * @return 失败返回0
	 */
	public int updateSeller(Seller seller);
}
