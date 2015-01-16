package com.afd.param.cart;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 结算详细类
 * 
 * @author xiaotao
 */
public class TradeItem implements Serializable {

	private static final long serialVersionUID = -2118511479393229451L;

	// 特卖明细ID
	private Long brandShowDetailId;
	// 特卖ID
	private Long brandShowId;
	// 商品id
	private Long prodId;
	// skuid
	private Long skuId;
	// 商品code
	private String prodCode;
	// 商品code
	private String skuCode;
	// 数量
	private Long num;

	private BigDecimal orgPrice;

	private BigDecimal showPrice;
	// 基础类目三级id
	private Long bcId;

	private String prodTitle;
	private String prodSpecId;
	private String prodSpecName;

	public Long getBrandShowDetailId() {
		return brandShowDetailId;
	}

	public void setBrandShowDetailId(Long brandShowDetailId) {
		this.brandShowDetailId = brandShowDetailId;
	}

	public Long getBrandShowId() {
		return brandShowId;
	}

	public void setBrandShowId(Long brandShowId) {
		this.brandShowId = brandShowId;
	}

	public BigDecimal getOrgPrice() {
		return orgPrice;
	}

	public void setOrgPrice(BigDecimal orgPrice) {
		this.orgPrice = orgPrice;
	}

	public BigDecimal getShowPrice() {
		return showPrice;
	}

	public void setShowPrice(BigDecimal showPrice) {
		this.showPrice = showPrice;
	}

	public String getProdTitle() {
		return prodTitle;
	}

	public void setProdTitle(String prodTitle) {
		this.prodTitle = prodTitle;
	}

	public String getProdSpecId() {
		return prodSpecId;
	}

	public void setProdSpecId(String prodSpecId) {
		this.prodSpecId = prodSpecId;
	}

	public String getProdSpecName() {
		return prodSpecName;
	}

	public void setProdSpecName(String prodSpecName) {
		this.prodSpecName = prodSpecName;
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public Long getBcId() {
		return bcId;
	}

	public void setBcId(Long bcId) {
		this.bcId = bcId;
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
}
