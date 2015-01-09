package com.afd.model.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable{
    private Integer orderId;

    private String orderCode;

    private Integer userId;

    private String userName;

    private Date createdDate;

    private Integer sellerId;

    private String orderType;

    private String orderStatus;

    private Float prodFee;

    private String prodDiscountType;

    private Float prodDiscountFee;

    private Float deliverFee;

    private Float deliverDiscount;

    private BigDecimal orderFee;

    private String rName;

    private String rProvince;

    private String rCity;

    private String rCounty;

    private String rTown;

    private String rAddr;

    private String rMobile;

    private String rPhone;

    private String rEmail;

    private String rZipcode;

    private String orderSource;

    private String payType;

    private String payMode;

    private String payStatus;

    private Date payDate;

    private Byte logisticsCompa;

    private String logisticsName;

    private String awbNo;

    private Date sendTime;

    private String signedStatus;

    private String signedType;

    private Date signedTime;

    private String notSignedCause;

    private Date receiptDate;

    private String receiptType;

    private String receiptMode;

    private String createdByName;

    private String ywRemark;

    private String sellerRemark;

    private String userRemark;

    private Long sSAId;

    private Date cancelDate;

    private String cancelByName;

    private String cancelReason;

    private Date lastUpdateDate;

    private String lastUpdateByName;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Float getProdFee() {
        return prodFee;
    }

    public void setProdFee(Float prodFee) {
        this.prodFee = prodFee;
    }

    public String getProdDiscountType() {
        return prodDiscountType;
    }

    public void setProdDiscountType(String prodDiscountType) {
        this.prodDiscountType = prodDiscountType == null ? null : prodDiscountType.trim();
    }

    public Float getProdDiscountFee() {
        return prodDiscountFee;
    }

    public void setProdDiscountFee(Float prodDiscountFee) {
        this.prodDiscountFee = prodDiscountFee;
    }

    public Float getDeliverFee() {
        return deliverFee;
    }

    public void setDeliverFee(Float deliverFee) {
        this.deliverFee = deliverFee;
    }

    public Float getDeliverDiscount() {
        return deliverDiscount;
    }

    public void setDeliverDiscount(Float deliverDiscount) {
        this.deliverDiscount = deliverDiscount;
    }

    public BigDecimal getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(BigDecimal orderFee) {
        this.orderFee = orderFee;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrProvince() {
        return rProvince;
    }

    public void setrProvince(String rProvince) {
        this.rProvince = rProvince == null ? null : rProvince.trim();
    }

    public String getrCity() {
        return rCity;
    }

    public void setrCity(String rCity) {
        this.rCity = rCity == null ? null : rCity.trim();
    }

    public String getrCounty() {
        return rCounty;
    }

    public void setrCounty(String rCounty) {
        this.rCounty = rCounty == null ? null : rCounty.trim();
    }

    public String getrTown() {
        return rTown;
    }

    public void setrTown(String rTown) {
        this.rTown = rTown == null ? null : rTown.trim();
    }

    public String getrAddr() {
        return rAddr;
    }

    public void setrAddr(String rAddr) {
        this.rAddr = rAddr == null ? null : rAddr.trim();
    }

    public String getrMobile() {
        return rMobile;
    }

    public void setrMobile(String rMobile) {
        this.rMobile = rMobile == null ? null : rMobile.trim();
    }

    public String getrPhone() {
        return rPhone;
    }

    public void setrPhone(String rPhone) {
        this.rPhone = rPhone == null ? null : rPhone.trim();
    }

    public String getrEmail() {
        return rEmail;
    }

    public void setrEmail(String rEmail) {
        this.rEmail = rEmail == null ? null : rEmail.trim();
    }

    public String getrZipcode() {
        return rZipcode;
    }

    public void setrZipcode(String rZipcode) {
        this.rZipcode = rZipcode == null ? null : rZipcode.trim();
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode == null ? null : payMode.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Byte getLogisticsCompa() {
        return logisticsCompa;
    }

    public void setLogisticsCompa(Byte logisticsCompa) {
        this.logisticsCompa = logisticsCompa;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName == null ? null : logisticsName.trim();
    }

    public String getAwbNo() {
        return awbNo;
    }

    public void setAwbNo(String awbNo) {
        this.awbNo = awbNo == null ? null : awbNo.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getSignedStatus() {
        return signedStatus;
    }

    public void setSignedStatus(String signedStatus) {
        this.signedStatus = signedStatus == null ? null : signedStatus.trim();
    }

    public String getSignedType() {
        return signedType;
    }

    public void setSignedType(String signedType) {
        this.signedType = signedType == null ? null : signedType.trim();
    }

    public Date getSignedTime() {
        return signedTime;
    }

    public void setSignedTime(Date signedTime) {
        this.signedTime = signedTime;
    }

    public String getNotSignedCause() {
        return notSignedCause;
    }

    public void setNotSignedCause(String notSignedCause) {
        this.notSignedCause = notSignedCause == null ? null : notSignedCause.trim();
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType == null ? null : receiptType.trim();
    }

    public String getReceiptMode() {
        return receiptMode;
    }

    public void setReceiptMode(String receiptMode) {
        this.receiptMode = receiptMode == null ? null : receiptMode.trim();
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName == null ? null : createdByName.trim();
    }

    public String getYwRemark() {
        return ywRemark;
    }

    public void setYwRemark(String ywRemark) {
        this.ywRemark = ywRemark == null ? null : ywRemark.trim();
    }

    public String getSellerRemark() {
        return sellerRemark;
    }

    public void setSellerRemark(String sellerRemark) {
        this.sellerRemark = sellerRemark == null ? null : sellerRemark.trim();
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark == null ? null : userRemark.trim();
    }

    public Long getsSAId() {
        return sSAId;
    }

    public void setsSAId(Long sSAId) {
        this.sSAId = sSAId;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelByName() {
        return cancelByName;
    }

    public void setCancelByName(String cancelByName) {
        this.cancelByName = cancelByName == null ? null : cancelByName.trim();
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getLastUpdateByName() {
        return lastUpdateByName;
    }

    public void setLastUpdateByName(String lastUpdateByName) {
        this.lastUpdateByName = lastUpdateByName == null ? null : lastUpdateByName.trim();
    }
}