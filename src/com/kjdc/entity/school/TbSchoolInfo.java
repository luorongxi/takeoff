package com.kjdc.entity.school;

import java.sql.Timestamp;

/**  
 * @类功能说明：  学校信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:59:30  
 * @版本：V1.0  
 */
public class TbSchoolInfo implements java.io.Serializable {

	// Fields

	/**  
	 * @Fields  serialVersionUID : versionUID  
	 */
	private static final long serialVersionUID = -8471504399478328826L;
	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  cityId : 城市id
	 */
	private Integer cityId;
	/**  
	 * @Fields  schoolName : 学校名称
	 */
	private String schoolName;
	/**  
	 * @Fields  schoolAddtess : 学校地址
	 */
	private String schoolAddtess;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;
	/**  
	 * @Fields  status : 状态(0:停用,1:启用)
	 */
	private Boolean status;
	/**  
	 * @Fields  memo : 备注
	 */
	private String memo;
	/**  
	 * @Fields  stopicCount : 拼团论坛发帖数
	 */
	private Integer stopicCount;
	/**  
	 * @Fields  masterId : 版主ID，备用 
	 */
	private Integer masterId;
	/**  
	 * @Fields  clickCount : 点击率
	 */
	private Integer clickCount;

	// Constructors

	/** default constructor */
	public TbSchoolInfo() {
	}

	/** minimal constructor */
	public TbSchoolInfo(Integer cityId, String schoolName,
			String schoolAddtess, Timestamp addTime, Boolean status,
			Integer stopicCount, Integer clickCount) {
		this.cityId = cityId;
		this.schoolName = schoolName;
		this.schoolAddtess = schoolAddtess;
		this.addTime = addTime;
		this.status = status;
		this.stopicCount = stopicCount;
		this.clickCount = clickCount;
	}

	/** full constructor */
	public TbSchoolInfo(Integer cityId, String schoolName,
			String schoolAddtess, Timestamp addTime, Boolean status,
			String memo, Integer stopicCount, Integer masterId,
			Integer clickCount) {
		this.cityId = cityId;
		this.schoolName = schoolName;
		this.schoolAddtess = schoolAddtess;
		this.addTime = addTime;
		this.status = status;
		this.memo = memo;
		this.stopicCount = stopicCount;
		this.masterId = masterId;
		this.clickCount = clickCount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddtess() {
		return this.schoolAddtess;
	}

	public void setSchoolAddtess(String schoolAddtess) {
		this.schoolAddtess = schoolAddtess;
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

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getStopicCount() {
		return this.stopicCount;
	}

	public void setStopicCount(Integer stopicCount) {
		this.stopicCount = stopicCount;
	}

	public Integer getMasterId() {
		return this.masterId;
	}

	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}

	public Integer getClickCount() {
		return this.clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	@Override
	public String toString() {
		return "TbSchoolInfo [id=" + id + ", cityId=" + cityId
				+ ", schoolName=" + schoolName + ", schoolAddtess="
				+ schoolAddtess + ", addTime=" + addTime + ", status=" + status
				+ ", memo=" + memo + ", stopicCount=" + stopicCount
				+ ", masterId=" + masterId + ", clickCount=" + clickCount + "]";
	}

}