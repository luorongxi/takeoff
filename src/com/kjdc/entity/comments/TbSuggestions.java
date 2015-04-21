package com.kjdc.entity.comments;

import java.sql.Timestamp;

/**  
 * @类功能说明：建议信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:59:48  
 * @版本：V1.0  
 */
public class TbSuggestions implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID
	 */
	private static final long serialVersionUID = 3901471984273780857L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  suggestionInfo : 建议内容
	 */
	private String suggestionInfo;
	/**  
	 * @Fields  sendGuestId : 发送者id
	 */
	private Integer sendGuestId;
	/**  
	 * @Fields  toCanteenId : 对象商家id
	 */
	private Integer toCanteenId;
	/**  
	 * @Fields  addTiem : 创建时间
	 */
	private Timestamp addTiem;
	/**  
	 * @Fields  responseTime : 回复时间
	 */
	private Timestamp responseTime;
	/**  
	 * @Fields  responseInfo : 反馈信息
	 */
	private String responseInfo;
	/**  
	 * @Fields  status : 状态(0:停用,1:启用)
	 */
	private Boolean status;

	// Constructors

	/** default constructor */
	public TbSuggestions() {
	}

	/** minimal constructor */
	public TbSuggestions(String suggestionInfo, Integer sendGuestId,
			Integer toCanteenId, Timestamp addTiem, Boolean status) {
		this.suggestionInfo = suggestionInfo;
		this.sendGuestId = sendGuestId;
		this.toCanteenId = toCanteenId;
		this.addTiem = addTiem;
		this.status = status;
	}

	/** full constructor */
	public TbSuggestions(String suggestionInfo, Integer sendGuestId,
			Integer toCanteenId, Timestamp addTiem, Timestamp responseTime,
			String responseInfo, Boolean status) {
		this.suggestionInfo = suggestionInfo;
		this.sendGuestId = sendGuestId;
		this.toCanteenId = toCanteenId;
		this.addTiem = addTiem;
		this.responseTime = responseTime;
		this.responseInfo = responseInfo;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSuggestionInfo() {
		return this.suggestionInfo;
	}

	public void setSuggestionInfo(String suggestionInfo) {
		this.suggestionInfo = suggestionInfo;
	}

	public Integer getSendGuestId() {
		return this.sendGuestId;
	}

	public void setSendGuestId(Integer sendGuestId) {
		this.sendGuestId = sendGuestId;
	}

	public Integer getToCanteenId() {
		return this.toCanteenId;
	}

	public void setToCanteenId(Integer toCanteenId) {
		this.toCanteenId = toCanteenId;
	}

	public Timestamp getAddTiem() {
		return this.addTiem;
	}

	public void setAddTiem(Timestamp addTiem) {
		this.addTiem = addTiem;
	}

	public Timestamp getResponseTime() {
		return this.responseTime;
	}

	public void setResponseTime(Timestamp responseTime) {
		this.responseTime = responseTime;
	}

	public String getResponseInfo() {
		return this.responseInfo;
	}

	public void setResponseInfo(String responseInfo) {
		this.responseInfo = responseInfo;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TbSuggestions [id=" + id + ", suggestionInfo=" + suggestionInfo
				+ ", sendGuestId=" + sendGuestId + ", toCanteenId="
				+ toCanteenId + ", addTiem=" + addTiem + ", responseTime="
				+ responseTime + ", responseInfo=" + responseInfo + ", status="
				+ status + "]";
	}

}