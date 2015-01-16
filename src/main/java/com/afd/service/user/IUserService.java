package com.afd.service.user;

import com.afd.model.user.User;

public interface IUserService {
	/**
	 * 验证用户名是否唯一
	 * @param userName 用户名
	 * @return true：唯一；false：不唯一
	 */
	public boolean uniqueUserName(String userName);
	public User getUserById(Long userId);
}
