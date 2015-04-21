package com.kjdc.web.action.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kjdc.common.utils.ConstantUtil;
import com.kjdc.common.utils.EncryptUtil;
import com.kjdc.common.utils.StringUtil;
import com.kjdc.entity.base.TbSysmenu;
import com.kjdc.entity.base.TbUserInfo;
import com.kjdc.service.SysmenuService;
import com.kjdc.service.UserInfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**  
 * @类功能说明：  管理员信息Action.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午10:45:43  
 * @版本：V1.0  
 */
@Controller
@Scope("prototype")
public class LoginAction extends ActionSupport {

	/**
	 * @Fields  serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -3949424775140351787L;

	private static final Log log = LogFactory.getLog(LoginAction.class);

	/**
	 * 注入管理员信息接口.
	 */
	@Resource
	UserInfoService userInfoService;
	
	/**
     * 注入系统菜单管理接口.
     */
	@Resource
	SysmenuService sysmenuService;
	
	/**
	 * 用户信息.
	 */
	private TbUserInfo userInfo;

	/** 验证码:code **/
	private String code;

	/**  
	 * 函数功能说明 ： 后台登陆.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @return      
	 * @return  String    
	 * @throws  
	 */
	public String login(){
		//判断是否输入帐号.
		if(StringUtil.strIsEmpty(userInfo.getLoginName())){
			ActionContext.getContext().put("message", "请输入帐号！");
			return "login";
		}

		//判断是否输入密码.
		if(StringUtil.strIsEmpty(userInfo.getLoginPass())){
			ActionContext.getContext().put("message", "请输入密码！");
			return "login";
		}

		//判断是否输入验证码.
		String randomCode = (String) ActionContext.getContext().getSession().get("randomCode");
		if (StringUtil.strIsEmpty(code)){
			ActionContext.getContext().put("message", "请输入验证码！");
			return "login";
		} else if (!code.equals(randomCode)){
			ActionContext.getContext().put("message", "验证码不正确！");
			return "login";
		}

		//根据帐号获取管理员信息.
		TbUserInfo checkUserInfo = userInfoService.checkLoginName(userInfo.getLoginName());

		//判断帐号是否存在.
		if(StringUtil.isNull(checkUserInfo)){
			ActionContext.getContext().put("message", "输入的帐号不存在！");
			return "login";
		}

		//判断密码是否正确.
		if(!EncryptUtil.encodeMD5String(userInfo.getLoginPass().trim()).equals(checkUserInfo.getLoginPass())){
			ActionContext.getContext().put("message", "输入的密码不正确！");
			return "login";
		}

		//用户登录
		if (checkUserInfo.getLoginName().equals(userInfo.getLoginName()) && checkUserInfo.getLoginPass().equals(EncryptUtil.encodeMD5String(userInfo.getLoginPass().trim()))){
			//获取当前用户角色菜单.
			List<TbSysmenu> sysMenuList=new ArrayList<TbSysmenu>();
			if(!ConstantUtil.ADMIN.equals(checkUserInfo.getLoginName())){
				sysMenuList= sysmenuService.getMenuByUserId(checkUserInfo.getId());
			}else{
				sysMenuList=sysmenuService.getTreeList();
			}
			//将当前用户信息、用户角色菜单、用户权限放进session.
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("USER_ID", checkUserInfo.getId());
			session.put("LOGIN_NAME", checkUserInfo.getLoginName());
			session.put("LOGIN_PASS", checkUserInfo.getLoginPass());
			session.put("USER_NAME", checkUserInfo.getUserName());
			session.put("SYS_MENU", sysMenuList);
			return "loginSuccess";
		} else{
			ActionContext.getContext().put("message", "帐号或密码不正确！");
			return "login";
		}
	}


	/**
	 * 函数功能说明 ：进入退出系统确认页面.
	 * Administrator  2014-5-11
	 * 修改者名字 ：
	 * 修改日期  ：
	 * 修改内容  ：
	 * @参数： @return
	 * @return  String
	 * @throws
	 */
	public String confirm(){
		return "confirm";
	}

	/**
	 * 函数功能说明 ：退出系统.
	 * Administrator  2014-5-11
	 * 修改者名字 ：
	 * 修改日期  ：
	 * 修改内容  ：
	 * @参数： @return
	 * @return  String
	 * @throws
	 */
	public String logout(){
		/**
		 * session clean part.
		 */
		log.info("*** clean session start!");
		try
		{
			ActionContext context = ActionContext.getContext();
			Map<String, Object> session = context.getSession();
			session.remove("USER_ID");
			session.remove("LOGIN_NAME");
			session.remove("LOGIN_PASS");
			session.remove("USER_NAME");
			session.remove("SYS_MENU");
			session.clear();
			log.info("***clean session success!***");
		} catch (Exception e){
			log.error("***clean session fail!***", e);
			return ERROR;
		}
		return SUCCESS;
	}



	public TbUserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(TbUserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


}
