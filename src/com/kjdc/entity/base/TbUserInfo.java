package com.kjdc.entity.base;

/**  
 * @类功能说明：管理员信息实体类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午1:01:48  
 * @版本：V1.0  
 */
public class TbUserInfo implements java.io.Serializable {

	/**  
	 * @Fields  serialVersionUID : versionUID 
	 */
	private static final long serialVersionUID = -7539994840249545309L;
	// Fields

	/**  
	 * @Fields  id : 主键id  
	 */
	private Integer id;
	/**  
	 * @Fields  loginName : 登陆名  
	 */
	private String loginName;
	/**  
	 * @Fields  loginPass : 密码  
	 */
	private String loginPass;
	/**  
	 * @Fields  userName : 姓名  
	 */
	private String userName;
	/**  
	 * @Fields  sex : 性别  
	 */
	private String sex;
	/**  
	 * @Fields  roleId : 权限id 
	 */
	private Integer roleId;
	/**  
	 * @Fields  tel : 电话
	 */
	private String tel;
	/**  
	 * @Fields  email : 邮箱 
	 */
	private String email;
	/**  
	 * @Fields  deptId : 如果是商家管理员，为商家id 
	 */
	private String deptId;

	// Constructors

	/** default constructor */
	public TbUserInfo() {
	}

	/** minimal constructor */
	public TbUserInfo(String loginName, String loginPass, String userName,
			Integer roleid) {
		this.loginName = loginName;
		this.loginPass = loginPass;
		this.userName = userName;
		this.roleId = roleId;
	}

	/** full constructor */
	public TbUserInfo(String loginName, String loginPass, String userName,
			String sex, Integer roleid, String tel, String email, String deptId) {
		this.loginName = loginName;
		this.loginPass = loginPass;
		this.userName = userName;
		this.sex = sex;
		this.roleId = roleId;
		this.tel = tel;
		this.email = email;
		this.deptId = deptId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPass() {
		return this.loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDeptId() {
		return this.deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "TbUserInfo [id=" + id + ", loginName=" + loginName
				+ ", loginPass=" + loginPass + ", userName=" + userName
				+ ", sex=" + sex + ", roleId=" + roleId + ", tel=" + tel
				+ ", email=" + email + ", deptId=" + deptId + "]";
	}

}