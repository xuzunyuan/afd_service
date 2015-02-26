package com.afd.model.order;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ReturnOrder implements Serializable{
	private static final long serialVersionUID = 235156282514243901L;

	private Long retOrderId;

    private String retOrderCode;

    private Long orderId;

    private Long sellerId;

    private Long userId;

    private String returnType;

    private String returnReason;

    private String evidencePicUrl;

    private String status;

    private Date createDate;

    private String createIp;

    private String logisticsCode;

    private Byte logisticsCompId;
    
    private String logisticsCompName;

    private Date auditDate;

    private String auditByName;

    private String rejectReason;

    private String remarks;
    
    private Date confirmDate;
    
    private Date refundDate;
    
    private Date rejectDate;

    public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public Date getConfirmDate() {
		return confirmDate;
	}

	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}

	public Date getRefundDate() {
		return refundDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}

	public Date getRejectDate() {
		return rejectDate;
	}

	public void setRejectDate(Date rejectDate) {
		this.rejectDate = rejectDate;
	}

    private List<ReturnOrderItem> retOrderItems;

    public Long getRetOrderId() {
        return retOrderId;
    }

    public void setRetOrderId(Long retOrderId) {
        this.retOrderId = retOrderId;
    }

    public String getRetOrderCode() {
        return retOrderCode;
    }

    public void setRetOrderCode(String retOrderCode) {
        this.retOrderCode = retOrderCode == null ? null : retOrderCode.trim();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType == null ? null : returnType.trim();
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason == null ? null : returnReason.trim();
    }

    public String getEvidencePicUrl() {
        return evidencePicUrl;
    }

    public void setEvidencePicUrl(String evidencePicUrl) {
        this.evidencePicUrl = evidencePicUrl == null ? null : evidencePicUrl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode == null ? null : logisticsCode.trim();
    }

    public Byte getLogisticsCompId() {
        return logisticsCompId;
    }

    public void setLogisticsCompId(Byte logisticsCompId) {
        this.logisticsCompId = logisticsCompId;
    }

    public String getLogisticsCompName() {
        return logisticsCompName;
    }

    public void setLogisticsCompName(String logisticsCompName) {
        this.logisticsCompName = logisticsCompName == null ? null : logisticsCompName.trim();
    }

    public String getAuditByName() {
        return auditByName;
    }

    public void setAuditByName(String auditByName) {
        this.auditByName = auditByName == null ? null : auditByName.trim();
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

	public List<ReturnOrderItem> getRetOrderItems() {
		return retOrderItems;
	}

	public void setRetOrderItems(List<ReturnOrderItem> retOrderItems) {
		this.retOrderItems = retOrderItems;
	}
}