package com.afd.model.product.vo;

import java.io.Serializable;
import java.util.Date;

/**
 *  用户商品评论VO
 * @author hkM
 *
 */
public class UserCommentVo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long pCommentId;	//主键ID
	private Long storeId;		//店铺
	private String storeName;	//店铺名称
    private Long prodId;		//商品ID
    private Long skuId;			//skuID
    private Long itemId;		//订单明细ID
    private Long orderId;		//订单ID
    private String orderCode;	//订单编号
    private String createByIp;	//评论IP
    private Long userId;		//评论会员ID
    private String nickname;	//评论会员昵称
    private String title;		//评论标题
    private String content;		//评论内容
    private Date buyDate;		//购买时间
    private Integer score;		//评论分数
    private	Integer serviceScore;	//服务态度得分
    private Integer prodScore;		//宝贝与描述相符得分
    private Integer logisticsScore;	//发货速度得分
    
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Long getpCommentId() {
		return pCommentId;
	}
	public void setpCommentId(Long pCommentId) {
		this.pCommentId = pCommentId;
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
	public String getCreateByIp() {
		return createByIp;
	}
	public void setCreateByIp(String createByIp) {
		this.createByIp = createByIp;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getServiceScore() {
		return serviceScore;
	}
	public void setServiceScore(Integer serviceScore) {
		this.serviceScore = serviceScore;
	}
	public Integer getProdScore() {
		return prodScore;
	}
	public void setProdScore(Integer prodScore) {
		this.prodScore = prodScore;
	}
	public Integer getLogisticsScore() {
		return logisticsScore;
	}
	public void setLogisticsScore(Integer logisticsScore) {
		this.logisticsScore = logisticsScore;
	}
    	
}
