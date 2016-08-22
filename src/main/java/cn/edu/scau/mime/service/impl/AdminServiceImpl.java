package cn.edu.scau.mime.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.scau.mime.dao.AdminMapper;
import cn.edu.scau.mime.entity.Admin;
import cn.edu.scau.mime.exception.LoginException;
import cn.edu.scau.mime.service.interfaces.AdminService;

/**
 * @author jet
 * @description TODO
 * @date 2016年8月18日
 * @version v1.0
 */
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;

	public Admin login(int adminId, String password) {

		Admin admin = adminMapper.findByAdminID(adminId);
		if (admin == null) {
			throw new LoginException("用户名不正确或不存在");
		} else if (!password.equals(admin.getPassword())) {
			throw new LoginException("用户名或密码错误");
		}

		return admin;
	}

	public Admin loginByName(String name, String password) {

		Admin admin = adminMapper.findByName(name);
		if (admin == null) {
			throw new LoginException("用户名不正确或不存在");
		} else if (!password.equals(admin.getPassword())) {
			throw new LoginException("用户名或密码错误");
		}

		return admin;
	}

}
