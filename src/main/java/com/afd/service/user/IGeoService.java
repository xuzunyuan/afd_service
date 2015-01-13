package com.afd.service.user;

import java.util.List;

import com.afd.model.user.Geo;

public interface IGeoService {
	/**
	 * 获取省级地址表
	 * @return
	 */
	public List<Geo> getGeoProvince();
	
	/**
	 * 根据父地址id查询子节点
	 * @param fid
	 * @return
	 */
	public List<Geo> getGeoByFId(long fid);
	
	/**
	 * 根据geo的id获取geo
	 * @param id
	 * @return
	 */
	public Geo getGeoById(int id);
}
