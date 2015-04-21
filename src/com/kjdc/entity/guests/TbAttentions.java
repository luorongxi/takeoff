package com.kjdc.entity.guests;

import java.sql.Timestamp;

/**  
 * @类功能说明：  客户关注收藏实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:29:40  
 * @版本：V1.0  
 */
public class TbAttentions implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID
	 */
	private static final long serialVersionUID = -2558106936973344062L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  guestId : 客户id
	 */
	private Integer guestId;
	/**  
	 * @Fields  toId :  菜品或套餐或店铺id
	 */
	private Integer toId;
	/**  
	 * @Fields  type : 类型(0:收藏菜品,1:关注店铺)
	 */
	private Boolean type;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;

	// Constructors

	/** default constructor */
	public TbAttentions() {
	}

	/** full constructor */
	public TbAttentions(Integer guestId, Integer toId, Boolean type,
			Timestamp addTime) {
		this.guestId = guestId;
		this.toId = toId;
		this.type = type;
		this.addTime = addTime;
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

	public Integer getToId() {
		return this.toId;
	}

	public void setToId(Integer toId) {
		this.toId = toId;
	}

	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Override
	public String toString() {
		return "TbAttentions [id=" + id + ", guestId=" + guestId + ", toId="
				+ toId + ", type=" + type + ", addTime=" + addTime + "]";
	}

}