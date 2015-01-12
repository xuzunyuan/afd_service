package com.afd.model.product;

import java.io.Serializable;
import java.util.Date;

public class Attribute implements Serializable {
	private static final long serialVersionUID = 3656044394245882461L;

	private Integer attrId;

    private String attrName;

    private String pinyin;

    private String status;

    private String createByName;

    private Date createByDate;

    private String lastUpdateByName;

    private Date lastUpdateByDate;

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName;
    }

    public Date getCreateByDate() {
        return createByDate;
    }

    public void setCreateByDate(Date createByDate) {
        this.createByDate = createByDate;
    }

    public String getLastUpdateByName() {
        return lastUpdateByName;
    }

    public void setLastUpdateByName(String lastUpdateByName) {
        this.lastUpdateByName = lastUpdateByName;
    }

    public Date getLastUpdateByDate() {
        return lastUpdateByDate;
    }

    public void setLastUpdateByDate(Date lastUpdateByDate) {
        this.lastUpdateByDate = lastUpdateByDate;
    }
}