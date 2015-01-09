package com.afd.service.product;

import java.util.List;

import com.afd.common.mybatis.Page;
import com.afd.model.product.ProductImg;

/**
 *  商品图片服务
 *  
 * @author hkM
 *
 */
public interface IProductImageService {
	
	/**
	 *  添加商图片
	 * @param productImg
	 * 
	 * @return prodImgId
	 */
	public long addProductImg(ProductImg productImg);
	
	/**
	 * 修改商品图片
	 * @param productImg 
	 * @return
	 */
	public long updateProductImg(ProductImg productImg);
	
	/**
	 * 通过主键删图片
	 * @param prodImgId
	 * @return
	 */
	public boolean delProductImg(Long prodImgId);
	
	/**
	 * 通过商品ID删图片
	 * @param prodId
	 * @return
	 */
	public boolean delProductImgByProdId(Long prodId);
	
		
	/**
	 * 	通过商品Id获得商品图片列表
	 * @param prodId
	 * @return
	 */
	public List<ProductImg> getProductImgByProdId(Long prodId);
	
	/**
	 *  通过主键获取图片信息
	 * @param prodImgId
	 * @return
	 */
	public ProductImg getProductImgByPrimaryKey(Long prodImgId);
	
	/**
	 * 	通过商品Id获得商品图片列表
	 * @param prodId
	 * @param page
	 * @return
	 */
	public Page<ProductImg> getProductImgByProdIdOfPage(long prodId,Page<ProductImg> page);
	
}
