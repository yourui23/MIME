package cn.edu.scau.mime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.scau.mime.entity.Account;
import cn.edu.scau.mime.exception.LoginException;
import cn.edu.scau.mime.service.interfaces.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="reg",method=RequestMethod.POST)
	public String register(Account account){
		try {
			accountService.reg(account);
			return "houtai";
		} catch (LoginException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/";
	}
}
