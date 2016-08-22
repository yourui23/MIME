package cn.edu.scau.mime.entity;

import java.util.Date;

public class Customer {
	   private int customerid;
	   private String account;
	   private String password;
	   private Integer point;
	   private String email;
	   private String phone;
	   private String sex;
	   private Date borndate;
	   
   public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBorndate() {
		return borndate;
	}
	public void setBorndate(Date borndate) {
		this.borndate = borndate;
	}
	   @Override
		public String toString() {
			return "Customer [customerid=" + customerid + ", account=" + account + ", password=" + password + ", point="
					+ point + ", email=" + email + ", phone=" + phone + ", sex=" + sex + ", borndate=" + borndate + "]";
		}
}
