package com.afd.model.product;

import java.io.Serializable;

public class BcAttribute implements Serializable {
	private static final long serialVersionUID = -719921388395222524L;

	private Integer bcAttrId;

    private Short bcId;

    private Integer attrId;

    private Byte displayOrder;

    private Boolean isRequire;

    private String status;

    private Boolean isFilter;

    public Integer getBcAttrId() {
        return bcAttrId;
    }

    public void setBcAttrId(Integer bcAttrId) {
        this.bcAttrId = bcAttrId;
    }

    public Short getBcId() {
        return bcId;
    }

    public void setBcId(Short bcId) {
        this.bcId = bcId;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Byte getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Byte displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Boolean getIsRequire() {
        return isRequire;
    }

    public void setIsRequire(Boolean isRequire) {
        this.isRequire = isRequire;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsFilter() {
        return isFilter;
    }

    public void setIsFilter(Boolean isFilter) {
        this.isFilter = isFilter;
    }
}