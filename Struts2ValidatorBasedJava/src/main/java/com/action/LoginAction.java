package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;

	public String login() {
		return SUCCESS;
	}

	@Override
	public void validate() {
		if (userName == null || userName.isEmpty()) {
			addFieldError("userName", "UserName must be not null!");
		}else if (userName.length() >= 10) {
			addFieldError("userName", "UserName's length must be less than 10");
		}
		if (password == null || password.isEmpty()) {
			addFieldError("password", "password must be not null!");
		}

		/*
		 * if(userName == null || userName.isEmpty()){
		 * addFieldError("username.null.error", "UserName must be not null!");
		 * }else if(userName.length() >= 10){
		 * addFieldError("username.length.error",
		 * "UserName's length must be less than 10"); }else if(password == null
		 * || password.isEmpty()){ addFieldError("password.null.error",
		 * "password must be not null!"); }
		 */
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

}
