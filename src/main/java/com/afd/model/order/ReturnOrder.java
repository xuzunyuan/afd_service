package com.afd.model.order;

import java.util.Date;

public class ReturnOrder {
    private Integer retOrderId;

    private String retOrderCode;

    private Integer orderId;

    private Integer sellerId;

    private Integer userId;

    private String returnType;

    private String returnReason;

    private String evidencePicUrl;

    private String status;

    private Date createDate;

    private String createIp;

    private String logisticsCode;

    private Byte logisticsCompId;

    private String logisticsCompName;

    private Date auditDit;

    private String auditByName;

    private String rejectReason;

    private String remarks;

    public Integer getRetOrderId() {
        return retOrderId;
    }

    public void setRetOrderId(Integer retOrderId) {
        this.retOrderId = retOrderId;
    }

    public String getRetOrderCode() {
        return retOrderCode;
    }

    public void setRetOrderCode(String retOrderCode) {
        this.retOrderCode = retOrderCode == null ? null : retOrderCode.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType == null ? null : returnType.trim();
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason == null ? null : returnReason.trim();
    }

    public String getEvidencePicUrl() {
        return evidencePicUrl;
    }

    public void setEvidencePicUrl(String evidencePicUrl) {
        this.evidencePicUrl = evidencePicUrl == null ? null : evidencePicUrl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode == null ? null : logisticsCode.trim();
    }

    public Byte getLogisticsCompId() {
        return logisticsCompId;
    }

    public void setLogisticsCompId(Byte logisticsCompId) {
        this.logisticsCompId = logisticsCompId;
    }

    public String getLogisticsCompName() {
        return logisticsCompName;
    }

    public void setLogisticsCompName(String logisticsCompName) {
        this.logisticsCompName = logisticsCompName == null ? null : logisticsCompName.trim();
    }

    public Date getAuditDit() {
        return auditDit;
    }

    public void setAuditDit(Date auditDit) {
        this.auditDit = auditDit;
    }

    public String getAuditByName() {
        return auditByName;
    }

    public void setAuditByName(String auditByName) {
        this.auditByName = auditByName == null ? null : auditByName.trim();
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}