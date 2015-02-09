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
	 * 验证手机号是否唯一
	 * @param userName 用户名
	 * @return true：唯一；false：不唯一
	 */
	public boolean uniqueMobile(String mobile);
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
	 * 根据用户名查询用户
	 * @param userName
	 * @return
	 */
	public User getUserByUserName(String userName);
	
	/**
	 * 根据手机号查询用户
	 * @param userName
	 * @return
	 */
	public User getUserByMobile(String mobile);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
	
	/**
	 * 更新用户密码
	 * @param user
	 * @return
	 */
	public int chgPwd(String mobile,String pwd);

}
