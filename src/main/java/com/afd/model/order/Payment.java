package com.afd.model.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Payment implements Serializable {

	private static final long serialVersionUID = -7630333094949105836L;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.PAYMENT_ID
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private Long paymentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.ORIGIN_PAYMENT_ID
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private Long originPaymentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.CREATE_DATE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private Date createDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.USER_ID
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.USER_NAME
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.CREATE_BY_IP
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private String createByIp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.PAY_AMOUNT
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private BigDecimal payAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.PAY_GW
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private String payGw;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.STATUS
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.TYPE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private String type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.TRADE_NO
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private String tradeNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.CALLBACK_DATE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private Date callbackDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.REAL_PAY_GW
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private String realPayGw;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.REAL_PAY_DATE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private Date realPayDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PAYMENT.PAYMENT_TYPE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	private String paymentType;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.PAYMENT_ID
	 * @return  the value of T_PAYMENT.PAYMENT_ID
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public Long getPaymentId() {
		return paymentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.PAYMENT_ID
	 * @param paymentId  the value for T_PAYMENT.PAYMENT_ID
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.ORIGIN_PAYMENT_ID
	 * @return  the value of T_PAYMENT.ORIGIN_PAYMENT_ID
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public Long getOriginPaymentId() {
		return originPaymentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.ORIGIN_PAYMENT_ID
	 * @param originPaymentId  the value for T_PAYMENT.ORIGIN_PAYMENT_ID
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setOriginPaymentId(Long originPaymentId) {
		this.originPaymentId = originPaymentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.CREATE_DATE
	 * @return  the value of T_PAYMENT.CREATE_DATE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.CREATE_DATE
	 * @param createDate  the value for T_PAYMENT.CREATE_DATE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.USER_ID
	 * @return  the value of T_PAYMENT.USER_ID
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.USER_ID
	 * @param userId  the value for T_PAYMENT.USER_ID
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.USER_NAME
	 * @return  the value of T_PAYMENT.USER_NAME
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.USER_NAME
	 * @param userName  the value for T_PAYMENT.USER_NAME
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.CREATE_BY_IP
	 * @return  the value of T_PAYMENT.CREATE_BY_IP
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public String getCreateByIp() {
		return createByIp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.CREATE_BY_IP
	 * @param createByIp  the value for T_PAYMENT.CREATE_BY_IP
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setCreateByIp(String createByIp) {
		this.createByIp = createByIp == null ? null : createByIp.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.PAY_AMOUNT
	 * @return  the value of T_PAYMENT.PAY_AMOUNT
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public BigDecimal getPayAmount() {
		return payAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.PAY_AMOUNT
	 * @param payAmount  the value for T_PAYMENT.PAY_AMOUNT
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.PAY_GW
	 * @return  the value of T_PAYMENT.PAY_GW
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public String getPayGw() {
		return payGw;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.PAY_GW
	 * @param payGw  the value for T_PAYMENT.PAY_GW
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setPayGw(String payGw) {
		this.payGw = payGw == null ? null : payGw.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.STATUS
	 * @return  the value of T_PAYMENT.STATUS
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.STATUS
	 * @param status  the value for T_PAYMENT.STATUS
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.TYPE
	 * @return  the value of T_PAYMENT.TYPE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.TYPE
	 * @param type  the value for T_PAYMENT.TYPE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.TRADE_NO
	 * @return  the value of T_PAYMENT.TRADE_NO
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public String getTradeNo() {
		return tradeNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.TRADE_NO
	 * @param tradeNo  the value for T_PAYMENT.TRADE_NO
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo == null ? null : tradeNo.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.CALLBACK_DATE
	 * @return  the value of T_PAYMENT.CALLBACK_DATE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public Date getCallbackDate() {
		return callbackDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.CALLBACK_DATE
	 * @param callbackDate  the value for T_PAYMENT.CALLBACK_DATE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setCallbackDate(Date callbackDate) {
		this.callbackDate = callbackDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.REAL_PAY_GW
	 * @return  the value of T_PAYMENT.REAL_PAY_GW
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public String getRealPayGw() {
		return realPayGw;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.REAL_PAY_GW
	 * @param realPayGw  the value for T_PAYMENT.REAL_PAY_GW
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setRealPayGw(String realPayGw) {
		this.realPayGw = realPayGw == null ? null : realPayGw.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.REAL_PAY_DATE
	 * @return  the value of T_PAYMENT.REAL_PAY_DATE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public Date getRealPayDate() {
		return realPayDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.REAL_PAY_DATE
	 * @param realPayDate  the value for T_PAYMENT.REAL_PAY_DATE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setRealPayDate(Date realPayDate) {
		this.realPayDate = realPayDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PAYMENT.PAYMENT_TYPE
	 * @return  the value of T_PAYMENT.PAYMENT_TYPE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PAYMENT.PAYMENT_TYPE
	 * @param paymentType  the value for T_PAYMENT.PAYMENT_TYPE
	 * @mbggenerated  Wed Aug 13 17:39:22 CST 2014
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType == null ? null : paymentType.trim();
	}
}