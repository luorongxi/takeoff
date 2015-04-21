package com.kjdc.entity.school;

/**  
 * @类功能说明：  省份信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:37:28  
 * @版本：V1.0  
 */
public class TbProvinceInfo implements java.io.Serializable {

	// Fields

	/**  
	 * @Fields  serialVersionUID : versionUID  
	 */
	private static final long serialVersionUID = 169895813383936275L;
	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  provinceName : 省份名
	 */
	private String provinceName;

	// Constructors

	/** default constructor */
	public TbProvinceInfo() {
	}

	/** full constructor */
	public TbProvinceInfo(String provinceName) {
		this.provinceName = provinceName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	@Override
	public String toString() {
		return "TbProvinceInfo [id=" + id + ", provinceName=" + provinceName
				+ "]";
	}

}