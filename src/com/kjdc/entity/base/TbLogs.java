package com.kjdc.entity.base;

import java.sql.Timestamp;

/**  
 * @类功能说明： 系统日志实体类. 
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:36:00  
 * @版本：V1.0  
 */
public class TbLogs implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID
	 */
	private static final long serialVersionUID = -4779798945347652045L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  logInfo : 日志内容
	 */
	private String logInfo;
	/**  
	 * @Fields  operaterId : 操作员id  
	 */
	private Integer operaterId;
	/**  
	 * @Fields  addTime : 创建时间 
	 */
	private Timestamp addTime;

	// Constructors

	/** default constructor */
	public TbLogs() {
	}

	/** full constructor */
	public TbLogs(String logInfo, Integer operaterId, Timestamp addTime) {
		this.logInfo = logInfo;
		this.operaterId = operaterId;
		this.addTime = addTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogInfo() {
		return this.logInfo;
	}

	public void setLogInfo(String logInfo) {
		this.logInfo = logInfo;
	}

	public Integer getOperaterId() {
		return this.operaterId;
	}

	public void setOperaterId(Integer operaterId) {
		this.operaterId = operaterId;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Override
	public String toString() {
		return "TbLogs [id=" + id + ", logInfo=" + logInfo + ", operaterId="
				+ operaterId + ", addTime=" + addTime + "]";
	}

}