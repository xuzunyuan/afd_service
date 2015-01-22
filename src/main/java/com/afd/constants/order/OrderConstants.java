package com.afd.constants.order;

public interface OrderConstants {
/*************************************购物车常量*************************************/
	/**
	 * 购物车商品正常
	 */
	public static final long CARTITEM_SUCCESS = 0;
	/**
	 * 购物车为空
	 */
	public static final long CART_IS_EMPTY = -1;
	/**
	 * 购物车数据异常
	 */
	public static final long CART_DATA_EXCEPTION = -2;
	/**
	 * 购物商品数量异常
	 */
	public static final long CARTITEM_NUM_EXCEPTION = -3;
	/**
	 * 购物车商品sku为空
	 */
	public static final long CARTITEM_SKU_IS_NULL = -4;
	/**
	 * 购物商品sku状态异常
	 */
	public static final long CARTITEM_SKU_STATUS_UNNORMAL = -5;
	/**
	 * 购物商品异常
	 */
	public static final long CARTITEM_PROD_STATUS_UNNORMAL = -6;
	/**
	 * 商品无货
	 */
	public static final long CARTITEM_SKU_OUTOFSTOCK = -7;
	/**
	 * 商品库存不足
	 */
	public static final long CARTITEM_SKU_LOWSTOCK = -8;
	/**
	 * 店铺状态异常
	 */
	public static final long STORE_UNNORMAL = -9;
	/**
	 * 特卖商品超出购买数量
	 */
	public static final long CARTITEM_SHOW_EXCEED = -10;
	/**
	 * cookie中的购物车
	 */
	public static final String COOKIE_CART = "cart";
	/**
	 * 购物车中商品数量
	 */
	public static final String COOKIE_CART_COUNT = "cartCount";
	/**
	 * 服务器端的购物车
	 */
	public static final String SERVER_CART = "cart_";
	/**
	 * cookie中购物车有效期
	 */
	public static final int COOKIE_CART_PERIOD = 30*60;
	/**
	 * 商品在购物车中的排序
	 */
	public static final int CARTITEM_SORTWEIGHT_1 = 1;
	/**
	 * 商品在购物车中的排序
	 */
	public static final int CARTITEM_SORTWEIGHT_2 = 2;
	/**
	 * 商品在购物车中的排序
	 */
	public static final int CARTITEM_SORTWEIGHT_3 = 3;
	
/*************************************订单常量*************************************/
	/**
	 * 订单来源：网站
	 */
	public static final String ORDER_SOURCE_WEB = "1";
	/**
	 * 订单来源：电话
	 */
	public static final String ORDER_SOURCE_CC = "2";
	/**
	 * 订单来源：手机IOS
	 */
	public static final String ORDER_SOURCE_IOS = "3";
	/**
	 * 订单来源：手机安卓
	 */
	public static final String ORDER_SOURCE_ANDROID = "4";
	/**
	 * 订单类型：实物
	 */
	public static final String ORDER_TYPE_REAL = "0";
	/**
	 * 订单类型：O2O
	 */
	public static final String ORDER_TYPE_O2O = "1";
	/**
	 * 订单状态：待处理
	 */
	public static final String ORDER_STATUS_TOBEPROCESS = "1";
	/**
	 * 订单状态：等待支付
	 */
	public static final String ORDER_STATUS_WAITPAYMENT = "2";
	/**
	 * 订单状态：等待发货
	 */
	public static final String ORDER_STATUS_WAITDELIVERED = "3";
	/**
	 * 订单状态：已取消
	 */
	public static final String ORDER_STATUS_CANCELLED = "4";
	/**
	 * 订单状态：已发货
	 */
	public static final String ORDER_STATUS_DELIVERED = "5";
	/**
	 * 订单状态：配送失败
	 */
	public static final String ORDER_STATUS_DELIVERY_FAILURE = "6";
	/**
	 * 订单状态：拒收
	 */
	public static final String ORDER_STATUS_REJECT = "7";
	/**
	 * 订单状态：交易完成
	 */
	public static final String ORDER_STATUS_COMPLETED = "8";
	/**
	 * 订单状态：已退货
	 */
	public static final String ORDER_STATUS_RETURN = "9";
	/**
	 * 订单状态：待评论
	 */
	public static final String ORDER_STATUS_TOBECOMMENT = "c";
	/**
	 * 支付方式：货到付款
	 */
	public static final String PAY_TYPE_COD = "0";
	/**
	 * 订单状态：在线支付
	 */
	public static final String PAY_TYPE_ONLINE = "1";
	/**
	 * 支付模式：货到付款--现金
	 */
	public static final String PAY_MODE_COD_CASH = "00";
	/**
	 * 支付模式：货到付款--POS
	 */
	public static final String PAY_MODE_COD_POS = "01";
	/**
	 * 支付模式：支付宝
	 */
	public static final String PAY_MODE_APIPAY = "20";
	
	/**
	 * 支付模式：银联在线(到银联网关，不去具体银行网关)
	 */
	public static final String PAY_MODE_CHINAPAY = "1z";
	/**
	 * 支付状态：未支付
	 */
	public static final String PAY_STATUS_UNPAY = "1";
	/**
	 * 支付状态：已支付
	 */
	public static final String PAY_STATUS_PAYED = "2";
    /**
	 * 支付状态：支付中
	 */
	public static final String PAY_STATUS_PAYING = "3";
    /**
	 * 支付状态：支付失败
	 */
	public static final String PAY_STATUS_FAILURE = "4";
	/**
	 * 签收状态：未签收
	 */
	public static final String SIGNED_STATUS_UNSIGNED = "0";
	/**
	 * 签收状态：已签收
	 */
	public static final String SIGNED_STATUS_SIGNED = "1";
	/**
	 * 签收状态：拒收
	 */
	public static final String SIGNED_STATUS_REJECT = "2";
	/**
	 * 签收类型：本人签收
	 */
	public static final String SIGNED_TYPE_SELF = "0";
	/**
	 * 签收类型：系统签收
	 */
	public static final String SIGNED_TYPE_SYSTEM = "1";
	/**
	 * 签收类型：EMS签收
	 */
	public static final String SIGNED_TYPE_EMS = "2";
	/**
	 * 评论状态：已评论
	 */
	public static final String ORDERITEM_COMMENT_YES = "1";
	/**
	 * 评论状态：未评论
	 */
	public static final String ORDERITEM_COMMENT_NO = "0";
	/**
	 * 评论状态：已互评
	 */
	public static final String ORDERITEM_COMMENT_EACHOTHER = "2";
	/**
	 * 订单明细状态：正常
	 */
	public static final String ORDERITEM_STATUS_NORMAL = "1";
	/**
	 * 更改订单成功
	 */
	public static final int ORDER_UPDATE_SUCCESS = 0;
	/**
	 * 更改订单失败：订单不存在
	 */
	public static final int ORDER_UPDATE_ORDER_NOT_EXIST = -1;
	/**
	 * 更改订单失败：订单状态异常
	 */
	public static final int ORDER_UPDATE_ORDER_STATUS_UNNORMAL = -2;
	/**
	 * 更改订单失败：确认订单失败
	 */
	public static final int ORDER_UPDATE_FAILURE = -3;
}
