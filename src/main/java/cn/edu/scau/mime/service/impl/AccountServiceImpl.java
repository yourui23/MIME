package cn.edu.scau.mime.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.scau.mime.dao.AccountMapper;
import cn.edu.scau.mime.entity.Account;
import cn.edu.scau.mime.service.interfaces.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public void reg(Account account){
		accountMapper.reg(account);
	}
}
