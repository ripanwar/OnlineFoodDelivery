package com.cg.fds.entities;

public class Login {

	private String userid;
	private String userName;
	private String password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String userid, String userName, String password) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.password = password;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Login [User Id=" + userid + ", User Name=" + userName + ", Password=" + password +"]";

	}
	
}
