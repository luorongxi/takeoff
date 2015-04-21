package com.kjdc.entity.base;

import java.sql.Timestamp;

/**  
 * @类功能说明：  权限信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:58:37  
 * @版本：V1.0  
 */
public class TbRoleInfo implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  roleName : 权限名
	 */
	private String roleName;
	/**  
	 * @Fields  status : 状态(0:可用,1:不可用)
	 */
	private Boolean status;
	/**  
	 * @Fields  memo : 备注
	 */
	private String memo;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;
	/**  
	 * @Fields  upTime : 更新时间
	 */
	private Timestamp upTime;

	// Constructors

	/** default constructor */
	public TbRoleInfo() {
	}

	/** minimal constructor */
	public TbRoleInfo(String roleName, Boolean status, Timestamp addTime) {
		this.roleName = roleName;
		this.status = status;
		this.addTime = addTime;
	}

	/** full constructor */
	public TbRoleInfo(String roleName, Boolean status, String memo,
			Timestamp addTime, Timestamp upTime) {
		this.roleName = roleName;
		this.status = status;
		this.memo = memo;
		this.addTime = addTime;
		this.upTime = upTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Timestamp getUpTime() {
		return this.upTime;
	}

	public void setUpTime(Timestamp upTime) {
		this.upTime = upTime;
	}

	@Override
	public String toString() {
		return "TbRoleInto [id=" + id + ", roleName=" + roleName + ", status="
				+ status + ", memo=" + memo + ", addTime=" + addTime
				+ ", upTime=" + upTime + "]";
	}

}