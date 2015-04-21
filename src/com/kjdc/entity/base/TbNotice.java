package com.kjdc.entity.base;

import java.sql.Timestamp;

/**  
 * @类功能说明：  系统消息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:36:20  
 * @版本：V1.0  
 */
public class TbNotice implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID
	 */
	private static final long serialVersionUID = -4970563688494461915L;
	// Fields

	/**  
	 * @Fields  id : 主键id 
	 */
	private Integer id;
	/**  
	 * @Fields  title : 标题
	 */
	private String title;
	/**  
	 * @Fields  content : 内容
	 */
	private String content;
	/**  
	 * @Fields  operatorId : 操作者
	 */
	private Integer operatorId;
	/**  
	 * @Fields  status : 状态 
	 */
	private Integer status;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;
	/**  
	 * @Fields  updTime : 修改时间
	 */
	private Timestamp updTime;

	// Constructors

	/** default constructor */
	public TbNotice() {
	}

	/** minimal constructor */
	public TbNotice(String title, String content, Integer operatorId,
			Integer status, Timestamp addTime) {
		this.title = title;
		this.content = content;
		this.operatorId = operatorId;
		this.status = status;
		this.addTime = addTime;
	}

	/** full constructor */
	public TbNotice(String title, String content, Integer operatorId,
			Integer status, Timestamp addTime, Timestamp updTime) {
		this.title = title;
		this.content = content;
		this.operatorId = operatorId;
		this.status = status;
		this.addTime = addTime;
		this.updTime = updTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Timestamp getUpdTime() {
		return this.updTime;
	}

	public void setUpdTime(Timestamp updTime) {
		this.updTime = updTime;
	}

	@Override
	public String toString() {
		return "TbNotice [id=" + id + ", title=" + title + ", content="
				+ content + ", operatorId=" + operatorId + ", status=" + status
				+ ", addTime=" + addTime + ", updTime=" + updTime + "]";
	}

}