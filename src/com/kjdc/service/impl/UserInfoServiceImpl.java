package com.kjdc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kjdc.common.dao.BaseDao;
import com.kjdc.entity.base.TbUserInfo;
import com.kjdc.service.UserInfoService;

/**  
 * @类功能说明：  管理员信息接口实现类.
 * @类修改者：  
 * @修改日期： 
 * @修改说明：  
 * @公司名称：****信息科技有限公司  
 * @作者：lrx  
 * @创建时间：2015-4-17 下午10:26:08  
 * @版本：V1.0  
 */
@Service("userInfoService")
@Transactional
public class UserInfoServiceImpl extends BaseDao<TbUserInfo> implements UserInfoService {

	/**
	 * 根据帐号获取管理员信息.
	 */
	@Override
	public TbUserInfo checkLoginName(String loginName) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tb_user_info where loginName=?");
		return super.getOne(sql.toString(), loginName);
	}

}
