package com.afd.model.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BrandShowDetail  implements Serializable {
	
	private static final long serialVersionUID = 6593936821611440310L;

	private Long bSDId;

    private Long brandShowId;

    private Long prodId;

    private String prodCode;

    private String skuCode;

    private Long skuId;

    private String prodName;

    private String prodTitle;

    private String prodImg;

    private String skuSpecName;

    private BigDecimal showPrice;

    private Long showBalance;

    private Long saleAmount;

    private Integer purchaseCountLimit;

    private Date startDate;

    private Date endDate;

    private String status;

    private Date createByDate;

    private String createByName;

    private Date removeDate;
    
    private Sku sku;
    
    private Product product;

	public Sku getSku() {
		return sku;
	}

	public void setSku(Sku sku) {
		this.sku = sku;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getbSDId() {
		return bSDId;
	}

	public void setbSDId(Long bSDId) {
		this.bSDId = bSDId;
	}

	public Long getBrandShowId() {
		return brandShowId;
	}

	public void setBrandShowId(Long brandShowId) {
		this.brandShowId = brandShowId;
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdTitle() {
		return prodTitle;
	}

	public void setProdTitle(String prodTitle) {
		this.prodTitle = prodTitle;
	}

	public String getProdImg() {
		return prodImg;
	}

	public void setProdImg(String prodImg) {
		this.prodImg = prodImg;
	}

	public String getSkuSpecName() {
		return skuSpecName;
	}

	public void setSkuSpecName(String skuSpecName) {
		this.skuSpecName = skuSpecName;
	}

	public BigDecimal getShowPrice() {
		return showPrice;
	}

	public void setShowPrice(BigDecimal showPrice) {
		this.showPrice = showPrice;
	}

	public Long getShowBalance() {
		return showBalance;
	}

	public void setShowBalance(Long showBalance) {
		this.showBalance = showBalance;
	}

	public Long getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(Long saleAmount) {
		this.saleAmount = saleAmount;
	}

	public Integer getPurchaseCountLimit() {
		return purchaseCountLimit;
	}

	public void setPurchaseCountLimit(Integer purchaseCountLimit) {
		this.purchaseCountLimit = purchaseCountLimit;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateByDate() {
		return createByDate;
	}

	public void setCreateByDate(Date createByDate) {
		this.createByDate = createByDate;
	}

	public String getCreateByName() {
		return createByName;
	}

	public void setCreateByName(String createByName) {
		this.createByName = createByName;
	}

	public Date getRemoveDate() {
		return removeDate;
	}

	public void setRemoveDate(Date removeDate) {
		this.removeDate = removeDate;
	}

    
}