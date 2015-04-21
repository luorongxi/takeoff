package com.kjdc.entity.comments;

import java.sql.Timestamp;

/**  
 * @类功能说明：商家定时推送数据实体类.  
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:57:32  
 * @版本：V1.0  
 */
public class TbPushInfo implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID 
	 */
	private static final long serialVersionUID = 7118642281799978331L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  canteensId : 商家ID
	 */
	private Integer canteensId;
	/**  
	 * @Fields  pushNum : 推送次数
	 */
	private Integer pushNum;
	/**  
	 * @Fields  title : 推送标题
	 */
	private String title;
	/**  
	 * @Fields  pushInfo : 推送内容
	 */
	private String pushInfo;
	/**  
	 * @Fields  pushTime : 推送时间
	 */
	private Timestamp pushTime;
	/**  
	 * @Fields  onTime : 每天推送区间(每天的次时间发送，轮询间隔5分钟，比如设置11:00发送，实际发送时间在11:00-11:05之间) 
	 */
	private Timestamp onTime;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;
	/**  
	 * @Fields  status : 状态(0:停用,1:启用,2:待审核) 
	 */
	private Boolean status;
	/**  
	 * @Fields  pay : 收费 
	 */
	private Double pay;
	/**  
	 * @Fields  leftPushNum : 余下多少未发送
	 */
	private Integer leftPushNum;
	/**  
	 * @Fields  schoolId : 学校ID
	 */
	private Integer schoolId;
	/**  
	 * @Fields  cityId : 城市ID
	 */
	private Integer cityId;
	/**  
	 * @Fields  provinvceId : 省份ID  
	 */
	private Integer provinvceId;

	// Constructors

	/** default constructor */
	public TbPushInfo() {
	}

	/** minimal constructor */
	public TbPushInfo(Integer canteensId, Integer pushNum, String title,
			String pushInfo, Timestamp pushTime, Timestamp addTime,
			Boolean status, Double pay, Integer leftPushNum) {
		this.canteensId = canteensId;
		this.pushNum = pushNum;
		this.title = title;
		this.pushInfo = pushInfo;
		this.pushTime = pushTime;
		this.addTime = addTime;
		this.status = status;
		this.pay = pay;
		this.leftPushNum = leftPushNum;
	}

	/** full constructor */
	public TbPushInfo(Integer canteensId, Integer pushNum, String title,
			String pushInfo, Timestamp pushTime, Timestamp onTime,
			Timestamp addTime, Boolean status, Double pay, Integer leftPushNum,
			Integer schoolId, Integer cityId, Integer provinvceId) {
		this.canteensId = canteensId;
		this.pushNum = pushNum;
		this.title = title;
		this.pushInfo = pushInfo;
		this.pushTime = pushTime;
		this.onTime = onTime;
		this.addTime = addTime;
		this.status = status;
		this.pay = pay;
		this.leftPushNum = leftPushNum;
		this.schoolId = schoolId;
		this.cityId = cityId;
		this.provinvceId = provinvceId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCanteensId() {
		return this.canteensId;
	}

	public void setCanteensId(Integer canteensId) {
		this.canteensId = canteensId;
	}

	public Integer getPushNum() {
		return this.pushNum;
	}

	public void setPushNum(Integer pushNum) {
		this.pushNum = pushNum;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPushInfo() {
		return this.pushInfo;
	}

	public void setPushInfo(String pushInfo) {
		this.pushInfo = pushInfo;
	}

	public Timestamp getPushTime() {
		return this.pushTime;
	}

	public void setPushTime(Timestamp pushTime) {
		this.pushTime = pushTime;
	}

	public Timestamp getOnTime() {
		return this.onTime;
	}

	public void setOnTime(Timestamp onTime) {
		this.onTime = onTime;
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

	public Double getPay() {
		return this.pay;
	}

	public void setPay(Double pay) {
		this.pay = pay;
	}

	public Integer getLeftPushNum() {
		return this.leftPushNum;
	}

	public void setLeftPushNum(Integer leftPushNum) {
		this.leftPushNum = leftPushNum;
	}

	public Integer getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getProvinvceId() {
		return this.provinvceId;
	}

	public void setProvinvceId(Integer provinvceId) {
		this.provinvceId = provinvceId;
	}

	@Override
	public String toString() {
		return "TbPushInfo [id=" + id + ", canteensId=" + canteensId
				+ ", pushNum=" + pushNum + ", title=" + title + ", pushInfo="
				+ pushInfo + ", pushTime=" + pushTime + ", onTime=" + onTime
				+ ", addTime=" + addTime + ", status=" + status + ", pay="
				+ pay + ", leftPushNum=" + leftPushNum + ", schoolId="
				+ schoolId + ", cityId=" + cityId + ", provinvceId="
				+ provinvceId + "]";
	}

}