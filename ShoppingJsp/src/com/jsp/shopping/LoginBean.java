package com.jsp.shopping;


public class LoginBean {
public String uname;
public String pwd;

	public LoginBean(String uname, String pwd) {
	super();
	this.uname = uname;
	this.pwd = pwd;
}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
public boolean login(){
	if(this.uname.equals(this.pwd)){
		return true;
		}
	else{
		return false;
	}
		
}

}
