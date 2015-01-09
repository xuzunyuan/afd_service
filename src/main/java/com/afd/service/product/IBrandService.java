package com.afd.service.product;

import com.afd.model.product.Brand;


/**
 * 品牌管理服务
 */
public interface IBrandService {

	/**
	 *  通过主键获取品牌
	 * @param brandId
	 * @return
	 */
	public Brand getBrandById(Long brandId);
	
	/**
	 *  添加品牌
	 * @param brand
	 * @return
	 */
	public boolean addBrand(Brand brand);
	
	/**
	 * 修改品牌信息
	 * @param brand
	 * @return
	 */
	public boolean editBrand(Brand brand);
	
	/**
	 * 通过主键ID删除追加评论信息
	 * @param brandId
	 * @return
	 */
	public boolean deleteBrand(Long brandId);
	
	/**
	 * @param brandName 中文名 精确匹配
	 * @param brandEname 英文名  精确匹配
	 * @param status 1:有效,0:无效
	 * @return
	 */
	Brand getBrandByName(String brandName, String brandEname, String status);
	
}
