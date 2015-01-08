package com.afd.model.product;

import java.io.Serializable;

public class BcSpec implements Serializable {
	private static final long serialVersionUID = -2750724936705067748L;

	private Integer bcSpecId;

    private Short bcId;

    private Integer specId;

    private Byte displayOrder;

    private String status;

    private Boolean isFilter;

    public Integer getBcSpecId() {
        return bcSpecId;
    }

    public void setBcSpecId(Integer bcSpecId) {
        this.bcSpecId = bcSpecId;
    }

    public Short getBcId() {
        return bcId;
    }

    public void setBcId(Short bcId) {
        this.bcId = bcId;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
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

    public Boolean getIsFilter() {
        return isFilter;
    }

    public void setIsFilter(Boolean isFilter) {
        this.isFilter = isFilter;
    }
}