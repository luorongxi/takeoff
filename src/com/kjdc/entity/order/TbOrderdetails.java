package com.kjdc.entity.order;

/**  
 * @类功能说明：  订单详情实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:36:40  
 * @版本：V1.0  
 */
public class TbOrderdetails implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID 
	 */
	private static final long serialVersionUID = 4970134467542527692L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  num : 数量
	 */
	private Integer num;
	/**  
	 * @Fields  orderId : 订单id
	 */
	private Integer orderId;
	/**  
	 * @Fields  dishsId : 菜品id
	 */
	private Integer dishsId;
	/**  
	 * @Fields  totalPrice : 总价
	 */
	private Double totalPrice;
	/**  
	 * @Fields  ptice : 单价
	 */
	private Double ptice;

	// Constructors

	/** default constructor */
	public TbOrderdetails() {
	}

	/** full constructor */
	public TbOrderdetails(Integer num, Integer orderId, Integer dishsId,
			Double totalPrice, Double ptice) {
		this.num = num;
		this.orderId = orderId;
		this.dishsId = dishsId;
		this.totalPrice = totalPrice;
		this.ptice = ptice;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getDishsId() {
		return this.dishsId;
	}

	public void setDishsId(Integer dishsId) {
		this.dishsId = dishsId;
	}

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getPtice() {
		return this.ptice;
	}

	public void setPtice(Double ptice) {
		this.ptice = ptice;
	}

	@Override
	public String toString() {
		return "TbOrderdetails [id=" + id + ", num=" + num + ", orderId="
				+ orderId + ", dishsId=" + dishsId + ", totalPrice="
				+ totalPrice + ", ptice=" + ptice + "]";
	}

}