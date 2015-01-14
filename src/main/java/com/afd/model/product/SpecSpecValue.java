package com.afd.model.product;

import java.io.Serializable;

public class SpecSpecValue implements Serializable {
	private static final long serialVersionUID = -3688341900733524724L;

	private Integer sSVId;

    private Integer specId;

    private Integer specValueId;

    private Byte displayOrder;

    public Integer getsSVId() {
        return sSVId;
    }

    public void setsSVId(Integer sSVId) {
        this.sSVId = sSVId;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public Integer getSpecValueId() {
        return specValueId;
    }

    public void setSpecValueId(Integer specValueId) {
        this.specValueId = specValueId;
    }

    public Byte getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Byte displayOrder) {
        this.displayOrder = displayOrder;
    }
}