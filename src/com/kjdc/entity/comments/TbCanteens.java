package com.kjdc.entity.comments;

import java.sql.Timestamp;

/**  
 * @类功能说明：  商家信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:31:12  
 * @版本：V1.0  
 */
public class TbCanteens implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID 
	 */
	private static final long serialVersionUID = -1338253249770432303L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  loginName : 账号
	 */
	private String loginName;
	/**  
	 * @Fields  loginPwd : 密码
	 */
	private String loginPwd;
	/**  
	 * @Fields  name : 商家名称
	 */
	private String name;
	/**  
	 * @Fields  picPath : 头像地址
	 */
	private String picPath;
	/**  
	 * @Fields  address : 联系地址
	 */
	private String address;
	/**  
	 * @Fields  locationX : 经度
	 */
	private Float locationX;
	/**  
	 * @Fields  locationY : 纬度
	 */
	private Float locationY;
	/**  
	 * @Fields  introduction : 简介
	 */
	private String introduction;
	/**  
	 * @Fields  description : 描述信息,可用附件本  
	 */
	private String description;
	/**  
	 * @Fields  inschoolId : 所属学校id
	 */
	private Integer inschoolId;
	/**  
	 * @Fields  phone : 手机号码
	 */
	private String phone;
	/**  
	 * @Fields  linkManName : 联系人
	 */
	private String linkManName;
	/**  
	 * @Fields  score : 评分(0--100分)
	 */
	private Short score;
	/**  
	 * @Fields  goodNum : 点赞数 
	 */
	private Integer goodNum;
	/**  
	 * @Fields  badNum : 踩数
	 */
	private Integer badNum;
	/**  
	 * @Fields  clickCount : 点击数
	 */
	private Integer clickCount;
	/**  
	 * @Fields  status : 状态(0:停用,1:启用,2:待审核,3:审核退回) 
	 */
	private Boolean status;
	/**  
	 * @Fields  addTime : 创建时间 
	 */
	private Timestamp addTime;
	/**  
	 * @Fields  checkInfo : 审核说明
	 */
	private String checkInfo;

	// Constructors

	/** default constructor */
	public TbCanteens() {
	}

	/** minimal constructor */
	public TbCanteens(String loginName, String loginPwd, String name,
			String picPath, String address, Float locationX, Float locationY,
			String introduction, String description, Integer inschoolId,
			String phone, String linkManName, Short score, Integer goodNum,
			Integer badNum, Integer clickCount, Boolean status) {
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.name = name;
		this.picPath = picPath;
		this.address = address;
		this.locationX = locationX;
		this.locationY = locationY;
		this.introduction = introduction;
		this.description = description;
		this.inschoolId = inschoolId;
		this.phone = phone;
		this.linkManName = linkManName;
		this.score = score;
		this.goodNum = goodNum;
		this.badNum = badNum;
		this.clickCount = clickCount;
		this.status = status;
	}

	/** full constructor */
	public TbCanteens(String loginName, String loginPwd, String name,
			String picPath, String address, Float locationX, Float locationY,
			String introduction, String description, Integer inschoolId,
			String phone, String linkManName, Short score, Integer goodNum,
			Integer badNum, Integer clickCount, Boolean status,
			Timestamp addTime, String checkInfo) {
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.name = name;
		this.picPath = picPath;
		this.address = address;
		this.locationX = locationX;
		this.locationY = locationY;
		this.introduction = introduction;
		this.description = description;
		this.inschoolId = inschoolId;
		this.phone = phone;
		this.linkManName = linkManName;
		this.score = score;
		this.goodNum = goodNum;
		this.badNum = badNum;
		this.clickCount = clickCount;
		this.status = status;
		this.addTime = addTime;
		this.checkInfo = checkInfo;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return this.loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicPath() {
		return this.picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Float getLocationX() {
		return this.locationX;
	}

	public void setLocationX(Float locationX) {
		this.locationX = locationX;
	}

	public Float getLocationY() {
		return this.locationY;
	}

	public void setLocationY(Float locationY) {
		this.locationY = locationY;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getInschoolId() {
		return this.inschoolId;
	}

	public void setInschoolId(Integer inschoolId) {
		this.inschoolId = inschoolId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLinkManName() {
		return this.linkManName;
	}

	public void setLinkManName(String linkManName) {
		this.linkManName = linkManName;
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

	public Integer getClickCount() {
		return this.clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
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

	public String getCheckInfo() {
		return this.checkInfo;
	}

	public void setCheckInfo(String checkInfo) {
		this.checkInfo = checkInfo;
	}

	@Override
	public String toString() {
		return "TbCanteens [id=" + id + ", loginName=" + loginName
				+ ", loginPwd=" + loginPwd + ", name=" + name + ", picPath="
				+ picPath + ", address=" + address + ", locationX=" + locationX
				+ ", locationY=" + locationY + ", introduction=" + introduction
				+ ", description=" + description + ", inschoolId=" + inschoolId
				+ ", phone=" + phone + ", linkManName=" + linkManName
				+ ", score=" + score + ", goodNum=" + goodNum + ", badNum="
				+ badNum + ", clickCount=" + clickCount + ", status=" + status
				+ ", addTime=" + addTime + ", checkInfo=" + checkInfo + "]";
	}

}