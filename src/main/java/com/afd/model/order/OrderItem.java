package com.afd.model.order;

import java.util.Date;

public class OrderItem {
    private Integer paymentId;

    private Integer originPaymentId;

    private Date createDate;

    private Integer createId;

    private String userName;

    private String createByIp;

    private Float payAmount;

    private String payGw;

    private String status;

    private String type;

    private String tradeNo;

    private Date callbackDate;

    private String realPayGw;

    private Date realPayDate;

    private String paymentType;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getOriginPaymentId() {
        return originPaymentId;
    }

    public void setOriginPaymentId(Integer originPaymentId) {
        this.originPaymentId = originPaymentId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCreateByIp() {
        return createByIp;
    }

    public void setCreateByIp(String createByIp) {
        this.createByIp = createByIp == null ? null : createByIp.trim();
    }

    public Float getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Float payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayGw() {
        return payGw;
    }

    public void setPayGw(String payGw) {
        this.payGw = payGw == null ? null : payGw.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Date getCallbackDate() {
        return callbackDate;
    }

    public void setCallbackDate(Date callbackDate) {
        this.callbackDate = callbackDate;
    }

    public String getRealPayGw() {
        return realPayGw;
    }

    public void setRealPayGw(String realPayGw) {
        this.realPayGw = realPayGw == null ? null : realPayGw.trim();
    }

    public Date getRealPayDate() {
        return realPayDate;
    }

    public void setRealPayDate(Date realPayDate) {
        this.realPayDate = realPayDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }
}