package com.afd.model.order;

public class YWProdPromotionDetail {
    private Long orderItemId;

    private Integer orderId;

    private String orderCode;

    private Integer skuId;

    private Integer prodId;

    private String prodCode;

    private String skuCode;

    private String prodSpecId;

    private String prodSpecName;

    private String prodTitle;

    private Short bcId;

    private Integer sellerId;

    private Float salePrice;

    private Float transPrice;

    private Short number;

    private String status;

    private String isComment;

    private Integer brandShowId;

    private String brandShowTitle;

    public Long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

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

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public String getProdSpecId() {
        return prodSpecId;
    }

    public void setProdSpecId(String prodSpecId) {
        this.prodSpecId = prodSpecId == null ? null : prodSpecId.trim();
    }

    public String getProdSpecName() {
        return prodSpecName;
    }

    public void setProdSpecName(String prodSpecName) {
        this.prodSpecName = prodSpecName == null ? null : prodSpecName.trim();
    }

    public String getProdTitle() {
        return prodTitle;
    }

    public void setProdTitle(String prodTitle) {
        this.prodTitle = prodTitle == null ? null : prodTitle.trim();
    }

    public Short getBcId() {
        return bcId;
    }

    public void setBcId(Short bcId) {
        this.bcId = bcId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }

    public Float getTransPrice() {
        return transPrice;
    }

    public void setTransPrice(Float transPrice) {
        this.transPrice = transPrice;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsComment() {
        return isComment;
    }

    public void setIsComment(String isComment) {
        this.isComment = isComment == null ? null : isComment.trim();
    }

    public Integer getBrandShowId() {
        return brandShowId;
    }

    public void setBrandShowId(Integer brandShowId) {
        this.brandShowId = brandShowId;
    }

    public String getBrandShowTitle() {
        return brandShowTitle;
    }

    public void setBrandShowTitle(String brandShowTitle) {
        this.brandShowTitle = brandShowTitle == null ? null : brandShowTitle.trim();
    }
}