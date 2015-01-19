package com.afd.model.order;

import java.io.Serializable;

public class ReturnOrderItem implements Serializable{
    private Integer retOrderItemId;

    private Integer retOrderId;

    private Integer prodId;

    private Integer sellerId;

    private Integer itemId;

    private Integer skuId;

    private Integer returnNumber;

    private Float retFee;

    public Integer getRetOrderItemId() {
        return retOrderItemId;
    }

    public void setRetOrderItemId(Integer retOrderItemId) {
        this.retOrderItemId = retOrderItemId;
    }

    public Integer getRetOrderId() {
        return retOrderId;
    }

    public void setRetOrderId(Integer retOrderId) {
        this.retOrderId = retOrderId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getReturnNumber() {
        return returnNumber;
    }

    public void setReturnNumber(Integer returnNumber) {
        this.returnNumber = returnNumber;
    }

    public Float getRetFee() {
        return retFee;
    }

    public void setRetFee(Float retFee) {
        this.retFee = retFee;
    }
}