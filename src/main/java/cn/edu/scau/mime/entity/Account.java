package cn.edu.scau.mime.entity;

/**
 * @author yourui
 * @date 2016/8/21
 * @version v1.0
 *
 */

public class Account {
	private int accountId;//用户id
	private String account;//用户帐号（手机号或邮箱）
	private String password;//密码
	private boolean state;//状态（停用、启用，默认在创建时启用）
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", account=" + account + ", password=" + password + ", state="
				+ state + "]";
	}
}
