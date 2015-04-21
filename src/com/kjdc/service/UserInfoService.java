package com.kjdc.service;

import com.kjdc.entity.base.TbUserInfo;

/**  
 * @类功能说明：  管理员信息接口.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午10:24:39  
 * @版本：V1.0  
 */
public interface UserInfoService {

	
	/**  
	 * 函数功能说明 ： 根据帐号获取管理员信息.
	 * 修改者名字：
	 * 修改日期：
	 * 修改内容： 
	 * @参数： @param loginName
	 * @参数： @return      
	 * @return  TbUserInfo    
	 * @throws  
	 */
	TbUserInfo checkLoginName(String loginName);

}
