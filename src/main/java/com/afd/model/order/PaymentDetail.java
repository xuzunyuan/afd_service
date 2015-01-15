package com.afd.model.order;

import java.io.Serializable;

public class PaymentDetail implements Serializable{

	private static final long serialVersionUID = 2888424980934302288L;

	private Long pDetailId;

    private Long paymentId;

    private Long orderId;

    private Float amount;

    private Long userAccountId;

    private String paymentType;

    public Long getpDetailId() {
        return pDetailId;
    }

    public void setpDetailId(Long pDetailId) {
        this.pDetailId = pDetailId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }
}