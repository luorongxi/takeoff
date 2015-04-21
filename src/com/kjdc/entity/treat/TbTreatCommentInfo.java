package com.kjdc.entity.treat;

import java.sql.Timestamp;

/**  
 * @类功能说明：拼团评论信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午1:00:51  
 * @版本：V1.0  
 */
public class TbTreatCommentInfo implements java.io.Serializable {

	// Fields

	/**  
	 * @Fields  serialVersionUID : versionUID  
	 */
	private static final long serialVersionUID = 8525896574408991218L;
	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  guestId : 评论者id
	 */
	private Integer guestId;
	/**  
	 * @Fields  treatId : 请客信息id  
	 */
	private Integer treatId;
	/**  
	 * @Fields  treatCommentMessage : 请客评论
	 */
	private String treatCommentMessage;
	/**  
	 * @Fields  type : 类型(0:一般,1:踩,2:点赞)
	 */
	private Boolean type;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;
	/**  
	 * @Fields  score : 评分(0--100分)
	 */
	private Short score;
	/**  
	 * @Fields  isPraise : 是否点赞(0:是,1:否) 
	 */
	private Boolean isPraise;
	/**  
	 * @Fields  isStep : 是否踩(0:是,1:否)
	 */
	private Boolean isStep;

	// Constructors

	/** default constructor */
	public TbTreatCommentInfo() {
	}

	/** minimal constructor */
	public TbTreatCommentInfo(Integer guestId, Integer treatId,
			String treatCommentMessage, Boolean type, Timestamp addTime,
			Short score) {
		this.guestId = guestId;
		this.treatId = treatId;
		this.treatCommentMessage = treatCommentMessage;
		this.type = type;
		this.addTime = addTime;
		this.score = score;
	}

	/** full constructor */
	public TbTreatCommentInfo(Integer guestId, Integer treatId,
			String treatCommentMessage, Boolean type, Timestamp addTime,
			Short score, Boolean isPraise, Boolean isStep) {
		this.guestId = guestId;
		this.treatId = treatId;
		this.treatCommentMessage = treatCommentMessage;
		this.type = type;
		this.addTime = addTime;
		this.score = score;
		this.isPraise = isPraise;
		this.isStep = isStep;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGuestId() {
		return this.guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public Integer getTreatId() {
		return this.treatId;
	}

	public void setTreatId(Integer treatId) {
		this.treatId = treatId;
	}

	public String getTreatCommentMessage() {
		return this.treatCommentMessage;
	}

	public void setTreatCommentMessage(String treatCommentMessage) {
		this.treatCommentMessage = treatCommentMessage;
	}

	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Short getScore() {
		return this.score;
	}

	public void setScore(Short score) {
		this.score = score;
	}

	public Boolean getIsPraise() {
		return this.isPraise;
	}

	public void setIsPraise(Boolean isPraise) {
		this.isPraise = isPraise;
	}

	public Boolean getIsStep() {
		return this.isStep;
	}

	public void setIsStep(Boolean isStep) {
		this.isStep = isStep;
	}

	@Override
	public String toString() {
		return "TbTreatCommentInfo [id=" + id + ", guestId=" + guestId
				+ ", treatId=" + treatId + ", treatCommentMessage="
				+ treatCommentMessage + ", type=" + type + ", addTime="
				+ addTime + ", score=" + score + ", isPraise=" + isPraise
				+ ", isStep=" + isStep + "]";
	}

}