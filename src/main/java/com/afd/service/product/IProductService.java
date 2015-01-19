package com.afd.service.product;

import java.util.List;
import java.util.Map;

import com.afd.common.mybatis.Page;
import com.afd.model.product.Product;
import com.afd.model.product.ProductImg;
import com.afd.model.product.Sku;
import com.afd.param.product.ProductCondition;

/**
 *  商品服务
 *  
 * @author hkM
 *
 */
public interface IProductService {
	
	/*－－－－－－－－－－－－－－－－－－－-－－－-－－－－－-----SKU CRUD----－－－－－－－-－－－－－－－－－－－－－－－－－－－－－*/	

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
    public boolean removeSkuById(Integer skuId);
    
    /**
     * 通过SKU_ID修改sku
     * @param sku
     * @return
     */
    public boolean editSkuById(Sku sku, Integer increaseNum);
    
    /**
     * 批量更新sku
     * @param skus
     * @param increaseNum
     * @return
     */
    public boolean batchEditSkus(List<Sku> skus, List<Integer> increaseNum);
    
	/**
	 * 通过skuId取sku
	 * @param skuId
	 * @return
	 */
	public Sku getSkuById(Integer skuId);
	
	/**
	 * 通过prodId取skus
	 * @param prodId 商品ID
	 * @return
	 */
	public List<Sku> getSkusByProdId(Integer prodId);
	
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
	public Integer getStockBalance(Integer prodId);

	/**
	 * 根据商品ID获取所有的sku
	 * 
	 * @param prodIds 商品ID
	 * @return
	 */
	public Map<Integer, List<Sku>> getSkusByProdId(List<Integer> prodIds);
	
	/**
	 * 根据prodId获sku分页列表
	 * @param prodId
	 * @param page
	 * @return
	 */
	public Page<Sku> getSkusByProdIdPage( String prodId,Page<Sku> page);

	/*－－－－－－－－－－－－－－－－－－－-－－－-－－－－－-----商品图片CRUD----－－－－－－－-－－－－－－－－－－－－－－－－－－－－－*/	
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
	 *  通过主键获取图片信息
	 * @param prodImgId
	 * @return
	 */
	public ProductImg getProductImgByPrimaryKey(Long prodImgId);
	
	/**
	 * 	通过商品Id获得商品图片列表
	 * @param prodId
	 * @return
	 */
	public List<ProductImg> getProductImgByProdId(Long prodId);
	
	/**
	 * 	通过商品Id获得商品图片列表
	 * @param prodId
	 * @param page
	 * @return
	 */
	public Page<ProductImg> getProductImgByProdIdOfPage(long prodId,Page<ProductImg> page);
	
	/*－－－－－－－－－－－－－－－－－－－-－－－-－－－－－-----商品CRUD----－－－－－－－-－－－－－－－－－－－－－－－－－－－－－*/	

	/**
	 * 添加商品
	 * 
	 * @param product
	 * @return 商品ID
	 */
	public int addProduct(Product product);

	/**
	 * 通过商品编号修改商品
	 * 
	 * @param product
	 * @return 商品ID
	 */
	public int editProductById(Product product);

	/**
	 * 上架商品 (seller)
	 * 
	 * @param prodId 商品ID
	 * @return
	 */
	public boolean putawayProduct(Integer prodId);

	/**
	 * 批量上架商品 (seller)
	 * 
	 * @param idList 商品ID
	 * @return
	 */
	public boolean batchPutawayProduct(List<Integer> idList);
	
	/**
	 * 取消上架审核 (seller 后台专用)
	 * 
	 * @param prodId 商品ID
	 * @return
	 */
	public boolean cancelAuditProduct(Integer prodId);
	
	/**
	 * 下架商品	(seller || boss )
	 * 
	 * @param prodId 商品ID
	 * @param optName 操作人
	 * @return
	 */
	public boolean downawayProductByProdId(Integer prodId, String optName);

