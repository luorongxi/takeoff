package com.kjdc.entity.comments;

/**  
 * @类功能说明：  商家滚动图片实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:33:40  
 * @版本：V1.0  
 */
public class TbImgrool implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID  
	 */
	private static final long serialVersionUID = 5515458778310817718L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  canteenId : 商家id
	 */
	private Integer canteenId;
	/**  
	 * @Fields  picPath : 图片地址
	 */
	private String picPath;
	/**  
	 * @Fields  dishId : 图片类型 (>0菜品ID、套餐ID，<0该商家优惠劵ID)
	 */
	private Integer dishId;
	/**  
	 * @Fields  memo : 描述信息，可用于图片+文字显示
	 */
	private String memo;
	/**  
	 * @Fields  orderNum : 排序
	 */
	private Integer orderNum;

	// Constructors

	/** default constructor */
	public TbImgrool() {
	}

	/** full constructor */
	public TbImgrool(Integer canteenId, String picPath, Integer dishId,
			String memo, Integer orderNum) {
		this.canteenId = canteenId;
		this.picPath = picPath;
		this.dishId = dishId;
		this.memo = memo;
		this.orderNum = orderNum;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getDishId() {
		return this.dishId;
	}

	public void setDishId(Integer dishId) {
		this.dishId = dishId;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	@Override
	public String toString() {
		return "TbImgrool [id=" + id + ", canteenId=" + canteenId
				+ ", picPath=" + picPath + ", dishId=" + dishId + ", memo="
				+ memo + ", orderNum=" + orderNum + "]";
	}

}