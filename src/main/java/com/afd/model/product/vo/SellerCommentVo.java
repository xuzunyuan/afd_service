package com.afd.model.product.vo;

import java.io.Serializable;
import java.util.Date;

/**
 *  卖家回复评价VO
 * @author hkM
 *
 */
public class SellerCommentVo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long pCommentId;	//主键ID
	private Long storeId;		//店铺ID
    private Long prodId;		//商品ID
    private Long skuId;			//skuID
    private Long itemId;		//订单明细ID
    private Long orderId;		//订单ID
    private String orderCode;	//订单编号
    private String replyContent;//卖家回复内容
    private Long replyById;		//卖家登录ID
    private String replyByName;	//卖家登录名
    private Long userId;		//评论人ID	
    private String nickname;	//评论人昵称
    private Date replyDate;		//卖家回复日期
    private Integer score;		//评论分数
    private String isReply;		//是否已回复
    private String replyByIp;		//评论人IP
    private String isHaveAdditional;//是否有内容评价
    private String replyStatus;	//卖家评论状态
    private Integer replyScore;	//卖家回复评分
    
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public Long getSkuId() {
		return skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public Long getpCommentId() {
		return pCommentId;
	}
	public void setpCommentId(Long pCommentId) {
		this.pCommentId = pCommentId;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public Long getReplyById() {
		return replyById;
	}
	public void setReplyById(Long replyById) {
		this.replyById = replyById;
	}
	public String getReplyByName() {
		return replyByName;
	}
	public void setReplyByName(String replyByName) {
		this.replyByName = replyByName;
	}
	public Date getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getIsReply() {
		return isReply;
	}
	public void setIsReply(String isReply) {
		this.isReply = isReply;
	}
	public String getReplyByIp() {
		return replyByIp;
	}
	public void setReplyByIp(String replyByIp) {
		this.replyByIp = replyByIp;
	}
	public String getIsHaveAdditional() {
		return isHaveAdditional;
	}
	public void setIsHaveAdditional(String isHaveAdditional) {
		this.isHaveAdditional = isHaveAdditional;
	}
	public String getReplyStatus() {
		return replyStatus;
	}
	public void setReplyStatus(String replyStatus) {
		this.replyStatus = replyStatus;
	}
	public Integer getReplyScore() {
		return replyScore;
	}
	public void setReplyScore(Integer replyScore) {
		this.replyScore = replyScore;
	}
    
}
