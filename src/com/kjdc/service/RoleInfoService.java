package com.kjdc.service;

import java.util.List;

import com.kjdc.common.page.PageBean;
import com.kjdc.common.page.PageParam;
import com.kjdc.entity.base.TbRoleInfo;
import com.kjdc.entity.base.TbRoleRight;
import com.kjdc.entity.base.TbSysmenu;

/**  
 * @类功能说明：  角色管理接口.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-18 下午9:18:50  
 * @版本：V1.0  
 */
public interface RoleInfoService {

	/**
	 * 按添加检索分页列表查询.
	 * @param gwRoleInfo
	 * @param pageParam
	 * @return
	 */
	PageBean queryForPage(TbRoleInfo roleInfo, PageParam pageParam);

	/**
	 * 保存角色信息.
	 * @param gwRoleInfo
	 */
	void saveData(TbRoleInfo roleInfo, String[] menuIds);

	/**
	 * 根据ID查看角色信息详情.
	 * @param id
	 * @return
	 */
	TbRoleInfo getRoleInfoById(Integer id);

	/**
	 * 更新角色信息.
	 * @param gwRoleInfo
	 */
	void updateData(TbRoleInfo roleInfo);

	/**
	 * 删除角色信息.
	 * @param roleId
	 */
	void deleteDataById(String id);

	/**  
	 * 函数功能说明 ： 设置权限.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @param roleRight
	 * @参数： @param menuIds      
	 * @return  void    
	 * @throws  
	 */
	void setPrivilege(TbRoleRight roleRight, String[] menuIds);

}
