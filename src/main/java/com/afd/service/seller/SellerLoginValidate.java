package com.afd.service.seller;

import java.io.Serializable;

import com.afd.model.seller.Seller;
import com.afd.model.seller.SellerLogin;

public class SellerLoginValidate implements Serializable {
	public static final int PASSED = 1; // 通过
	public static final int NOT_EXIST = 0; // 账号不存在
	public static final int INCORRECT_PASSWORD = -1; // 密码不正确
	public static final int FREEZED = -2; // 冻结

	/**
	 * 
	 */
	private static final long serialVersionUID = 5513716822016457467L;

	private int validateStatus;
	private SellerLogin sellerLogin;
	private Seller seller;

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public int getValidateStatus() {
		return validateStatus;
	}

	public void setValidateStatus(int validateStatus) {
		this.validateStatus = validateStatus;
	}

	public SellerLogin getSellerLogin() {
		return sellerLogin;
	}

	public void setSellerLogin(SellerLogin sellerLogin) {
		this.sellerLogin = sellerLogin;
	}
}
