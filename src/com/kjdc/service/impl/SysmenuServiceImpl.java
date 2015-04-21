package com.kjdc.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kjdc.common.dao.BaseDao;
import com.kjdc.common.page.PageBean;
import com.kjdc.common.page.PageParam;
import com.kjdc.entity.base.TbSysmenu;
import com.kjdc.service.SysmenuService;

/**  
 * @类功能说明： 菜单信息接口实现类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午11:58:56  
 * @版本：V1.0  
 */
@Service("sysmenuService")
@Transactional
public class SysmenuServiceImpl extends BaseDao<TbSysmenu> implements SysmenuService {

	/**
	 * 根据当前登陆用户ID获取菜单信息. 
	 */
	@Override
	public List<TbSysmenu> getMenuByUserId(Integer id) {
		StringBuilder sql = new StringBuilder();
		sql.append("select m.* from tb_user_info u,tb_role_right r,tb_sysmenu m where u.id=? and m.status='0' and u.roleId=r.roleId and r.menuId=m.id order by sort asc");
		Object[] args = new Object[]{id};
		return super.list(sql.toString(),TbSysmenu.class,args);
	}

	/**
	 * 获取所有的可用的菜单信息.
	 */
	@Override
	public List<TbSysmenu> getTreeList() {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tb_sysmenu where status='0' order by sort asc");
		return super.list(sql.toString(),TbSysmenu.class,null);
	}

	/**
	 *  获取所有菜单信息.
	 */
	@Override
	public List<TbSysmenu> findSysMenuAll() {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tb_sysmenu order by sort asc");
		return super.list(sql.toString(),TbSysmenu.class,null);
	}

	/**
	 * 系统菜单分页列表查询.
	 */
	@Override
	public PageBean queryForPage(String parentId, PageParam pageParam) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tb_sysmenu where 1=1");
		if (StringUtils.isNotBlank(parentId)){
			sql.append(" and pId='").append(parentId).append("'");
		}
		sql.append(" order by sort asc");
		return super.queryForDwzPage(sql.toString(), pageParam);
	}

	/**
	 * 按添加检索分页列表查询.
	 */
	@Override
	public PageBean queryForPage(TbSysmenu sysMenu, PageParam pageParam) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tb_sysmenu where 1=1");
		if (StringUtils.isNotBlank(sysMenu.getName())){
			sql.append(" and name like '%").append(sysMenu.getName()).append("%' ");
		}
		if (StringUtils.isNotBlank(sysMenu.getpId())){
			sql.append(" and pId='").append(sysMenu.getpId()).append("'");
		}
		sql.append(" order by sort asc");
		return super.queryForDwzPage(sql.toString(), pageParam);
	}

	/**
	 *  保存菜单信息.
	 */
	@Override
	public void saveData(TbSysmenu sysMenu) {
		Date date = new Date();
		Timestamp timeNow = new Timestamp(date.getTime());
		StringBuilder sql = new StringBuilder();
		sql.append("insert into tb_sysmenu (pId,name,url,target,rel,open,sort,status,creater,createTime) values (?,?,?,?,?,?,?,?,?,?)");
		Object[] args = new Object[]{sysMenu.getpId(),sysMenu.getName(),sysMenu.getUrl(),sysMenu.getTarget(),sysMenu.getRel(),sysMenu.getOpen(),sysMenu.getSort(),sysMenu.getStatus(),sysMenu.getCreater(),timeNow};
		super.save(sql.toString(), args);
	}

	/**
	 * 根据ID获取菜单信息.
	 */
	@Override
	public TbSysmenu getMenuById(Integer id) {
		StringBuilder sql = new StringBuilder();
		sql.append("select id,name,rel,url,target,open,status,sort from tb_sysmenu where id=?");
		return super.findById(sql.toString(),id.toString());
	}

	/**
	 * 修改菜单信息.
	 */
	@Override
	public void updateData(TbSysmenu sysMenu) {
		StringBuilder sql = new StringBuilder();
		sql.append("update tb_sysmenu set name=?, rel=?, url=?, target=?, open=?, sort=?, status=? where id=?");
		Object[] args = new Object[]{sysMenu.getName(),sysMenu.getRel(),sysMenu.getUrl(),sysMenu.getTarget(),sysMenu.getOpen(),sysMenu.getSort(),sysMenu.getStatus(),sysMenu.getId()};
		super.update(sql.toString(), args);
	}

	/**
	 * 根据主键ID删除菜单信息.
	 */
	@Override
	public void deleteDataById(String id) {
		Object[] args = new Object[]{id};
		//删除菜单信息.
		StringBuilder sqlm = new StringBuilder();
		sqlm.append("delete from tb_sysmenu where id=?");
		super.delete(sqlm.toString(), args);
		//删除菜单权限关系信息.
		StringBuilder sqlrm = new StringBuilder();
		sqlrm.append("delete from tb_role_right where menuId=?");
		super.delete(sqlrm.toString(), args);
	}

	/**
	 * 获取已设置的角色菜单.
	 */
	@Override
	public List<TbSysmenu> getRoleMenuRefByRoleId(Integer roleId) {
		StringBuilder sql = new StringBuilder();
		sql.append("select m.id,m.name from tb_role_right ref,tb_sysmenu m where ref.roleId=? and ref.menuId=m.id order by m.sort asc");
		Object[] args = new Object[]{roleId};
		return super.list(sql.toString(),TbSysmenu.class,args);
	}
}
