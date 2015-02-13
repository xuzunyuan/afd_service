package com.afd.service.product;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.afd.common.mybatis.Page;
import com.afd.model.product.BrandShow;
import com.afd.model.product.BrandShowDetail;

public interface IBrandShowService {
	/**
	 * 新建特卖
	 * 
	 * @param brandShow
	 * @return
	 */
	public long newBrandShow(BrandShow brandShow);

	/**
	 * 提交特卖至审核
	 * 
	 * @param brandShowId
	 * @param details
	 * @return
	 */
	public long submitNewBrandShow(long brandShowId, BrandShowDetail[] details);

	/**
	 * 修改特卖信息
	 * 
	 * @param brandShow
	 * @return
	 */
	public long modifyBrandShow(BrandShow brandShow);

	/**
	 * 修改特卖明细
	 * 
	 * @param brandShowId
	 * @param details
	 * @return
	 */
	public long submitModifyBrandShow(long brandShowId,
			BrandShowDetail[] details);

	/**
	 * 分页查询卖家的特卖
	 * 
	 * @param sellerId
	 * @param cond
	 * @param page
	 * @return
	 */
	public Page<BrandShow> queryMyBrandShowByPage(int sellerId,
			Map<String, ?> cond, int... page);

	/**
	 * 查询待审核的特卖
	 * 
	 * @param cond
	 * @param page
	 * @return
	 */
	public Page<BrandShow> queryWaitAuditBrandShowByPage(Map<String, ?> cond,
			int... page);

	/**
	 * 审核通过
	 * 
	 * @param brandShowId
	 * @param startDate
	 * @param endDate
	 * @param auditor
	 * @param opinion
	 * @return
	 */
	public long passAuditBrandShow(long brandShowId, Date startDate,
			Date endDate, String auditor, String opinion);

	/**
	 * 审核驳回
	 * 
	 * @param brandShowId
	 * @param auditor
	 * @param opinion
	 * @return
	 */
	public long rejectAuditBrandShow(long brandShowId, String auditor,
			String opinion);

	/**
	 * 开始活动
	 * 
	 * @param brandShowId
	 * @return
	 */
	public long startBrandShow(long brandShowId);

	/**
	 * 结束活动
	 * 
	 * @param brandShowId
	 * @return
	 */
	public long endBrandSow(long brandShowId);

	/**
	 * 
	 * @param brandShowId
	 *            特卖Id
	 * @return
	 */
	public BrandShow getBrandShowById(Long brandShowId);

	/**
	 * 取活动明细
	 * 
	 * @param brandShowId
	 * @return
	 */
	public List<BrandShowDetail> getDetailsOfBrandShow(long brandShowId);

	/**
	 * 
	 * @param brandShowDetailId
	 *            特卖明细ID
	 * @return
	 */
	public BrandShowDetail getBrandShowDetailById(Long brandShowDetailId);

	/**
	 * 
	 * @param brandShowIds
	 *            特卖ID列表
	 * @return
	 */
	public List<BrandShow> getBrandShowByIds(List<Long> brandShowIds);

	/**
	 * 
	 * @param brandShowDetailIds
	 *            特卖明细ID列表
	 * @return
	 */
	public List<BrandShowDetail> getBrandShowDetailsByIds(
			List<Long> brandShowDetailIds);

	/**
	 * 
	 * @param brandShowDetailIds
	 *            有效的特卖明细列表
	 * @return
	 */
	public List<BrandShow> getValidBrandShows(BrandShow record);

	public BigDecimal getLowestPrice(Long bsid);

	public Page<BrandShowDetail> getBrandShowDetailByPage(Map<?, ?> map,
			Page<BrandShowDetail> page);
}
