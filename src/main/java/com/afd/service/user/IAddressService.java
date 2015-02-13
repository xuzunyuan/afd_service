package com.afd.service.user;

import java.util.List;

import com.afd.model.user.UserAddress;


public interface IAddressService {
	
	/**
	 * 根据地址id获取用户地址
	 * @param addressId
	 * @return
	 */
	public UserAddress getAddressById(long addressId);
	
	/**
	 * 根据用户id获取用户地址列表
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getAddressesByUserId(long userId);
	
	/**
	 * 添加收货地址
	 * @param address
	 * @return
	 */
	public int addAddress(UserAddress address);
	
	/**
	 * 删除收货地址
	 * @param addrId
	 * @return
	 */
	public int delAddress(long addrId);
	
	/**
	 * 修改收货地址
	 * @param address
	 * @return
	 */
	public int updateAddress(UserAddress address);
}
