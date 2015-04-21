package com.kjdc.entity.base;

import java.sql.Timestamp;

/**  
 * @类功能说明：  菜单信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午1:00:25  
 * @版本：V1.0  
 */
public class TbSysmenu implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID  
	 */
	private static final long serialVersionUID = 6707248875216487215L;
	// Fields

	/**  
	 * @Fields  id : 主键id
	 */
	private Integer id;
	/**  
	 * @Fields  pId : 父ID
	 */
	private String pId;
	/**  
	 * @Fields  name : 菜单名
	 */
	private String name;
	/**  
	 * @Fields  url : URL路径
	 */
	private String url;
	/**  
	 * @Fields  target : 打开方式
	 */
	private String target;
	/**  
	 * @Fields  rel : 刷新模块
	 */
	private String rel;
	/**  
	 * @Fields  open : 是否展开(true:是,false:否) 
	 */
	private String open;
	/**  
	 * @Fields  sort : 排序
	 */
	private Integer sort;
	/**  
	 * @Fields  status : 帐号状态（0:可用，1:禁用，2:删除）.
	 */
	private String status;
	/**  
	 * @Fields  creater : 创建人.
	 */
	private String creater;
	/**  
	 * @Fields  createTime : 创建时间.
	 */
	private Timestamp createTime;
	/**  
	 * @Fields  isValid : 点击事件
	 */
	private String click;
	/**  
	 * @Fields  addTime : 已设置  
	 */
	private String check;

	// Constructors

	/** default constructor */
	public TbSysmenu() {
	}

	/** full constructor */
	public TbSysmenu(String pId, String name, String url,
			String target, String rel, String open, Integer sort,
			String status, String creater, Timestamp createTime) {
		this.pId = pId;
		this.name = name;
		this.url = url;
		this.target = target;
		this.rel = rel;
		this.open = open;
		this.sort = sort;
		this.status = status;
		this.creater = creater;
		this.createTime = createTime;
	}

	// Property accessors
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getClick() {
		return click;
	}

	public void setClick(String click) {
		this.click = click;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "TbSysmenu [id=" + id + ", pId=" + pId + ", name=" + name
				+ ", url=" + url + ", target=" + target + ", rel=" + rel
				+ ", open=" + open + ", sort=" + sort + ", status=" + status
				+ ", creater=" + creater + ", createTime=" + createTime
				+ ", click=" + click + ", check=" + check + "]";
	}
	
}