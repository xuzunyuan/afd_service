package com.afd.service.user;

import com.afd.model.user.User;

public interface IUserService {
	/**
	 * 验证用户名是否唯一
	 * @param userName 用户名
	 * @return true：唯一；false：不唯一
	 */
	public boolean uniqueUserName(String userName);
	/**
	 * 根据用户id获取用户
	 * @param userId
	 * @return
	 */
	public User getUserById(Long userId);
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	public Long register(User user);
	
	/**
	 * 用户登录
	 * @param userName
	 * @param pwd
	 * @return
	 */
	public boolean logIn(String userName,String pwd);
}
