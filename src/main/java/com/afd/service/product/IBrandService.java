package com.afd.service.product;

import com.afd.model.product.Brand;


/**
 * 品牌管理服务
 */
public interface IBrandService {

    /**
	 * @param brand 
	 * @return 成功返回ID
	 */
	Long insertBrand(Brand brand);

	boolean updateByBrandId(Brand record);
	
	/**
	 * @param brandId 品牌ID
	 * @return 1:成功,-1:已关联卖家不允许删除,0:失败
	 */
	int deleteByBrandId(Long brandId);
	
	Brand getByBrandId(Long brandId);
	
	/**
	 * @param brandName 中文名 精确匹配
	 * @param brandEname 英文名  精确匹配
	 * @param status 1:有效,0:无效
	 * @return
	 */
	Brand getBrandByName(String brandName, String brandEname, String status);
}
