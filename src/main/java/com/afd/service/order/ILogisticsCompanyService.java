/**
 * Copyright (c)2015-? by www.afd.com. All rights reserved.
 * 
 */
package com.afd.service.order;

import java.util.List;

import com.afd.model.order.LogisticsCompany;

/**
 * 物流公司服务
 * 
 * @author xuzunyuan
 * @date 2015年2月26日
 */
public interface ILogisticsCompanyService {
	public List<LogisticsCompany> getValidLogisticsCompany();

	public List<LogisticsCompany> getLogisticsCompanyByIds(long[] ids);

	public LogisticsCompany getLogisticsCompanyById(Long id);

	public long newLogisticsCompany(LogisticsCompany lc);

	public int modifyLogisticsCompany(LogisticsCompany lc);

	public int deleteLogisticsCompany(Long id);
}
