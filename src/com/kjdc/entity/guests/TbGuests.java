package com.kjdc.entity.guests;

import java.sql.Timestamp;

/**  
 * @类功能说明：  客户信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:33:13  
 * @版本：V1.0  
 */
public class TbGuests implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID
	 */
	private static final long serialVersionUID = -3392959612240186724L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  guestName : 用户昵称
	 */
	private String guestName;
	/**  
	 * @Fields  guestPhone : 验证通过后的手机号码（是本人手机)
	 */
	private String guestPhone;
	/**  
	 * @Fields  userPwd : 密码 
	 */
	private String userPwd;
	/**  
	 * @Fields  inSchoolId : 所在学校ID
	 */
	private Integer inSchoolId;
	/**  
	 * @Fields  gtId : 个推ID
	 */
	private String gtId;
	/**  
	 * @Fields  memo : 备注 
	 */
	private String memo;
	/**  
	 * @Fields  address : 联系地址  
	 */
	private String address;
	/**  
	 * @Fields  status : 状态(0:停用,1:启用用户,2:启用送餐)
	 */
	private Boolean status;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;
	/**  
	 * @Fields  guestLevel : 客户等级，初始0级  
	 */
	private Integer guestLevel;
	/**  
	 * @Fields  treatTimes : 完成交易次数
	 */
	private Integer treatTimes;
	/**  
	 * @Fields  lostTimes : 爽约次数  
	 */
	private Integer lostTimes;
	/**  
	 * @Fields  totalPay : 总成交金额
	 */
	private Double totalPay;
	/**  
	 * @Fields  goldNum : 预留，金币数，备用，可考虑后期用于兑换奖品或餐劵  
	 */
	private Integer goldNum;
	/**  
	 * @Fields  config : 配置，预留
	 */
	private String config;
	/**  
	 * @Fields  accessToken : 返回的令牌数据
	 */
	private String accessToken;
	/**  
	 * @Fields  longtitude : 最后上传位置经度  
	 */
	private Float longtitude;
	/**  
	 * @Fields  lantitude : 最后上传纬度
	 */
	private Float lantitude;

	// Constructors

	/** default constructor */
	public TbGuests() {
	}

	/** minimal constructor */
	public TbGuests(String guestName, String userPwd, Integer inSchoolId,
			Boolean status, Timestamp addTime, Integer treatTimes,
			Integer lostTimes, Double totalPay) {
		this.guestName = guestName;
		this.userPwd = userPwd;
		this.inSchoolId = inSchoolId;
		this.status = status;
		this.addTime = addTime;
		this.treatTimes = treatTimes;
		this.lostTimes = lostTimes;
		this.totalPay = totalPay;
	}

	/** full constructor */
	public TbGuests(String guestName, String guestPhone, String userPwd,
			Integer inSchoolId, String gtId, String memo, String address,
			Boolean status, Timestamp addTime, Integer guestLevel,
			Integer treatTimes, Integer lostTimes, Double totalPay,
			Integer goldNum, String config, String accessToken,
			Float longtitude, Float lantitude) {
		this.guestName = guestName;
		this.guestPhone = guestPhone;
		this.userPwd = userPwd;
		this.inSchoolId = inSchoolId;
		this.gtId = gtId;
		this.memo = memo;
		this.address = address;
		this.status = status;
		this.addTime = addTime;
		this.guestLevel = guestLevel;
		this.treatTimes = treatTimes;
		this.lostTimes = lostTimes;
		this.totalPay = totalPay;
		this.goldNum = goldNum;
		this.config = config;
		this.accessToken = accessToken;
		this.longtitude = longtitude;
		this.lantitude = lantitude;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGuestName() {
		return this.guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestPhone() {
		return this.guestPhone;
	}

	public void setGuestPhone(String guestPhone) {
		this.guestPhone = guestPhone;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public Integer getInSchoolId() {
		return this.inSchoolId;
	}

	public void setInSchoolId(Integer inSchoolId) {
		this.inSchoolId = inSchoolId;
	}

	public String getGtId() {
		return this.gtId;
	}

	public void setGtId(String gtId) {
		this.gtId = gtId;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Integer getGuestLevel() {
		return this.guestLevel;
	}

	public void setGuestLevel(Integer guestLevel) {
		this.guestLevel = guestLevel;
	}

	public Integer getTreatTimes() {
		return this.treatTimes;
	}

	public void setTreatTimes(Integer treatTimes) {
		this.treatTimes = treatTimes;
	}

	public Integer getLostTimes() {
		return this.lostTimes;
	}

	public void setLostTimes(Integer lostTimes) {
		this.lostTimes = lostTimes;
	}

	public Double getTotalPay() {
		return this.totalPay;
	}

	public void setTotalPay(Double totalPay) {
		this.totalPay = totalPay;
	}

	public Integer getGoldNum() {
		return this.goldNum;
	}

	public void setGoldNum(Integer goldNum) {
		this.goldNum = goldNum;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Float getLongtitude() {
		return this.longtitude;
	}

	public void setLongtitude(Float longtitude) {
		this.longtitude = longtitude;
	}

	public Float getLantitude() {
		return this.lantitude;
	}

	public void setLantitude(Float lantitude) {
		this.lantitude = lantitude;
	}

	@Override
	public String toString() {
		return "TbGuests [id=" + id + ", guestName=" + guestName
				+ ", guestPhone=" + guestPhone + ", userPwd=" + userPwd
				+ ", inSchoolId=" + inSchoolId + ", gtId=" + gtId + ", memo="
				+ memo + ", address=" + address + ", status=" + status
				+ ", addTime=" + addTime + ", guestLevel=" + guestLevel
				+ ", treatTimes=" + treatTimes + ", lostTimes=" + lostTimes
				+ ", totalPay=" + totalPay + ", goldNum=" + goldNum
				+ ", config=" + config + ", accessToken=" + accessToken
				+ ", longtitude=" + longtitude + ", lantitude=" + lantitude
				+ "]";
	}

}