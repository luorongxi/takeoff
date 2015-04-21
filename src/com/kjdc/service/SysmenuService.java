package com.kjdc.service;

import java.util.List;

import com.kjdc.common.page.PageBean;
import com.kjdc.common.page.PageParam;
import com.kjdc.entity.base.TbRoleRight;
import com.kjdc.entity.base.TbSysmenu;

/**  
 * @类功能说明：  菜单信息接口.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午11:57:43  
 * @版本：V1.0  
 */
public interface SysmenuService {

	/**
	 * 函数功能说明 ：根据当前登陆用户ID获取菜单信息. 
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @param id
	 * @参数： @return      
	 * @return  List<TbSysmenu>    
	 * @throws
	 */
	List<TbSysmenu> getMenuByUserId(Integer id);

	
	/**  
	 * 函数功能说明 ： 获取所有的可用的菜单信息.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @return      
	 * @return  List<TbSysmenu>    
	 * @throws  
	 */
	List<TbSysmenu> getTreeList();

    /**
     * 函数功能说明 ： 获取所有菜单信息.
     * 修改者名字：
     * 修改日期：
     * 修改内容： 
     * @参数： @return      
     * @return  List<TbSysmenu>    
     * @throws
     */
	List<TbSysmenu> findSysMenuAll();

	/**  
	 * 函数功能说明 ： 系统菜单分页列表查询.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @param parentId
	 * @参数： @param pageParam
	 * @参数： @return      
	 * @return  PageBean    
	 * @throws  
	 */
	PageBean queryForPage(String parentId, PageParam pageParam);

	/**  
	 * 函数功能说明 ： 按添加检索分页列表查询.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @param sysMenu
	 * @参数： @param pageParam
	 * @参数： @return      
	 * @return  PageBean    
	 * @throws  
	 */
	PageBean queryForPage(TbSysmenu sysMenu, PageParam pageParam);

	/**  
	 * 函数功能说明 ： 保存菜单信息.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @param sysMenu      
	 * @return  void    
	 * @throws  
	 */
	void saveData(TbSysmenu sysMenu);
    
	/**
	 * 函数功能说明 ： 根据ID获取菜单信息.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @param id
	 * @参数： @return      
	 * @return  TbSysmenu    
	 * @throws
	 */
	TbSysmenu getMenuById(Integer id);

	/**  
	 * 函数功能说明 ： 修改菜单信息.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @param sysMenu      
	 * @return  void    
	 * @throws  
	 */
	void updateData(TbSysmenu sysMenu);

	/**  
	 * 函数功能说明 ： 根据主键ID删除菜单信息.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @param id      
	 * @return  void    
	 * @throws  
	 */
	void deleteDataById(String id);

	/**  
	 * 函数功能说明 ： 获取已设置的角色菜单.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @param id
	 * @参数： @return      
	 * @return  List<TbSysmenu>    
	 * @throws  
	 */
	List<TbSysmenu> getRoleMenuRefByRoleId(Integer roleId);

}
