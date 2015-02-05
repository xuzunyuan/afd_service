package com.afd.model.product;

import java.io.Serializable;
import java.util.Date;

public class SellerBrand implements Serializable {
	private static final long serialVersionUID = -5142538361893949401L;

	private Integer sellerBrandId;

    private Integer sellerId;

    private Integer brandId;

    private Date submitDate;

    private String status;

    private String auditStatus;

    private Date auditDate;

    private String auditByName;

    private String auditContent;

    private Date authStartDate;

    private Date authEndDate;

    private String categories;

    private String trademarkCert;

    private String otherCert;

    private String authCert;

    public Integer getSellerBrandId() {
        return sellerBrandId;
    }

    public void setSellerBrandId(Integer sellerBrandId) {
        this.sellerBrandId = sellerBrandId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditByName() {
        return auditByName;
    }

    public void setAuditByName(String auditByName) {
        this.auditByName = auditByName;
    }

    public String getAuditContent() {
        return auditContent;
    }

    public void setAuditContent(String auditContent) {
        this.auditContent = auditContent;
    }

    public Date getAuthStartDate() {
        return authStartDate;
    }

    public void setAuthStartDate(Date authStartDate) {
        this.authStartDate = authStartDate;
    }

    public Date getAuthEndDate() {
        return authEndDate;
    }

    public void setAuthEndDate(Date authEndDate) {
        this.authEndDate = authEndDate;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getTrademarkCert() {
        return trademarkCert;
    }

    public void setTrademarkCert(String trademarkCert) {
        this.trademarkCert = trademarkCert;
    }

    public String getOtherCert() {
        return otherCert;
    }

    public void setOtherCert(String otherCert) {
        this.otherCert = otherCert;
    }

    public String getAuthCert() {
        return authCert;
    }

    public void setAuthCert(String authCert) {
        this.authCert = authCert;
    }
}