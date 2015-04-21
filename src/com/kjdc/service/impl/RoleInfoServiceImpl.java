package com.kjdc.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kjdc.common.dao.BaseDao;
import com.kjdc.common.page.PageBean;
import com.kjdc.common.page.PageParam;
import com.kjdc.common.utils.ConstantUtil;
import com.kjdc.common.utils.StringUtil;
import com.kjdc.entity.base.TbRoleInfo;
import com.kjdc.entity.base.TbRoleRight;
import com.kjdc.service.RoleInfoService;
import com.opensymphony.xwork2.ActionContext;


/**  
 * @类功能说明：  角色管理接口实现类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-18 下午9:18:32  
 * @版本：V1.0  
 */
@Service("roleInfoService")
@Transactional
public class RoleInfoServiceImpl extends BaseDao<TbRoleInfo> implements RoleInfoService {
	private static final Log log = LogFactory.getLog(RoleInfoServiceImpl.class);

	/**
	 * 按添加检索分页列表查询.
	 */
	@Override
	public PageBean queryForPage(TbRoleInfo roleInfo, PageParam pageParam) {
		//获取当前系统用户账号.
		Map<String, Object> session = ActionContext.getContext().getSession();
		String loginName = (String) session.get("LOGIN_NAME");
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tb_role_info where 1=1");
		if(!ConstantUtil.ADMIN.equals(loginName)){
			sql.append(" and roleName!='").append(ConstantUtil.ADMIN_ROLE).append("'");
		}
		if (!StringUtil.isNull(roleInfo)&&StringUtils.isNotBlank(roleInfo.getRoleName())){
			sql.append(" and roleName like '%").append(roleInfo.getRoleName()).append("%' ");
		}
		sql.append(" order by addTime asc");
		return super.queryForDwzPage(sql.toString(), pageParam);
	}

	/**
	 * 保存角色信息.
	 */
	@Override
	public void saveData(TbRoleInfo roleInfo, String[] menuIds) {
		//保存角色信息.
		Date date = new Date();
		Timestamp timeNow = new Timestamp(date.getTime());
		StringBuilder sql = new StringBuilder();
		sql.append("insert into tb_role_info (roleName,status,memo,addTime) values (?,?,?,?)");
		Object[] args = new Object[]{roleInfo.getRoleName(),roleInfo.getStatus(),roleInfo.getMemo(),timeNow};
		super.save(sql.toString(), args);
	}

	/**
	 * 根据ID查看角色信息详情.
	 */
	@Override
	public TbRoleInfo getRoleInfoById(Integer id) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tb_role_info where id=?");
		return super.findById(sql.toString(),id.toString());
	}

	/**
	 * 更新角色信息.
	 */
	@Override
	public void updateData(TbRoleInfo roleInfo) {
		Date date = new Date();
		Timestamp timeNow = new Timestamp(date.getTime());
		StringBuilder sql = new StringBuilder();
		sql.append("update tb_role_info set roleName=?, status=?, memo=?, upTime=? where id=?");
		Object[] args = new Object[]{roleInfo.getRoleName(),roleInfo.getStatus(),roleInfo.getMemo(),timeNow,roleInfo.getId()};
		super.update(sql.toString(), args);
	}

	/**
	 * 删除角色信息.
	 */
	@Override
	public void deleteDataById(String id) {
		StringBuilder sql = new StringBuilder();
		sql.append("delete from tb_role_info where id=?");
		Object[] args = new Object[]{id};
		super.delete(sql.toString(), args);
		//删除菜单权限关系信息.
		StringBuilder sqlrm = new StringBuilder();
		sqlrm.append("delete from tb_role_right where roleId=?");
		super.delete(sqlrm.toString(), args);
	}

	/**
	 * 设置权限.
	 */
	@Override
	public void setPrivilege(TbRoleRight roleRight, String[] menuIds) {
		//先删除已设置的角色权限关联
		Object[] argrm = new Object[]{roleRight.getRoleId()};
		StringBuilder sqlrm = new StringBuilder();
		sqlrm.append("delete from tb_role_right where roleId=?");
		super.delete(sqlrm.toString(), argrm);
		//再保存角色菜单关联.
		Date date = new Date();
		Timestamp timeNow = new Timestamp(date.getTime());
		if(menuIds!=null&&menuIds.length>0){
			for(int i=0;i<menuIds.length;i++){
				String menuId=menuIds[i];
				StringBuilder sql = new StringBuilder();
				sql.append("insert into tb_role_right (roleId,menuId,addTime) values (?,?,?)");
				Object[] args = new Object[]{roleRight.getRoleId(),menuId,timeNow};
				super.save(sql.toString(), args);
			}	
		}
	}

}
