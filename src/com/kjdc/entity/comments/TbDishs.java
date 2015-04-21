package com.kjdc.entity.comments;

import java.sql.Timestamp;

/**  
 * @类功能说明：  菜品套餐信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:32:40  
 * @版本：V1.0  
 */
public class TbDishs implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID  
	 */
	private static final long serialVersionUID = 8681617336471884564L;
	// Fields

	/**  
	 * @Fields  id : 主键id 
	 */
	private Integer id;
	/**  
	 * @Fields  dishName : 菜名
	 */
	private String dishName;
	/**  
	 * @Fields  description : 描述
	 */
	private String description;
	/**  
	 * @Fields  canteenId : 商家id
	 */
	private Integer canteenId;
	/**  
	 * @Fields  picPath : 图片路径
	 */
	private String picPath;
	/**  
	 * @Fields  price : 价格
	 */
	private Double price;
	/**  
	 * @Fields  disCount : 折扣(0--100%)
	 */
	private Boolean disCount;
	/**  
	 * @Fields  isSpecialPrice : 是否特价(0:是,1:否)
	 */
	private Boolean isSpecialPrice;
	/**  
	 * @Fields  isSpecialRecommend : 是否是特色菜(0:是,1:否)
	 */
	private Boolean isSpecialRecommend;
	/**  
	 * @Fields  clickCount : 点击数 
	 */
	private Integer clickCount;
	/**  
	 * @Fields  score : 评分(0--100分) 
	 */
	private Short score;
	/**  
	 * @Fields  goodNum : 点赞次数
	 */
	private Integer goodNum;
	/**  
	 * @Fields  badNum : 踩次数 
	 */
	private Integer badNum;
	/**  
	 * @Fields  type : 菜色类别 (0: 荤菜,1: 素菜, 2: 主食,3: 汤 ,4: 甜点, 5: 小炒 ,6: 清真,20:综合，套餐使用)
	 */
	private Short type;
	/**  
	 * @Fields  isMeal : 是否套餐(0:是,1:否)
	 */
	private Boolean isMeal;
	/**  
	 * @Fields  dishsInMeal : 套餐中的菜品id信息，用，隔开
	 */
	private String dishsInMeal;
	/**  
	 * @Fields  isBreakfast : 是否早餐(0:是,1:否)  
	 */
	private Boolean isBreakfast;
	/**  
	 * @Fields  isLunch : 是否午餐(0:是,1:否)
	 */
	private Boolean isLunch;
	/**  
	 * @Fields  isDinner : 是否晚餐(0:是,1:否)
	 */
	private Boolean isDinner;
	/**  
	 * @Fields  collectionTime : 收藏次数
	 */
	private Integer collectionTime;
	/**  
	 * @Fields  cuisine : 菜系分类(菜系，0 家常 1 闽菜 2 鲁菜 3 川菜 4 徽菜 5 粤菜 6 苏菜 7 浙菜 8 湘菜 9 东北菜 )
	 */
	private Boolean cuisine;
	/**  
	 * @Fields  status : 状态(0:停用,1:启用)
	 */
	private Boolean status;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;

	// Constructors

	/** default constructor */
	public TbDishs() {
	}

	/** minimal constructor */
	public TbDishs(String dishName, String description, Integer canteenId,
			Double price, Boolean disCount, Boolean isSpecialPrice,
			Boolean isSpecialRecommend, Integer clickCount, Short score,
			Integer goodNum, Integer badNum, Short type, Boolean isMeal,
			Boolean isBreakfast, Boolean isLunch, Boolean isDinner,
			Integer collectionTime, Boolean cuisine, Boolean status) {
		this.dishName = dishName;
		this.description = description;
		this.canteenId = canteenId;
		this.price = price;
		this.disCount = disCount;
		this.isSpecialPrice = isSpecialPrice;
		this.isSpecialRecommend = isSpecialRecommend;
		this.clickCount = clickCount;
		this.score = score;
		this.goodNum = goodNum;
		this.badNum = badNum;
		this.type = type;
		this.isMeal = isMeal;
		this.isBreakfast = isBreakfast;
		this.isLunch = isLunch;
		this.isDinner = isDinner;
		this.collectionTime = collectionTime;
		this.cuisine = cuisine;
		this.status = status;
	}

	/** full constructor */
	public TbDishs(String dishName, String description, Integer canteenId,
			String picPath, Double price, Boolean disCount,
			Boolean isSpecialPrice, Boolean isSpecialRecommend,
			Integer clickCount, Short score, Integer goodNum, Integer badNum,
			Short type, Boolean isMeal, String dishsInMeal,
			Boolean isBreakfast, Boolean isLunch, Boolean isDinner,
			Integer collectionTime, Boolean cuisine, Boolean status,
			Timestamp addTime) {
		this.dishName = dishName;
		this.description = description;
		this.canteenId = canteenId;
		this.picPath = picPath;
		this.price = price;
		this.disCount = disCount;
		this.isSpecialPrice = isSpecialPrice;
		this.isSpecialRecommend = isSpecialRecommend;
		this.clickCount = clickCount;
		this.score = score;
		this.goodNum = goodNum;
		this.badNum = badNum;
		this.type = type;
		this.isMeal = isMeal;
		this.dishsInMeal = dishsInMeal;
		this.isBreakfast = isBreakfast;
		this.isLunch = isLunch;
		this.isDinner = isDinner;
		this.collectionTime = collectionTime;
		this.cuisine = cuisine;
		this.status = status;
		this.addTime = addTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDishName() {
		return this.dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCanteenId() {
		return this.canteenId;
	}

	public void setCanteenId(Integer canteenId) {
		this.canteenId = canteenId;
	}

	public String getPicPath() {
		return this.picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getDisCount() {
		return this.disCount;
	}

	public void setDisCount(Boolean disCount) {
		this.disCount = disCount;
	}

	public Boolean getIsSpecialPrice() {
		return this.isSpecialPrice;
	}

	public void setIsSpecialPrice(Boolean isSpecialPrice) {
		this.isSpecialPrice = isSpecialPrice;
	}

	public Boolean getIsSpecialRecommend() {
		return this.isSpecialRecommend;
	}

	public void setIsSpecialRecommend(Boolean isSpecialRecommend) {
		this.isSpecialRecommend = isSpecialRecommend;
	}

	public Integer getClickCount() {
		return this.clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	public Short getScore() {
		return this.score;
	}

	public void setScore(Short score) {
		this.score = score;
	}

	public Integer getGoodNum() {
		return this.goodNum;
	}

	public void setGoodNum(Integer goodNum) {
		this.goodNum = goodNum;
	}

	public Integer getBadNum() {
		return this.badNum;
	}

	public void setBadNum(Integer badNum) {
		this.badNum = badNum;
	}

	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Boolean getIsMeal() {
		return this.isMeal;
	}

	public void setIsMeal(Boolean isMeal) {
		this.isMeal = isMeal;
	}

	public String getDishsInMeal() {
		return this.dishsInMeal;
	}

	public void setDishsInMeal(String dishsInMeal) {
		this.dishsInMeal = dishsInMeal;
	}

	public Boolean getIsBreakfast() {
		return this.isBreakfast;
	}

	public void setIsBreakfast(Boolean isBreakfast) {
		this.isBreakfast = isBreakfast;
	}

	public Boolean getIsLunch() {
		return this.isLunch;
	}

	public void setIsLunch(Boolean isLunch) {
		this.isLunch = isLunch;
	}

	public Boolean getIsDinner() {
		return this.isDinner;
	}

	public void setIsDinner(Boolean isDinner) {
		this.isDinner = isDinner;
	}

	public Integer getCollectionTime() {
		return this.collectionTime;
	}

	public void setCollectionTime(Integer collectionTime) {
		this.collectionTime = collectionTime;
	}

	public Boolean getCuisine() {
		return this.cuisine;
	}

	public void setCuisine(Boolean cuisine) {
		this.cuisine = cuisine;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Override
	public String toString() {
		return "TbDishs [id=" + id + ", dishName=" + dishName
				+ ", description=" + description + ", canteenId=" + canteenId
				+ ", picPath=" + picPath + ", price=" + price + ", disCount="
				+ disCount + ", isSpecialPrice=" + isSpecialPrice
				+ ", isSpecialRecommend=" + isSpecialRecommend
				+ ", clickCount=" + clickCount + ", score=" + score
				+ ", goodNum=" + goodNum + ", badNum=" + badNum + ", type="
				+ type + ", isMeal=" + isMeal + ", dishsInMeal=" + dishsInMeal
				+ ", isBreakfast=" + isBreakfast + ", isLunch=" + isLunch
				+ ", isDinner=" + isDinner + ", collectionTime="
				+ collectionTime + ", cuisine=" + cuisine + ", status="
				+ status + ", addTime=" + addTime + "]";
	}

}