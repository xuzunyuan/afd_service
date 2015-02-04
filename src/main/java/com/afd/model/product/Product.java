package com.afd.model.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Product implements Serializable {
	private static final long serialVersionUID = 139759041505047714L;

	private Integer prodId;

    private String prodCode;

    private String bcCode;

    private String name;

    private String title;

    private String subtitle;

    private Integer bcId;

    private Integer sellerId;

    private String artNo;

    private Integer brandId;

    private String brandName;

    private String type;

    private String status;

    private String brief;

    private BigDecimal weight;

    private String volume;

    private String attrValueId;

    private String attrValueName;

    private Date expireDate;

    private Date createDate;

    private Date lastUpdateDate;

    private String auditStatus;

    private String lastAuditName;

    private Date lastAuditDate;

    private String material;

    private String sourceArea;
    
    private String imgUrl;

    private String detail;

    private List<Sku> skus;
    
    //
    private String bcName;
    private String salePrice;
    private String marketPrice;

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

    public String getBcCode() {
        return bcCode;
    }

    public void setBcCode(String bcCode) {
        this.bcCode = bcCode == null ? null : bcCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public Integer getBcId() {
        return bcId;
    }

    public void setBcId(Integer bcId) {
        this.bcId = bcId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getArtNo() {
        return artNo;
    }

    public void setArtNo(String artNo) {
        this.artNo = artNo == null ? null : artNo.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume == null ? null : volume.trim();
    }

    public String getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(String attrValueId) {
        this.attrValueId = attrValueId == null ? null : attrValueId.trim();
    }

    public String getAttrValueName() {
        return attrValueName;
    }

    public void setAttrValueName(String attrValueName) {
        this.attrValueName = attrValueName == null ? null : attrValueName.trim();
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getLastAuditName() {
        return lastAuditName;
    }

    public void setLastAuditName(String lastAuditName) {
        this.lastAuditName = lastAuditName == null ? null : lastAuditName.trim();
    }

    public Date getLastAuditDate() {
        return lastAuditDate;
    }

    public void setLastAuditDate(Date lastAuditDate) {
        this.lastAuditDate = lastAuditDate;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getSourceArea() {
        return sourceArea;
    }

    public void setSourceArea(String sourceArea) {
        this.sourceArea = sourceArea == null ? null : sourceArea.trim();
    }

    public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

	public List<Sku> getSkus() {
		return skus;
	}

	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}

	public String getBcName() {
		return bcName;
	}

	public void setBcName(String bcName) {
		this.bcName = bcName;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}
    
}