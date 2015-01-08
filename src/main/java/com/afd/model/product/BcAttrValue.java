package com.afd.model.product;

import java.io.Serializable;

public class BcAttrValue implements Serializable {
	private static final long serialVersionUID = 4460956852700566435L;

	private Integer bcAvId;

    private Integer bcAttrId;

    private Integer attrValueId;

    private Integer pBcAvId;

    private Boolean isSubAttr;

    private String icon;

    private Byte displayOrder;

    private String status;

    private Short bcId;

    private Boolean isFilter;

    private Boolean isMobileDisplay;

    public Integer getBcAvId() {
        return bcAvId;
    }

    public void setBcAvId(Integer bcAvId) {
        this.bcAvId = bcAvId;
    }

    public Integer getBcAttrId() {
        return bcAttrId;
    }

    public void setBcAttrId(Integer bcAttrId) {
        this.bcAttrId = bcAttrId;
    }

    public Integer getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Integer attrValueId) {
        this.attrValueId = attrValueId;
    }

    public Integer getpBcAvId() {
        return pBcAvId;
    }

    public void setpBcAvId(Integer pBcAvId) {
        this.pBcAvId = pBcAvId;
    }

    public Boolean getIsSubAttr() {
        return isSubAttr;
    }

    public void setIsSubAttr(Boolean isSubAttr) {
        this.isSubAttr = isSubAttr;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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
}