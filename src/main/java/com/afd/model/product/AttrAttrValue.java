package com.afd.model.product;

import java.io.Serializable;

public class AttrAttrValue implements Serializable {
	private static final long serialVersionUID = 4644425131428917414L;
	
    private Integer aAvId;

    private Integer attrId;

    private Integer attrValueId;

    private Short displayOrder;

    private Integer pAAvId;

    private Boolean hasSub;

    public Integer getaAvId() {
        return aAvId;
    }

    public void setaAvId(Integer aAvId) {
        this.aAvId = aAvId;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Integer getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Integer attrValueId) {
        this.attrValueId = attrValueId;
    }

    public Short getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Short displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Integer getpAAvId() {
        return pAAvId;
    }

    public void setpAAvId(Integer pAAvId) {
        this.pAAvId = pAAvId;
    }

    public Boolean getHasSub() {
        return hasSub;
    }

    public void setHasSub(Boolean hasSub) {
        this.hasSub = hasSub;
    }
}