package com.afd.service.user;

import java.util.List;

import com.afd.model.user.Geo;

public interface IGeoService {
	/**
	 * 获取省级地址表
	 * @return
	 */
	public List<Geo> getGeoLevelOne();
}
