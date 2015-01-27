/**
 * Copyright (c)2015-? by www.afd.com. All rights reserved.
 * 
 */
package com.afd.constants.seller;

/**
 * 卖家常量定义
 * 
 * @author xuzunyuan
 * @date 2015年1月23日
 */
public interface SellerConstants {
	public static interface SellerLogin$Status {
		public static final String INIT = "0"; // 已注册，但未完成申请
		public static final String NORAML = "1"; // 正常
		public static final String FREEZED = "F"; // 冻结
	}

	public static interface Seller$Status {
		// 目前只有正常状态
		public static final String NORAML = "1"; // 正常
	}

	public static interface Seller$IsPaidDeposit {
		public static final String UNCHARGE = "0"; // 未交费
		public static final String CHARGED = "1"; // 已交费
	}
}
