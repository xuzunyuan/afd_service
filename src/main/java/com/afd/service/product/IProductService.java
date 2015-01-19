package com.afd.service.product;

import java.util.List;

import com.afd.common.mybatis.Page;
import com.afd.model.product.Product;
import com.afd.param.product.ProductCondition;

/**
 *  商品服务
 *  
 * @author hkM
 *
 */
public interface IProductService {

	/**
	 * 添加商品
	 * 
	 * @param product
	 * @return 商品ID
	 */
	public Long addProduct(Product product);

	/**
	 * 通过商品编号修改商品
	 * 
	 * @param product
	 * @return 商品ID
	 */
	public boolean editProductById(Product product);

	/**
	 * 上架商品 (seller)
	 * 
	 * @param prodId 商品ID
	 * @return
	 */
	public boolean putawayProduct(Long prodId);

	/**
	 * 批量上架商品 (seller)
	 * 
	 * @param idList 商品ID
	 * @return
	 */
	public boolean batchPutawayProduct(List<Long> idList);
	
	/**
	 * 取消上架审核 (seller 后台专用)
	 * 
	 * @param prodId 商品ID
	 * @return
	 */
	public boolean cancelAuditProduct(Long prodId);
	
	/**
	 * 下架商品	(seller || boss )
	 * 
	 * @param prodId 商品ID
	 * @param optName 操作人
	 * @return
	 */
	public boolean downawayProductByProdId(Long prodId, String optName);

	/**
	 * 批量下架商品 (seller || boss )
	 * 
	 * @param idList 商品ID
	 * @param optName 操作人
	 * @return
	 */
	public boolean batchDownawayProduct(List<Long> idList, String optName);

	/**
	 * 商品上架 （BOSS 审核通过）
	 * 
	 * @param prodId 商品ID
	 * @Param auditName 审核人
	 * @return
	 */
	public boolean putawayProductBySys(Long prodId, String auditName);

	/**
	 * 批量商品上架 （BOSS 审核通过）
	 * 
	 * @param idList 商品ID
	 * @param auditName 审核人
	 * @return
	 */
	public boolean batchPutawayProductBySys(List<Long> idList, String auditName);

	/**
	 *  删除商品 （seller 后台 || boss 后台）
	 * @param prodId 商品ID
	 * @param optName 操作人
	 * @return
	 */
	public boolean delProduct(Long prodId, String optName);

	/**
	 * 批量删除商品 （seller 后台 ||  boss 后台）
	 * 
	 * @param idList  商品ID
	 * @param optName 操作人
	 * @return
	 */
	public boolean batchdelProduct(List<Long> idList, String optName);
	
	/**
	 * 批量暂停销售商品（Boss 店铺冻结）
	 * @param storeId	店铺ID （冻结店铺下所有商品）
	 * @param idList	商品ID （冻结指定商品）
	 * @param optName	操作人
	 * @return
	 */
	public boolean batchSuspendSaleProduct(Long storeId, List<Long> idList, String optName);
	
	/**
	 * 	批量开放销售商品（Boss店铺解冻）
	 * @param storeId	店铺ID （解冻店铺下所有商品）
	 * @param idList	商品ID （解冻指定商品）
	 * @param optName	操作人
	 * @return
	 */
	public boolean batchOpenSaleProduct(Long toreId, List<Long> idList, String optName);
	
	
/********************************************* 商品查询 *********************************************************/

	/**
	 *  通过ID获取商品详细信息（含sku，商品图片信息）
	 * @param prodId
	 * @return Product
	 */
	public Product getProductById(Long prodId);
	
	/**
	 *  通过商品编码获取商品详细信息（含sku，商品图片信息）
	 * @param prodCode
	 * @return
	 */
	public Product getProductByProdCode(String prodCode);	
	
	/**
	 *  在售商品列表（Seller || User ）
	 * @param productCondition 	查询条件
	 * @param sortField			排序字段
	 * @param sortDirection		排序方向
	 * @param page	
	 * @return
	 */
	public Page<Product> getSaleProductPage(ProductCondition productCondition,
			String sortField, String sortDirection, Page<Product> page);
	
	/**
	 *  库存商品列表（不包含上架及删除商品）（seller）
	 * @param productCondition 	查询条件
	 * @param sortField			排序字段
	 * @param sortDirection		排序方向
	 * @param page	
	 * @return
	 */
	public Page<Product> getBalanceProductPage(ProductCondition productCondition,
			String sortField, String sortDirection, Page<Product> page);
	
	/**
	 *  商品列表（Boss）
	 * @param productCondition 	查询条件
	 * @param sortField			排序字段
	 * @param sortDirection		排序方向
	 * @param page	
	 * @return
	 */
	public Page<Product> getProductPage(ProductCondition productCondition,
			String sortField, String sortDirection, Page<Product> page);
	
	/**
	 * 获取当前店铺所有商品ID
	 * 
	 * @param storeId
	 * @return 商品ID列表
	 */
	public List<Long> getProductByStoreId(Long storeId);

	/**
	 * 根据ID获取商品列表
	 * @param prodIds
	 * @return
	 */
	public List<Product> getProductsByIds(List<Long> prodIds);
	
}
