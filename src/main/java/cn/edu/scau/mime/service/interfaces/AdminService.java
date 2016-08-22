package cn.edu.scau.mime.service.interfaces;

import cn.edu.scau.mime.entity.Admin;
/**
 * @author jet
 * @description TODO
 * @date 2016年8月18日
 * @version v1.0
 */
public interface AdminService {
		/**
		 * 系统登录
		 * @param adminId 帐号adminId
		 * @param password 帐号密码
		 * @return Admin
		 */
	Admin login( int adminId, String password);
	Admin loginByName( String name, String password);
}
