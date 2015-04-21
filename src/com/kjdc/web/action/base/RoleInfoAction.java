package com.kjdc.web.action.base;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kjdc.common.dwz.DWZ;
import com.kjdc.common.dwz.DwzAjax;
import com.kjdc.common.page.PageBean;
import com.kjdc.common.page.PageParam;
import com.kjdc.common.utils.StringUtil;
import com.kjdc.entity.base.TbRoleInfo;
import com.kjdc.entity.base.TbRoleRight;
import com.kjdc.entity.base.TbSysmenu;
import com.kjdc.service.RoleInfoService;
import com.kjdc.service.SysmenuService;
import com.opensymphony.xwork2.ActionSupport;

/**  
 * @类功能说明：  角色管理Action.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-18 下午10:31:51  
 * @版本：V1.0  
 */
@Controller
@Scope("prototype")
public class RoleInfoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8877926869408698704L;
	
	private static final Log log = LogFactory.getLog(RoleInfoAction.class);
	
	/**
	 * 注入角色管理接口.
	 */
	@Resource
	RoleInfoService roleInfoService;
	
	/**
     * 注入系统菜单管理接口.
     */
	@Resource
	SysmenuService sysmenuService;
	
	/**
	 * 角色信息.
	 */
	private TbRoleInfo roleInfo;
	
	/**
	 * 菜单权限关系.
	 */
	private TbRoleRight roleRight;
	
	/**
	 * 系统菜单列表.
	 */
	List<TbSysmenu> menuListAll;
	
	/**
	 * 已设置系统菜单列表.
	 */
	private List<TbSysmenu> alreadySetMenu;
	
	/**
	 * 已选择菜单权限.
	 */
	private String[] menuIds;
	
	/**
	 * 封装了分页信息和数据内容的pageBean
	 */
	private PageBean pageBean;

	/**
	 * 表示从页面中返回的当前页的值默认为1，表示默认为第一页.
	 */
	private int pageNum = PageBean.DEFAULT_PAGE_NUM;
	/**
	 * 每页显示15条记录 .
	 */
	private int numPerPage = PageBean.DEFAULT_NUM_PER_PAGE;
    
    /**
	 * DWZ框架ajax请求参数.
	 */
	private DwzAjax dwz;
	
	/**
	 * 主键ID数组.
	 */
	private String ids;
	
	
	/**  
	 * 函数功能说明 ： 设置权限.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @return      
	 * @return  String    
	 * @throws  
	 */
	public String setPrivilege(){
		if(!StringUtil.isNull(roleRight.getRoleId())){
			try {
				roleInfoService.setPrivilege(roleRight,menuIds);
				dwz.setStatusCode(DWZ.SUCCESS);
				dwz.setMessage("设置成功！");
				return SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
				log.info("设置权限异常，原因为："+e.getMessage());
				dwz.setStatusCode(DWZ.ERROR);
				dwz.setMessage("设置权限异常，请通知系统管理员！");
				return ERROR;
			}
		}else{
			dwz.setStatusCode(DWZ.ERROR);
			dwz.setMessage("参数不正确！");
			return ERROR;
		}
	}
	
	/**  
	 * 函数功能说明 ： 进入设置权限页面.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @return      
	 * @return  String    
	 * @throws  
	 */
	public String setUI(){
		//根据ID获取角色信息
		roleInfo=roleInfoService.getRoleInfoById(roleInfo.getId());
		//获取系统菜单权限集合.
		menuListAll=sysmenuService.getTreeList();
		//获取已设置的角色菜单.
		alreadySetMenu=sysmenuService.getRoleMenuRefByRoleId(roleInfo.getId());
		if(alreadySetMenu!=null&&!alreadySetMenu.isEmpty()){
			for(int i=0;i<alreadySetMenu.size();i++){
				Integer menuId=alreadySetMenu.get(i).getId();
				for(int j=0;j<menuListAll.size();j++){
					Integer id=menuListAll.get(j).getId();
					if(menuId.equals(id)){
						menuListAll.get(j).setCheck("true");
					}
				}
			}
		}
		return "set";
	}
	
	
	/**  
	 * 函数功能说明 ： 删除角色信息.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @return      
	 * @return  String    
	 * @throws  
	 */
	public String delete(){
		// 不是以form的形式提交的数据,要new一个DwzAjax对象
		dwz = new DwzAjax();
		try {
			if(!StringUtil.strIsEmpty(ids)){
				//批量删除
				String[] idsValue=ids.split(",");
				for(int i=0;i<idsValue.length;i++){
					//删除角色
					roleInfoService.deleteDataById(idsValue[i]);
				}
			}else if(!StringUtil.isNull(roleInfo.getId())){
				//删除角色
				roleInfoService.deleteDataById(roleInfo.getId().toString());
			}
			dwz.setStatusCode(DWZ.SUCCESS);
			dwz.setMessage("删除成功！");
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			log.info("删除角色信息异常，原因为："+e.getMessage());
			dwz.setStatusCode(DWZ.ERROR);
			dwz.setMessage("删除角色信息异常，请通知系统管理员！");
			return ERROR;
		}
	}

	
	/**  
	 * 函数功能说明 ： 修改角色权限信息.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @return      
	 * @return  String    
	 * @throws  
	 */
	public String edit(){
		if(!StringUtil.isNull(roleInfo)){
			try {
				//更新角色信息
				roleInfoService.updateData(roleInfo);
				dwz.setStatusCode(DWZ.SUCCESS);
				dwz.setMessage("修改成功！");
				return SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
				log.info("修改角色信息异常，原因为："+e.getMessage());
				dwz.setStatusCode(DWZ.ERROR);
				dwz.setMessage("修改角色信息异常，请通知系统管理员！");
				return ERROR;
			}
		}else{
			dwz.setStatusCode(DWZ.ERROR);
			dwz.setMessage("参数不正确！");
			return ERROR;
		}
	}
	
	/**  
	 * 函数功能说明 ： 进入修改角色信息页面.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @return      
	 * @return  String    
	 * @throws  
	 */
	public String editUI(){
		//不是以form的形式提交的数据,要new一个DwzAjax对象
		dwz = new DwzAjax();
		if(!StringUtil.isNull(roleInfo.getId())){
			try {
				//根据ID获取角色信息
				roleInfo=roleInfoService.getRoleInfoById(roleInfo.getId());
			} catch (Exception e) {
				e.printStackTrace();
				log.info("进入修改角色信息页面异常，原因为："+e.getMessage());
				dwz.setStatusCode(DWZ.ERROR);
				dwz.setMessage("进入修改角色信息页面异常，请通知系统管理员！");
				return ERROR;
			}
		}else{
			dwz.setStatusCode(DWZ.ERROR);
			dwz.setMessage("填写参数不正确！");
			return ERROR;
		}
		return "edit";
	}
	
	
	/**  
	 * 函数功能说明 ： 查看角色信息详情.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @return      
	 * @return  String    
	 * @throws  
	 */
	public String view(){
		//不是以form的形式提交的数据,要new一个DwzAjax对象
		dwz = new DwzAjax();
		if(!StringUtil.isNull(roleInfo.getId())){
			//根据ID获取角色信息
			roleInfo=roleInfoService.getRoleInfoById(roleInfo.getId());
		}else{
			dwz.setStatusCode(DWZ.ERROR);
			dwz.setMessage("填写参数不正确！");
			return ERROR;
		}
		return "view";
	}
	
	
	/**  
	 * 函数功能说明 ： 添加角色信息.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @return      
	 * @return  String    
	 * @throws  
	 */
	public String add(){
		if(!StringUtil.isNull(roleInfo)){
			try {
				roleInfoService.saveData(roleInfo,menuIds);
				dwz.setStatusCode(DWZ.SUCCESS);
				dwz.setMessage("添加成功！");
				return SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
				log.info("保存角色信息异常，原因为："+e.getMessage());
				dwz.setStatusCode(DWZ.ERROR);
				dwz.setMessage("保存角色信息异常，请通知系统管理员！");
				return ERROR;
			}
		}else{
			dwz.setStatusCode(DWZ.ERROR);
			dwz.setMessage("填写参数不正确！");
			return ERROR;
		}
	}
	
	
    /**  
     * 函数功能说明 ： 进入添加角色信息页面.
     * 修改者名字：
     * 修改日期：
     * 修改内容： 
     * @参数： @return      
     * @return  String    
     * @throws  
     */
    public String addUI(){
    	return "add";
    }
	

    /**  
     * 函数功能说明 ： 角色信息分页列表查询.
     * 修改者名字：
     * 修改日期：
     * 修改内容： 
     * @参数： @return      
     * @return  String    
     * @throws  
     */
    public String list(){
    	try {
			//角色信息分页列表查询.
			PageParam pageParam = new PageParam(pageNum, numPerPage);
			pageBean = roleInfoService.queryForPage(roleInfo,pageParam);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("角色信息分页列表异常,原因是："+e.getMessage());
			//不是以form的形式提交的数据,要new一个DwzAjax对象
	    	dwz = new DwzAjax();
			dwz.setStatusCode(DWZ.ERROR);
			dwz.setMessage("角色信息分页列表异常，请通知系统管理员！");
			return ERROR;
		}
    	return "list";
    }



	public TbRoleInfo getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(TbRoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}

	public TbRoleRight getRoleRight() {
		return roleRight;
	}

	public void setRoleRight(TbRoleRight roleRight) {
		this.roleRight = roleRight;
	}

	public List<TbSysmenu> getMenuListAll() {
		return menuListAll;
	}

	public void setMenuListAll(List<TbSysmenu> menuListAll) {
		this.menuListAll = menuListAll;
	}

	public List<TbSysmenu> getAlreadySetMenu() {
		return alreadySetMenu;
	}

	public void setAlreadySetMenu(List<TbSysmenu> alreadySetMenu) {
		this.alreadySetMenu = alreadySetMenu;
	}

	public String[] getMenuIds() {
		return menuIds;
	}

	public void setMenuIds(String[] menuIds) {
		this.menuIds = menuIds;
	}

	public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	public DwzAjax getDwz() {
		return dwz;
	}

	public void setDwz(DwzAjax dwz) {
		this.dwz = dwz;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}
	
}
