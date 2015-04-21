package com.kjdc.entity.treat;

import java.sql.Timestamp;

/**  
 * @类功能说明：拼团信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午1:01:27  
 * @版本：V1.0  
 */
public class TbTreatInfo implements java.io.Serializable {

	// Fields

	/**  
	 * @Fields  serialVersionUID : versionUID 
	 */
	private static final long serialVersionUID = -5550309147631051604L;
	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  schoolId : 学校ID，请客在某学校附近
	 */
	private Integer schoolId;
	/**  
	 * @Fields  guestId : 发起者ID
	 */
	private Integer guestId;
	/**  
	 * @Fields  beginTime : 开始时间
	 */
	private Timestamp beginTime;
	/**  
	 * @Fields  endTime : 结束时间
	 */
	private Timestamp endTime;
	/**  
	 * @Fields  maxNum : 人数上限
	 */
	private Integer maxNum;
	/**  
	 * @Fields  nowNum : 现有报名人数
	 */
	private Integer nowNum;
	/**  
	 * @Fields  treatMessage : 拼团信息
	 */
	private String treatMessage;
	/**  
	 * @Fields  lookTimes : 浏览次数 
	 */
	private Integer lookTimes;
	/**  
	 * @Fields  address : 地址信息
	 */
	private String address;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;
	/**  
	 * @Fields  updateTime : 最后更新时间
	 */
	private Timestamp updateTime;
	/**  
	 * @Fields  status : 状态(0:停用,1:启用)
	 */
	private Boolean status;

	// Constructors

	/** default constructor */
	public TbTreatInfo() {
	}

	/** minimal constructor */
	public TbTreatInfo(Integer schoolId, Integer guestId, Timestamp beginTime,
			Timestamp endTime, Integer maxNum, Integer nowNum,
			String treatMessage, Integer lookTimes, String address,
			Timestamp addTime, Boolean status) {
		this.schoolId = schoolId;
		this.guestId = guestId;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.maxNum = maxNum;
		this.nowNum = nowNum;
		this.treatMessage = treatMessage;
		this.lookTimes = lookTimes;
		this.address = address;
		this.addTime = addTime;
		this.status = status;
	}

	/** full constructor */
	public TbTreatInfo(Integer schoolId, Integer guestId, Timestamp beginTime,
			Timestamp endTime, Integer maxNum, Integer nowNum,
			String treatMessage, Integer lookTimes, String address,
			Timestamp addTime, Timestamp updateTime, Boolean status) {
		this.schoolId = schoolId;
		this.guestId = guestId;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.maxNum = maxNum;
		this.nowNum = nowNum;
		this.treatMessage = treatMessage;
		this.lookTimes = lookTimes;
		this.address = address;
		this.addTime = addTime;
		this.updateTime = updateTime;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public Integer getGuestId() {
		return this.guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public Timestamp getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Timestamp beginTime) {
		this.beginTime = beginTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Integer getMaxNum() {
		return this.maxNum;
	}

	public void setMaxNum(Integer maxNum) {
		this.maxNum = maxNum;
	}

	public Integer getNowNum() {
		return this.nowNum;
	}

	public void setNowNum(Integer nowNum) {
		this.nowNum = nowNum;
	}

	public String getTreatMessage() {
		return this.treatMessage;
	}

	public void setTreatMessage(String treatMessage) {
		this.treatMessage = treatMessage;
	}

	public Integer getLookTimes() {
		return this.lookTimes;
	}

	public void setLookTimes(Integer lookTimes) {
		this.lookTimes = lookTimes;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TbTreatInfo [id=" + id + ", schoolId=" + schoolId
				+ ", guestId=" + guestId + ", beginTime=" + beginTime
				+ ", endTime=" + endTime + ", maxNum=" + maxNum + ", nowNum="
				+ nowNum + ", treatMessage=" + treatMessage + ", lookTimes="
				+ lookTimes + ", address=" + address + ", addTime=" + addTime
				+ ", updateTime=" + updateTime + ", status=" + status + "]";
	}

}