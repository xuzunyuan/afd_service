package com.afd.service.product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.afd.common.mybatis.Page;
import com.afd.model.product.Sku;

/**
 *  SKU服务
 * @author hkM
 *
 */
public interface ISkuService {
	
	/**
	 * 添加sku
	 * @param sku
	 * @return
	 */
    public boolean addSku(Sku sku);
    
    /**
     * 批量添加sku
     * @param skus
     * @return
     */
    public boolean batchAddSkus(List<Sku> skus);
    
    /**
	 * 通过SKU_ID删除sku
	 * @param skuId
	 * @return
	 */
    public boolean removeSkuById(Long skuId);
    
    /**
     * 通过SKU_ID修改sku
     * @param sku
     * @return
     */
    public boolean editSkuById(Sku sku, Long increaseNum);
    
    /**
     * 批量更新sku
     * @param skus
     * @param increaseNum
     * @return
     */
    public boolean batchEditSkus(List<Sku> skus, List<Long> increaseNum);
    
	/**
	 *  修改商品销售价格
	 * @param prodId	商品Id
	 * @param oldPrice	原始价格	
	 * @param newPrice	新价格
	 * @return
	 */
	public boolean updateProductPrice(Long prodId, BigDecimal oldPrice, BigDecimal newPrice);
	
	
/********************************************* SKU查询 *********************************************************/

	/**
	 * 通过skuId取sku
	 * @param skuId
	 * @return
	 */
	public Sku getSkuById(Long skuId);
	
	/**
	 * 通过prodId取skus
	 * @param prodId 商品ID
	 * @return
	 */
	public List<Sku> getSkuByProdId(Long prodId);
	
	/**
	 * 根据SKU_ID检索SKU
	 * @param skuCode sku编码
	 * @return
	 */
	public Sku getSkuBySkuCode(String skuCode);
	
	/**
	 * 获得当前商品总库存数量
	 * @param prodId 商品ID
	 * @return
	 */
	public long getStockBalance(long prodId);

	/**
	 * 根据商品ID获取所有的sku
	 * 
	 * @param prodIds 商品ID
	 * @return
	 */
	public Map<Long, List<Sku>> getSkusByProdId(List<Long> prodIds);
	
	/**
	 * 根据prodId获sku分页列表
	 * @param prodId
	 * @param page
	 * @return
	 */
	public Page<Sku> getSkusByProdIdPage( String prodId,Page<Sku> page);

	/**
	 * 根据ID获取sku列表
	 * @param skuIds
	 * @return
	 */
	public List<Sku> getSkusByIds(List<Long> skuIds);
}
