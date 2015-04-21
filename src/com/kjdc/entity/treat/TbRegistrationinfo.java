package com.kjdc.entity.treat;

import java.sql.Timestamp;

/**  
 * @类功能说明： 拼团贴响应信息实体类. 
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:58:01  
 * @版本：V1.0  
 */
public class TbRegistrationinfo implements java.io.Serializable {

	// Fields

	/**  
	 * @Fields  serialVersionUID : versionUID   
	 */
	private static final long serialVersionUID = -6057821919283747734L;
	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  initiatedGuestId : 发起者ID，如发帖人，或发出请求的人  
	 */
	private Integer initiatedGuestId;
	/**  
	 * @Fields  accessGuestId : 接受者ID，如回帖人，接受请客要求者，接受AA请求者等
	 */
	private Integer accessGuestId;
	/**  
	 * @Fields  status : 状态(-1:过期,0:待确认,1:已确认,2:已拒绝) 
	 */
	private Boolean status;
	/**  
	 * @Fields  treatId : 请客ID，如果是请好友，则生成多条此信息分别发送
	 */
	private Integer treatId;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;
	/**  
	 * @Fields  endTime : 过期时间，过期后自动更改为无效
	 */
	private Timestamp endTime;
	/**  
	 * @Fields  memo : 备注说明，如回复等使用
	 */
	private String memo;

	// Constructors

	/** default constructor */
	public TbRegistrationinfo() {
	}

	/** minimal constructor */
	public TbRegistrationinfo(Integer initiatedGuestId, Integer accessGuestId,
			Boolean status, Integer treatId, Timestamp addTime) {
		this.initiatedGuestId = initiatedGuestId;
		this.accessGuestId = accessGuestId;
		this.status = status;
		this.treatId = treatId;
		this.addTime = addTime;
	}

	/** full constructor */
	public TbRegistrationinfo(Integer initiatedGuestId, Integer accessGuestId,
			Boolean status, Integer treatId, Timestamp addTime,
			Timestamp endTime, String memo) {
		this.initiatedGuestId = initiatedGuestId;
		this.accessGuestId = accessGuestId;
		this.status = status;
		this.treatId = treatId;
		this.addTime = addTime;
		this.endTime = endTime;
		this.memo = memo;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInitiatedGuestId() {
		return this.initiatedGuestId;
	}

	public void setInitiatedGuestId(Integer initiatedGuestId) {
		this.initiatedGuestId = initiatedGuestId;
	}

	public Integer getAccessGuestId() {
		return this.accessGuestId;
	}

	public void setAccessGuestId(Integer accessGuestId) {
		this.accessGuestId = accessGuestId;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getTreatId() {
		return this.treatId;
	}

	public void setTreatId(Integer treatId) {
		this.treatId = treatId;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "TbRegistrationinfo [id=" + id + ", initiatedGuestId="
				+ initiatedGuestId + ", accessGuestId=" + accessGuestId
				+ ", status=" + status + ", treatId=" + treatId + ", addTime="
				+ addTime + ", endTime=" + endTime + ", memo=" + memo + "]";
	}

}