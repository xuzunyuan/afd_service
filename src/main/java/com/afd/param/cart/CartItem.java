package com.afd.param.cart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class CartItem implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4754561596172698295L;
	
	// 特卖明细ID
	private Long brandShowDetailId;
	// 商品id
	private Long prodId;
	// skuid
	private Long skuId;
	// 商品code
	private String prodCode;
	// skuCode
	private String skuCode;
	// 数量
	private Long num;
	// 商品名称
	private String prodName;
	// 规格id
	private String specId;
	// 规格名称
	private String specName;
	// 商品图片url
	private String skuImgUrl;
	// 是否选中
	private boolean selected;
	// 明细状态码
	private long statusCode;
	// sku的规格
	private List<Map<String, String>> specs;
	// 市场价
	private BigDecimal orgPrice;
	// 特卖价
	private BigDecimal showPrice;
	// 库存
	private Long stock;
	// 排序权重
	private int sortWeight;
	// 基础类目三级id
	private Long bcId;
	// 商品重量
	private BigDecimal weight;
	// 商品体积
	private BigDecimal volume;
	// 规格值与skuid的对应关系(json串)
	private String skuMap;
	// 规格id与名称的对应关系
	private Map<String, String> specIdName;
	// 规格值id与名称的对应关系
	private Map<String, String> specValIdName;
	// 规格与规格值得关系（id）
	private Map<String, List<String>> specIdMap;
	// 规格值id与图片地址
	private Map<String, String> specValIdImgUrl;
	//该商品的其他skus（包括库存，价格等信息）
	private String jsonOtherSku;

	/**
	 * 获取促销的剩余时间(单位：秒)
	 * 
	 * @return
	 */
	public long getRestOfTime() {
		//TODO
		return 0l;
	}

	public Long getBrandShowDetailId() {
		return brandShowDetailId;
	}

	public void setBrandShowDetailId(Long brandShowDetailId) {
		this.brandShowDetailId = brandShowDetailId;
	}

	public BigDecimal getOrgPrice() {
		return orgPrice;
	}

	public void setOrgPrice(BigDecimal orgPrice) {
		this.orgPrice = orgPrice;
	}

	public BigDecimal getShowPrice() {
		return showPrice;
	}

	public void setShowPrice(BigDecimal showPrice) {
		this.showPrice = showPrice;
	}

	public Map<String, List<String>> getSpecIdMap() {
		return specIdMap;
	}

	public void setSpecIdMap(Map<String, List<String>> specIdMap) {
		this.specIdMap = specIdMap;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
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

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getSkuImgUrl() {
		return skuImgUrl;
	}

	public void setSkuImgUrl(String skuImgUrl) {
		this.skuImgUrl = skuImgUrl;
	}

	public List<Map<String, String>> getSpecs() {
		return specs;
	}

	public void setSpecs(List<Map<String, String>> specs) {
		this.specs = specs;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public long getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(long statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((skuId == null) ? 0 : skuId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItem other = (CartItem) obj;
		if (skuId == null) {
			if (other.skuId != null)
				return false;
		} else if (!skuId.equals(other.skuId))
			return false;
		return true;
	}

	public CookieCartItem transferCookieCartItem() {

		CookieCartItem cookieCartItem = new CookieCartItem();
		cookieCartItem.setNum(this.num);
		cookieCartItem.setSelected(this.selected);
		cookieCartItem.setBrandShowDetailId(this.brandShowDetailId);

		return cookieCartItem;
	}

	public int getSortWeight() {
		return sortWeight;
	}

	public void setSortWeight(int sortWeight) {
		this.sortWeight = sortWeight;
	}

	public String getSpecId() {
		return specId;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public Long getBcId() {
		return bcId;
	}

	public void setBcId(Long bcId) {
		this.bcId = bcId;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Map<String, String> getSpecIdName() {
		return specIdName;
	}

	public void setSpecIdName(Map<String, String> specIdName) {
		this.specIdName = specIdName;
	}

	public Map<String, String> getSpecValIdName() {
		return specValIdName;
	}

	public void setSpecValIdName(Map<String, String> specValIdName) {
		this.specValIdName = specValIdName;
	}

	public Map<String, String> getSpecValIdImgUrl() {
		return specValIdImgUrl;
	}

	public void setSpecValIdImgUrl(Map<String, String> specValIdImgUrl) {
		this.specValIdImgUrl = specValIdImgUrl;
	}

	public String getSkuMap() {
		return skuMap;
	}

	public void setSkuMap(String skuMap) {
		this.skuMap = skuMap;
	}

	public Map<String, String> getCurrentSpecId() {
		if(StringUtils.isNotBlank(this.specId)){
			Map<String, String> currentSpecId = new HashMap<String, String>();
			String[] specIds = this.specId.split("\\|\\|\\|");
			if(specIds !=null&&specIds.length>0){
				for(String spId : specIds){
					String[] idAndVal = spId.split("\\:\\:\\:");
					if(idAndVal !=null&&idAndVal.length>=2){
						currentSpecId.put(idAndVal[0], idAndVal[1]);
					}
				}
			}
			return currentSpecId;
		}
		return null;
	}

	public String getJsonOtherSku() {
		return jsonOtherSku;
	}

	public void setJsonOtherSku(String jsonOtherSku) {
		this.jsonOtherSku = jsonOtherSku;
	}
}
