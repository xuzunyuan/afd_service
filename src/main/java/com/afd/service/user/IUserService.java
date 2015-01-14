package com.afd.service.user;

public interface IUserService {
	/**
	 * 验证用户名是否唯一
	 * @param userName 用户名
	 * @return true：唯一；false：不唯一
	 */
	public boolean uniqueUserName(String userName);
}