	/**
	 * 批量下架商品 (seller || boss )
	 * 
	 * @param idList 商品ID
	 * @param optName 操作人
	 * @return
	 */
	public boolean batchDownawayProduct(List<Integer> idList, String optName);

	/**
	 * 商品上架 （BOSS 审核通过）
	 * 
	 * @param prodId 商品ID
	 * @Param auditName 审核人
	 * @return
	 */
	public boolean putawayProductByBoss(Integer prodId, String auditName);

	/**
	 * 批量商品上架 （BOSS 审核通过）
	 * 
	 * @param idList 商品ID
	 * @param auditName 审核人
	 * @return
	 */
	public boolean batchPutawayProductByBoss(List<Integer> idList, String auditName);

	/**
	 *  删除商品 （seller 后台 || boss 后台）
	 * @param prodId 商品ID
	 * @param optName 操作人
	 * @return
	 */
	public boolean delProduct(Integer prodId, String optName);

	/**
	 * 批量删除商品 （seller 后台 ||  boss 后台）
	 * 
	 * @param idList  商品ID
	 * @param optName 操作人
	 * @return
	 */
	public boolean batchdelProduct(List<Integer> idList, String optName);
	
	/**
	 * 批量暂停销售商品（Boss 卖家冻结）
	 * @param sellerId	卖家ID （冻结卖家下所有商品）
	 * @param idList	商品ID （冻结指定商品）
	 * @param optName	操作人
	 * @return
	 */
	public boolean batchSuspendSaleProduct(Integer sellerId, List<Integer> idList, String optName);
	
	/**
	 * 	批量开放销售商品（Boss卖家解冻）
	 * @param sellerId	卖家ID （解冻卖家下所有商品）
	 * @param idList	商品ID （解冻指定商品）
	 * @param optName	操作人
	 * @return
	 */
	public boolean batchOpenSaleProduct(Integer sellerId, List<Integer> idList, String optName);
	
	
	/********************************************* 商品查询 *********************************************************/
	/**
	 *  通过ID获取商品详细信息（含sku，商品图片信息）
	 * @param prodId
	 * @return Product
	 */
	public Product getProductById(Integer prodId);
	
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
	public Page<Product> searchOnlineProduct(ProductCondition productCondition,
			String sortField, String sortDirection, Page<Product> page);
	
	/**
	 *  待审核商品列表（seller）
	 * @param productCondition 	查询条件
	 * @param sortField			排序字段
	 * @param sortDirection		排序方向
	 * @param page	
	 * @return
	 */
	public Page<Product> searchAuditProductPage(ProductCondition productCondition,
			String sortField, String sortDirection, Page<Product> page);
	
	/**
	 *  库存商品列表（seller）
	 * @param productCondition 	查询条件
	 * @param sortField			排序字段
	 * @param sortDirection		排序方向
	 * @param page	
	 * @return
	 */
	public Page<Product> searchStockProductPage(ProductCondition productCondition,
			String sortField, String sortDirection, Page<Product> page);
	
	/**
	 *  商品列表（Boss）
	 * @param productCondition 	查询条件
	 * @param sortField			排序字段
	 * @param sortDirection		排序方向
	 * @param page	
	 * @return
	 */
	public Page<Product> searchProductByConditionPage(ProductCondition productCondition,
			String sortField, String sortDirection, Page<Product> page);
	
	/**
	 * 获取当前卖家所有商品
	 * 
	 * @param sellerId
	 * @return 商品列表
	 */
	public List<Product> getProductBysellerId(Integer sellerId);
	
	/**
	 * 获取当前卖家所有商品ID
	 * 
	 * @param sellerId
	 * @return 商品ID列表
	 */
	public List<Integer> getProductIdsBysellerId(Integer sellerId);

	/**
	 * 根据ID获取商品列表
	 * @param prodIds
	 * @return
	 */
	public List<Product> getProductsByIds(List<Long> prodIds);
		
}
