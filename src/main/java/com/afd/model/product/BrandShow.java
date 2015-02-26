package com.afd.model.product;

import java.io.Serializable;
import java.util.Date;

public class BrandShow implements Serializable {
	private Integer brandShowId;
	private Integer sellerId;
	private Integer brandId;
	private String title;
	private String showBannerImg;
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
	private Integer endById;
	private Short buyLimit;
	private Integer sRAId;
	private String homeBannerImg;
	private String serviceQq;
	private String serviceTel;
	private Integer deliverProvince;
	private Integer deliverCity;
	private String logisticsCompIds;

	public Integer getBrandShowId() {
		return brandShowId;
	}

	public void setBrandShowId(Integer brandShowId) {
		this.brandShowId = brandShowId;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShowBannerImg() {
		return showBannerImg;
	}

	public void setShowBannerImg(String showBannerImg) {
		this.showBannerImg = showBannerImg;
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

	public Integer getEndById() {
		return endById;
	}

	public void setEndById(Integer endById) {
		this.endById = endById;
	}

	public Short getBuyLimit() {
		return buyLimit;
	}

	public void setBuyLimit(Short buyLimit) {
		this.buyLimit = buyLimit;
	}

	public Integer getsRAId() {
		return sRAId;
	}

	public void setsRAId(Integer sRAId) {
		this.sRAId = sRAId;
	}

	public String getHomeBannerImg() {
		return homeBannerImg;
	}

	public void setHomeBannerImg(String homeBannerImg) {
		this.homeBannerImg = homeBannerImg;
	}

	public String getServiceQq() {
		return serviceQq;
	}

	public void setServiceQq(String serviceQq) {
		this.serviceQq = serviceQq;
	}

	public String getServiceTel() {
		return serviceTel;
	}

	public void setServiceTel(String serviceTel) {
		this.serviceTel = serviceTel;
	}

	public Integer getDeliverProvince() {
		return deliverProvince;
	}

	public void setDeliverProvince(Integer deliverProvince) {
		this.deliverProvince = deliverProvince;
	}

	public Integer getDeliverCity() {
		return deliverCity;
	}

	public void setDeliverCity(Integer deliverCity) {
		this.deliverCity = deliverCity;
	}

	public String getLogisticsCompIds() {
		return logisticsCompIds;
	}

	public void setLogisticsCompIds(String logisticsCompIds) {
		this.logisticsCompIds = logisticsCompIds;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5266608886537929458L;

}