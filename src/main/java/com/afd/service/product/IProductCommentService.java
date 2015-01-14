package com.afd.service.product;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.afd.common.mybatis.Page;
import com.afd.model.product.ProductComment;
import com.afd.model.product.vo.SellerCommentVo;
import com.afd.model.product.vo.UserCommentVo;

/**
 * 	商品评论服务
 * @author hkM
 *
 */
public interface IProductCommentService {

	/**
	 *  通过主键ID获取评论信息
	 * @param pCommentId
	 * @return
	 */
	public ProductComment getProductCommentByPrimaryKey(Long pCommentId);
	
	/**
	 * 添加买家评论信息（网站端调用）
	 * @param userCommentVo 买家回复信息
	 * @return
	 */
	public boolean addUserComment(List<UserCommentVo> list);
	
	/**
	 * 添加卖家回复评论信息
	 * @param sellerCommentVo
	 * @return
	 */
	public boolean addSellerComment(SellerCommentVo sellerCommentVo);
	
	/**
	 * 买家删除自己评论信息（逻辑删除）
	 * @param userId
	 * @param pCommentId
	 * @return
	 */
	public boolean delUserProductComment(Long pCommentId,Long userId);
	
	/**
	 * 卖家删除回复信息（逻辑删除）
	 * @param pCommentId
	 * @param storeId	
	 * @return
	 */
	public boolean delStoreProductComment(Long pCommentId,Long storeId);
	
	/**
	 *  通过好评率获得评论列表	 例： 只看好评 4-5分
	 * @param startScore	好评起始分值
	 * @param endScore		好评结束分值
	 * @return
	 */
	public List<ProductComment> getProductCommentByReplyRate(Integer startScore,Integer endScore);

	/**
	 *  买家评论列表
	 * @param storeId
	 * @param page
	 * @return
	 */
	public Page<ProductComment> getUserProductCommentPage(Long storeId,Page<ProductComment> page);
	
	/**
	 * 卖家评论列表
	 * @param storeId
	 * @param page
	 * @return
	 */
	public Page<ProductComment> getSellerProductCommentPage(Long storeId,Page<ProductComment> page);
	
	/**
	 * 待评价回复列表
	 * @param storeId
	 * @param page
	 * @return
	 */
	public Page<ProductComment> getWaitProductCommentPage(Long storeId,Page<ProductComment> page);
	
	/**
	 *  通过评论Id获得评论用户Id
	 * @param pCommentId
	 * @return
	 */
	public Long getUserIdByPrimaryKey(String pCommentId);

	/**
	 *  设置评论已回复
	 * @param pCommentId	评论Id
	 * @param isReply		
	 * @return
	 */
	public boolean updateIsReply(Long pCommentId,String isReply);


	
	/**
	 * 批量删除卖家评论
	 * @param idList
	 * @return
	 * @throws DataAccessException
	 */
	public boolean batchDelProductComment(List<Long> idList)throws DataAccessException;
	
	/**
	 *  删除卖家评论
	 * @param pCommentId
	 * @throws DataAccessException
	 */
	public boolean delProductComment(long pCommentId) throws DataAccessException;

	/**
	 * 获得当前页之外评论统计数 （Seller专用）
	 * @param storeId	店铺ID
	 * @param isReply	是否已回复评论   false 或者null
	 * @param replyStatus 评价状态
	 * @return
	 */
	public long[] getProductCommentCount(Long storeId,String isReply,String replyStatus);
}
