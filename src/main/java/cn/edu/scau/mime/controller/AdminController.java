package cn.edu.scau.mime.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.scau.mime.entity.Admin;
import cn.edu.scau.mime.exception.LoginException;
import cn.edu.scau.mime.service.interfaces.AdminService;
/**
 * @author jet
 * @description TODO
 * @date 2016年8月18日
 * @version v1.0
 */
@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String login(Admin admin, HttpSession session){
		
		try {
			//admin = adminService.login(admin.getAdminId(), admin.getPassword());
			
			admin = adminService.loginByName(admin.getName(), admin.getPassword());
			
			//登录成功
			session.setAttribute("user", admin);
			
			//return "redrict:/mime/houtai.jsp"; //跳转到后台管理界面
			return "houtai";
		} catch (LoginException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/";
	}
}
