package com.kjdc.web.action.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kjdc.common.dwz.DWZ;
import com.kjdc.common.dwz.DwzAjax;
import com.kjdc.common.page.PageBean;
import com.kjdc.common.page.PageParam;
import com.kjdc.common.utils.CommonMethodUtil;
import com.kjdc.common.utils.ConstantUtil;
import com.kjdc.common.utils.StringUtil;
import com.kjdc.entity.base.TbSysmenu;
import com.kjdc.service.SysmenuService;
import com.kjdc.service.UserInfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**  
 * @类功能说明：  系统菜单管理Action.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-18 下午10:35:29  
 * @版本：V1.0  
 */
@Controller
@Scope("prototype")
public class SysMenuAction extends ActionSupport {

	/**
	 * @Fields  serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 1380148000938590870L;

	private static final Log log = LogFactory.getLog(SysMenuAction.class);
	

	/**
     * 注入系统菜单管理接口.
     */
	@Resource
	SysmenuService sysmenuService;
	
	/**
	 * 注入管理员信息接口.
	 */
	@Resource
	UserInfoService userInfoService;

	/**
	 * 系统菜单.
	 */
    private TbSysmenu sysMenu;
    
    /**
     * 父ID.
     */
    private String parentId;
    
    /**
	 * 主键ID数组.
	 */
	private String ids;
    
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
	 * 函数功能说明 ： 删除菜单信息.
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
					sysmenuService.deleteDataById(idsValue[i]);
				}
			}else if(!StringUtil.isNull(sysMenu.getId())){
				sysmenuService.deleteDataById(sysMenu.getId().toString());
			}
			dwz.setStatusCode(DWZ.SUCCESS);
			dwz.setMessage("删除成功！");
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			log.info("删除菜单信息异常，原因为："+e.getMessage());
			dwz.setStatusCode(DWZ.ERROR);
			dwz.setMessage("删除菜单信息异常，请通知系统管理员！");
			return ERROR;
		}
	}
	
	
	/**  
	 * 函数功能说明 ： 修改菜单信息.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @return      
	 * @return  String    
	 * @throws  
	 */
	public String edit(){
		if(!StringUtil.isNull(sysMenu)){
			try {
				sysmenuService.updateData(sysMenu);
				dwz.setStatusCode(DWZ.SUCCESS);
				dwz.setMessage("修改成功！");
				return SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
				log.info("修改菜单信息异常，原因为："+e.getMessage());
				dwz.setStatusCode(DWZ.ERROR);
				dwz.setMessage("修改菜单信息异常，请通知系统管理员！");
				return ERROR;
			}
		}else{
			dwz.setStatusCode(DWZ.ERROR);
			dwz.setMessage("参数不正确！");
			return ERROR;
		}
	}
	
	
	/**  
	 * 函数功能说明 ： 进入修改菜单页面.
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
		if(!StringUtil.isNull(sysMenu.getId())){
			try {
				//根据ID获取菜单信息
				sysMenu=sysmenuService.getMenuById(sysMenu.getId());
			} catch (Exception e) {
				e.printStackTrace();
				log.info("进入修改菜单页面异常，原因为："+e.getMessage());
				dwz.setStatusCode(DWZ.ERROR);
				dwz.setMessage("进入修改菜单页面异常，请通知系统管理员！");
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
	 * 函数功能说明 ： 查看菜单详情.
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
		if(!StringUtil.isNull(sysMenu.getId())){
			//根据ID获取菜单信息
			sysMenu=sysmenuService.getMenuById(sysMenu.getId());
		}else{
			dwz.setStatusCode(DWZ.ERROR);
			dwz.setMessage("填写参数不正确！");
			return ERROR;
		}
		return "view";
	}
	
	
	
	/**  
	 * 函数功能说明 ： 添加菜单信息.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @return      
	 * @return  String    
	 * @throws  
	 */
	public String add(){
		if(!StringUtil.isNull(sysMenu)&&!StringUtil.strIsEmpty(parentId)){
			try {
				//获取当前系统用户名作为创建人.
				Map<String, Object> session = ActionContext.getContext().getSession();
				String userName = (String) session.get("USER_NAME");
				sysMenu.setpId(parentId);
				sysMenu.setCreater(userName);
				sysmenuService.saveData(sysMenu);
				dwz.setStatusCode(DWZ.SUCCESS);
				dwz.setMessage("添加成功！");
				return SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
				log.info("保存菜单信息异常，原因为："+e.getMessage());
				dwz.setStatusCode(DWZ.ERROR);
				dwz.setMessage("保存菜单信息异常，请通知系统管理员！");
				return ERROR;
			}
		}else{
			dwz.setStatusCode(DWZ.ERROR);
			dwz.setMessage("填写参数不正确！");
			return ERROR;
		}
	}
	

    /**  
     * 函数功能说明 ： 进入添加菜单页面.
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
     * 函数功能说明 ： 加载系统菜单树.
     * 修改者名字：
     * 修改日期：
     * 修改内容： 
     * @参数：       
     * @return  void    
     * @throws  
     */
    public void treeList(){
    	//从session中获取当前用户角色菜单.
		Map<String, Object> session = ActionContext.getContext().getSession();
    	List<TbSysmenu> menuList=(List<TbSysmenu>) session.get("SYS_MENU");
    	//返回JSON数据
    	CommonMethodUtil.responseJson(menuList);
    }

    /**  
     * 函数功能说明 ： 系统菜单树分页列表查询.
     * 修改者名字：
     * 修改日期：
     * 修改内容： 
     * @参数： @return      
     * @return  String    
     * @throws  
     */
    public String list(){
    	try {
			//系统菜单分页列表查询.
			PageParam pageParam = new PageParam(pageNum, numPerPage);
			pageBean = sysmenuService.queryForPage(parentId,pageParam);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("获取系统菜单树列表异常,原因是："+e.getMessage());
		}
    	return "list";
    }
    

    /**
     * 函数功能说明 ： 系统菜单树列表.
     * 修改者名字：
     * 修改日期：
     * 修改内容： 
     * @参数：       
     * @return  void    
     * @throws
     */
    public void getMenuList(){
        try {
			//获取系统菜单.
			List<TbSysmenu> menuList=sysmenuService.findSysMenuAll();
			List<TbSysmenu> list=new ArrayList<TbSysmenu>();
			for(int i=0;i<menuList.size();i++){
				TbSysmenu sysMenu=menuList.get(i);
				sysMenu.setUrl("");
				sysMenu.setTarget(ConstantUtil.TARGET);
				sysMenu.setRel("");
				sysMenu.setOpen(ConstantUtil.IS_OPEN);
				sysMenu.setClick(ConstantUtil.ON_CLICK);
				list.add(sysMenu);
			}
			//返回JSON数据
			CommonMethodUtil.responseJson(list);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("系统菜单树列表异常,原因是："+e.getMessage());
		}
    }
    
    
    /**
     * 函数功能说明 ： 获取子级菜单分页列表查询.
     * 修改者名字：
     * 修改日期：
     * 修改内容： 
     * @参数： @return      
     * @return  String    
     * @throws
     */
    public String getChildList(){
    	try {
			PageParam pageParam = new PageParam(pageNum, numPerPage);
			if(!StringUtil.isNull(sysMenu)){
				if(!StringUtil.strIsEmpty(parentId)){
					sysMenu.setpId(parentId);
					pageBean = sysmenuService.queryForPage(sysMenu,pageParam);
				}else{
					pageBean = sysmenuService.queryForPage(sysMenu,pageParam);
				}
			}else{
				pageBean = sysmenuService.queryForPage(parentId,pageParam);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.info("获取子级菜单异常,原因是："+e.getMessage());
		}
    	return "list";
    }
    

	public TbSysmenu getSysMenu() {
		return sysMenu;
	}

	public void setSysMenu(TbSysmenu sysMenu) {
		this.sysMenu = sysMenu;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
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

}
