package com.kjdc.entity.base;

import java.sql.Timestamp;

/**  
 * @类功能说明： 菜单权限关系实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午12:59:04  
 * @版本：V1.0  
 */
public class TbRoleRight implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID
	 */
	private static final long serialVersionUID = -6670744548132431064L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  roleId : 权限id  
	 */
	private Integer roleId;
	/**  
	 * @Fields  menuId : 菜单id
	 */
	private Integer menuId;
	/**  
	 * @Fields  addTime : 创建时间
	 */
	private Timestamp addTime;

	// Constructors

	/** default constructor */
	public TbRoleRight() {
	}

	/** full constructor */
	public TbRoleRight(Integer roleId, Integer menuId, Timestamp addTime) {
		this.roleId = roleId;
		this.menuId = menuId;
		this.addTime = addTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Override
	public String toString() {
		return "TbRoleRight [id=" + id + ", roleId=" + roleId + ", menuId="
				+ menuId + ", addTime=" + addTime + "]";
	}
	
}