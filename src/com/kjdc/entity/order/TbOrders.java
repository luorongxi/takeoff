package com.kjdc.entity.order;

import java.sql.Timestamp;

/**  
 * @类功能说明：  订单信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:37:07  
 * @版本：V1.0  
 */
public class TbOrders implements java.io.Serializable {

	// Fields

	/**  
	 * @Fields  serialVersionUID : versionUID  
	 */
	private static final long serialVersionUID = -2193392031737214595L;
	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  guestId : 下单用户id
	 */
	private Integer guestId;
	/**  
	 * @Fields  canteensId : 商家id 
	 */
	private Integer canteensId;
	/**  
	 * @Fields  totalPrice : 总价
	 */
	private Double totalPrice;
	/**  
	 * @Fields  addTime : 添加时间
	 */
	private Timestamp addTime;
	/**  
	 * @Fields  beginTime : 开始时间，时分为日送餐时段开始
	 */
	private Timestamp beginTime;
	/**  
	 * @Fields  endTime : 结束时间，时分为日送餐时段结束
	 */
	private Timestamp endTime;
	/**  
	 * @Fields  weekInfo : 周几可送，多个用，隔开，如1,2,4，如果为-1则只送一天
	 */
	private Integer weekInfo;
	/**  
	 * @Fields  address : 收货地址
	 */
	private String address;
	/**  
	 * @Fields  phone : 联系电话
	 */
	private String phone;
	/**  
	 * @Fields  linkMan : 联系人
	 */
	private String linkMan;
	/**  
	 * @Fields  status : 状态(0:下单,1:接受2:拒绝,3:送货中,4:收款5:完成)
	 */
	private Boolean status;
	/**  
	 * @Fields  finishTime : 成交次数，默认0
	 */
	private Integer finishTime;

	// Constructors

	/** default constructor */
	public TbOrders() {
	}

	/** full constructor */
	public TbOrders(Integer guestId, Integer canteensId, Double totalPrice,
			Timestamp addTime, Timestamp beginTime, Timestamp endTime,
			Integer weekInfo, String address, String phone, String linkMan,
			Boolean status, Integer finishTime) {
		this.guestId = guestId;
		this.canteensId = canteensId;
		this.totalPrice = totalPrice;
		this.addTime = addTime;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.weekInfo = weekInfo;
		this.address = address;
		this.phone = phone;
		this.linkMan = linkMan;
		this.status = status;
		this.finishTime = finishTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGuestId() {
		return this.guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public Integer getCanteensId() {
		return this.canteensId;
	}

	public void setCanteensId(Integer canteensId) {
		this.canteensId = canteensId;
	}

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
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

	public Integer getWeekInfo() {
		return this.weekInfo;
	}

	public void setWeekInfo(Integer weekInfo) {
		this.weekInfo = weekInfo;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLinkMan() {
		return this.linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(Integer finishTime) {
		this.finishTime = finishTime;
	}

	@Override
	public String toString() {
		return "TbOrders [id=" + id + ", guestId=" + guestId + ", canteensId="
				+ canteensId + ", totalPrice=" + totalPrice + ", addTime="
				+ addTime + ", beginTime=" + beginTime + ", endTime=" + endTime
				+ ", weekInfo=" + weekInfo + ", address=" + address
				+ ", phone=" + phone + ", linkMan=" + linkMan + ", status="
				+ status + ", finishTime=" + finishTime + "]";
	}

}