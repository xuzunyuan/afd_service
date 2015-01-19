package com.afd.service.product;

import java.util.List;

import com.afd.model.product.BrandShow;
import com.afd.model.product.BrandShowDetail;

public interface IBrandShowService {
	
	/**
	 * 
	 * @param brandShowId 特卖Id
	 * @return
	 */
	public BrandShow getBrandShowById(Long brandShowId);
	
	/**
	 * 
	 * @param brandShowDetailId 特卖明细ID
	 * @return
	 */
	public BrandShowDetail getBrandShowDetailById(Long brandShowDetailId);
	
	/**
	 * 
	 * @param brandShowIds 特卖ID列表
	 * @return
	 */
	public List<BrandShow> getBrandShowByIds(List<Long> brandShowIds);
	
	/**
	 * 
	 * @param brandShowDetailIds 特卖明细ID列表
	 * @return
	 */
	public List<BrandShowDetail> getBrandShowDetailsByIds(List<Long> brandShowDetailIds);
}
