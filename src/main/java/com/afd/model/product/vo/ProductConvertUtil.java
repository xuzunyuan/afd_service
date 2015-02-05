package com.afd.model.product.vo;

import org.apache.commons.lang.StringUtils;

import com.afd.common.util.DateUtils;
import com.afd.model.product.Product;

public class ProductConvertUtil {

	public static Product voToProduct(ProductVo vo, Product product) {
		if(product == null){
			product = new Product();
		}
		if(StringUtils.isNotBlank(vo.getTitle())){
			product.setTitle(vo.getTitle());
		}
		if(StringUtils.isNotBlank(vo.getSubtitle())){
			product.setSubtitle(vo.getSubtitle());
		}
		if(StringUtils.isNotBlank(vo.getArtNo())){
			product.setArtNo(vo.getArtNo());
		}
		if(StringUtils.isNotBlank(vo.getAttrValueId())){
			product.setAttrValueId(vo.getAttrValueId());
		}
		if(StringUtils.isNotBlank(vo.getAttrValueName())){
			product.setAttrValueName(vo.getAttrValueName());
		}
		if(null != vo.getBrandId() &&  vo.getBrandId() < 0){
			product.setBrandId(vo.getBrandId());
		}
		if(StringUtils.isNotBlank(vo.getBrandName())){
			product.setBrandName(vo.getBrandName());
		}
		if(StringUtils.isNotBlank(vo.getArtNo())){
			product.setArtNo(vo.getArtNo());
		}
		if(StringUtils.isNotBlank(vo.getDetail())){
			product.setDetail(vo.getDetail());
		}
		if(null != vo.getBcId() &&  vo.getBcId() < 0){
			product.setBcId(vo.getBcId());
		}
		product.setCreateDate(DateUtils.currentDate());
		product.setLastUpdateDate(DateUtils.currentDate());
		return product;
		
	}

}
