package com.afd.model.seller;

import java.io.Serializable;

public class SellerReceipt implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3269396778853128723L;

	private Integer receiptId;

	private Integer sellerId;

	private String rName;

	private String rMobile;

	private String rAddress;

	private String taxImg;

	private String taxNo;

	private String registerAddr;

	private String registerTel;

	private String bankAcctName;

	private String bankAcctNo;

	private String taxType;

	private String coName;

	private String qualiUrl;

	public Integer getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(Integer receiptId) {
		this.receiptId = receiptId;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getrMobile() {
		return rMobile;
	}

	public void setrMobile(String rMobile) {
		this.rMobile = rMobile;
	}

	public String getrAddress() {
		return rAddress;
	}

	public void setrAddress(String rAddress) {
		this.rAddress = rAddress;
	}

	public String getTaxImg() {
		return taxImg;
	}

	public void setTaxImg(String taxImg) {
		this.taxImg = taxImg;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getRegisterAddr() {
		return registerAddr;
	}

	public void setRegisterAddr(String registerAddr) {
		this.registerAddr = registerAddr;
	}

	public String getRegisterTel() {
		return registerTel;
	}

	public void setRegisterTel(String registerTel) {
		this.registerTel = registerTel;
	}

	public String getBankAcctName() {
		return bankAcctName;
	}

	public void setBankAcctName(String bankAcctName) {
		this.bankAcctName = bankAcctName;
	}

	public String getBankAcctNo() {
		return bankAcctNo;
	}

	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getQualiUrl() {
		return qualiUrl;
	}

	public void setQualiUrl(String qualiUrl) {
		this.qualiUrl = qualiUrl;
	}
}