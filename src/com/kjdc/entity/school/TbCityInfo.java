package com.kjdc.entity.school;

/**  
 * @类功能说明：  城市信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:31:45  
 * @版本：V1.0  
 */
public class TbCityInfo implements java.io.Serializable {

	// Fields

	/**  
	 * @Fields  serialVersionUID : versionUID  
	 */
	private static final long serialVersionUID = -8890854789211194538L;
	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  provinceId : 省份id
	 */
	private Integer provinceId;
	/**  
	 * @Fields  cityName : 城市名
	 */
	private String cityName;

	// Constructors

	/** default constructor */
	public TbCityInfo() {
	}

	/** full constructor */
	public TbCityInfo(Integer provinceId, String cityName) {
		this.provinceId = provinceId;
		this.cityName = cityName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "TbCityInfo [id=" + id + ", provinceId=" + provinceId
				+ ", cityName=" + cityName + "]";
	}

}