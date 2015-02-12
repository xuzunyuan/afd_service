package com.afd.service.product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.afd.common.mybatis.Page;
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
	
	/**
	 * 
	 * @param brandShowDetailIds 有效的特卖明细列表
	 * @return
	 */
	public List<BrandShow> getValidBrandShows(BrandShow record);
	
	public BigDecimal getLowestPrice(Long bsid);
	
	public Page<BrandShowDetail> getBrandShowDetailByPage(Map<?, ?> map,Page<BrandShowDetail> page);
	
	public void addStock(Map<Long, Long> stockMap);
}
