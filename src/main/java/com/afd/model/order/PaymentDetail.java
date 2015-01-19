package com.afd.model.order;

public class PaymentDetail {
    private Integer pDetailId;

    private Integer paymentId;

    private Integer orderId;

    private Float amount;

    private Integer userAccountId;

    private String paymentType;

    public Integer getpDetailId() {
        return pDetailId;
    }

    public void setpDetailId(Integer pDetailId) {
        this.pDetailId = pDetailId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Integer getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Integer userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }
}