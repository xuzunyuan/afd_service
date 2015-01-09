package com.afd.model.seller;

import java.io.Serializable;
import java.util.Date;

public class SellerAudit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7875281647883917763L;

	private Integer auditId;

	private Integer applyId;

	private String auditResult;

	private String auditType;

	private String auditor;

	private String auditOpinion;

	private Date auditDate;

	private String auditIp;

	private String column9;

	public Integer getAuditId() {
		return auditId;
	}

	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
	}

	public Integer getApplyId() {
		return applyId;
	}

	public void setApplyId(Integer applyId) {
		this.applyId = applyId;
	}

	public String getAuditResult() {
		return auditResult;
	}

	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult == null ? null : auditResult.trim();
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType == null ? null : auditType.trim();
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor == null ? null : auditor.trim();
	}

	public String getAuditOpinion() {
		return auditOpinion;
	}

	public void setAuditOpinion(String auditOpinion) {
		this.auditOpinion = auditOpinion == null ? null : auditOpinion.trim();
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public String getAuditIp() {
		return auditIp;
	}

	public void setAuditIp(String auditIp) {
		this.auditIp = auditIp == null ? null : auditIp.trim();
	}

	public String getColumn9() {
		return column9;
	}

	public void setColumn9(String column9) {
		this.column9 = column9 == null ? null : column9.trim();
	}
}