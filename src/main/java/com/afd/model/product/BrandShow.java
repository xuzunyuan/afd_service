package com.afd.model.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BrandShow implements Serializable {
	
	private static final long serialVersionUID = 5389072887838511958L;

	private Long brandShowId;

    private Long sellerId;

    private Long brandId;

    private String title;

    private String bannerImg;

    private String bgColor;

    private String type;
    
    private String status;

    private Date createByDate;

    private Date auditDate;

    private String auditByName;

    private String auditContent;

    private Date startDate;

    private Date endDate;

    private Date endByDate;

    private String endByName;

    private Long endById;

    private Integer buyLimit;

    private Long sRAId;
    
    private BigDecimal lowestPrice;

	public Long getBrandShowId() {
		return brandShowId;
	}

	public void setBrandShowId(Long brandShowId) {
		this.brandShowId = brandShowId;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBannerImg() {
		return bannerImg;
	}

	public void setBannerImg(String bannerImg) {
		this.bannerImg = bannerImg;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreateByDate() {
		return createByDate;
	}

	public void setCreateByDate(Date createByDate) {
		this.createByDate = createByDate;
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

	public Date getEndByDate() {
		return endByDate;
	}

	public void setEndByDate(Date endByDate) {
		this.endByDate = endByDate;
	}

	public String getEndByName() {
		return endByName;
	}

	public void setEndByName(String endByName) {
		this.endByName = endByName;
	}

	public Long getEndById() {
		return endById;
	}

	public void setEndById(Long endById) {
		this.endById = endById;
	}

	public Integer getBuyLimit() {
		return buyLimit;
	}

	public void setBuyLimit(Integer buyLimit) {
		this.buyLimit = buyLimit;
	}

	public Long getsRAId() {
		return sRAId;
	}

	public void setsRAId(Long sRAId) {
		this.sRAId = sRAId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getLowestPrice() {
		return lowestPrice;
	}

	public void setLowestPrice(BigDecimal lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

    
}