package com.kjdc.entity.comments;

import java.sql.Timestamp;

/**  
 * @类功能说明：  商家菜品评论实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:32:12  
 * @版本：V1.0  
 */
public class TbComments implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID
	 */
	private static final long serialVersionUID = -448077816693229653L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  dishOrMealId : 菜品或套餐,对商家的评论则为-1
	 */
	private Integer dishOrMealId;
	/**  
	 * @Fields  type : 类别(0: 对菜品,1:对套餐,2: 对商家)
	 */
	private Boolean type;
	/**  
	 * @Fields  guestId : 评论id
	 */
	private Integer guestId;
	/**  
	 * @Fields  score : 评分(0--100分) 
	 */
	private Short score;
	/**  
	 * @Fields  emotion : 表情
	 */
	private Boolean emotion;
	/**  
	 * @Fields  title : 评论标题
	 */
	private String title;
	/**  
	 * @Fields  contents : 评论内容
	 */
	private String contents;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;
	/**  
	 * @Fields  status : 状态(0:停用,1:启用)
	 */
	private Boolean status;
	/**  
	 * @Fields  isGood : 点赞 
	 */
	private Integer isGood;
	/**  
	 * @Fields  isBad : 踩
	 */
	private Integer isBad;
	/**  
	 * @Fields  canteensId : 商家ID，如果是对菜品和套餐的评论，即为菜品或套餐的所在商家ID
	 */
	private Integer canteensId;

	// Constructors

	/** default constructor */
	public TbComments() {
	}

	/** minimal constructor */
	public TbComments(Integer dishOrMealId, Boolean type, Integer guestId,
			Short score, Boolean emotion, String title, String contents,
			Timestamp addTime, Boolean status, Integer canteensId) {
		this.dishOrMealId = dishOrMealId;
		this.type = type;
		this.guestId = guestId;
		this.score = score;
		this.emotion = emotion;
		this.title = title;
		this.contents = contents;
		this.addTime = addTime;
		this.status = status;
		this.canteensId = canteensId;
	}

	/** full constructor */
	public TbComments(Integer dishOrMealId, Boolean type, Integer guestId,
			Short score, Boolean emotion, String title, String contents,
			Timestamp addTime, Boolean status, Integer isGood, Integer isBad,
			Integer canteensId) {
		this.dishOrMealId = dishOrMealId;
		this.type = type;
		this.guestId = guestId;
		this.score = score;
		this.emotion = emotion;
		this.title = title;
		this.contents = contents;
		this.addTime = addTime;
		this.status = status;
		this.isGood = isGood;
		this.isBad = isBad;
		this.canteensId = canteensId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDishOrMealId() {
		return this.dishOrMealId;
	}

	public void setDishOrMealId(Integer dishOrMealId) {
		this.dishOrMealId = dishOrMealId;
	}

	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	public Integer getGuestId() {
		return this.guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public Short getScore() {
		return this.score;
	}

	public void setScore(Short score) {
		this.score = score;
	}

	public Boolean getEmotion() {
		return this.emotion;
	}

	public void setEmotion(Boolean emotion) {
		this.emotion = emotion;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getIsGood() {
		return this.isGood;
	}

	public void setIsGood(Integer isGood) {
		this.isGood = isGood;
	}

	public Integer getIsBad() {
		return this.isBad;
	}

	public void setIsBad(Integer isBad) {
		this.isBad = isBad;
	}

	public Integer getCanteensId() {
		return this.canteensId;
	}

	public void setCanteensId(Integer canteensId) {
		this.canteensId = canteensId;
	}

	@Override
	public String toString() {
		return "TbComments [id=" + id + ", dishOrMealId=" + dishOrMealId
				+ ", type=" + type + ", guestId=" + guestId + ", score="
				+ score + ", emotion=" + emotion + ", title=" + title
				+ ", contents=" + contents + ", addTime=" + addTime
				+ ", status=" + status + ", isGood=" + isGood + ", isBad="
				+ isBad + ", canteensId=" + canteensId + "]";
	}

}