package com.afd.model.seller;

public class SellerQuali {
    private Integer sellerQualiId;

    private Integer sellerId;

    private String qualiName;

    private String quailUrl;

    private String expireDate;

    private Integer ccId;

    private String ccName;

    public Integer getSellerQualiId() {
        return sellerQualiId;
    }

    public void setSellerQualiId(Integer sellerQualiId) {
        this.sellerQualiId = sellerQualiId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getQualiName() {
        return qualiName;
    }

    public void setQualiName(String qualiName) {
        this.qualiName = qualiName == null ? null : qualiName.trim();
    }

    public String getQuailUrl() {
        return quailUrl;
    }

    public void setQuailUrl(String quailUrl) {
        this.quailUrl = quailUrl == null ? null : quailUrl.trim();
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate == null ? null : expireDate.trim();
    }

    public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        this.ccId = ccId;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName == null ? null : ccName.trim();
    }
}