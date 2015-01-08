package com.afd.model.product;

import java.io.Serializable;

public class BcSpecValue implements Serializable {
	private static final long serialVersionUID = 8376251680755359452L;

	private Integer bcSvId;

    private Integer bcSpecId;

    private Integer specValueId;

    private String specValueName;

    private String imgUrl;

    private Byte displayOrder;

    private String status;

    private Short bcId;

    private Boolean isFilter;

    private Boolean isMobileDisplay;

    private Integer mDisplayPosition;

    public Integer getBcSvId() {
        return bcSvId;
    }

    public void setBcSvId(Integer bcSvId) {
        this.bcSvId = bcSvId;
    }

    public Integer getBcSpecId() {
        return bcSpecId;
    }

    public void setBcSpecId(Integer bcSpecId) {
        this.bcSpecId = bcSpecId;
    }

    public Integer getSpecValueId() {
        return specValueId;
    }

    public void setSpecValueId(Integer specValueId) {
        this.specValueId = specValueId;
    }

    public String getSpecValueName() {
        return specValueName;
    }

    public void setSpecValueName(String specValueName) {
        this.specValueName = specValueName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Byte getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Byte displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Short getBcId() {
        return bcId;
    }

    public void setBcId(Short bcId) {
        this.bcId = bcId;
    }

    public Boolean getIsFilter() {
        return isFilter;
    }

    public void setIsFilter(Boolean isFilter) {
        this.isFilter = isFilter;
    }

    public Boolean getIsMobileDisplay() {
        return isMobileDisplay;
    }

    public void setIsMobileDisplay(Boolean isMobileDisplay) {
        this.isMobileDisplay = isMobileDisplay;
    }

    public Integer getmDisplayPosition() {
        return mDisplayPosition;
    }

    public void setmDisplayPosition(Integer mDisplayPosition) {
        this.mDisplayPosition = mDisplayPosition;
    }
}