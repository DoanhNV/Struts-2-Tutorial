package com.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action(value = "/user")
public class UserAction extends ActionSupport {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	@Action(value = "/dologin", results = { @Result(location = "/user-login.jsp") })
	public String doLogin() {
		message = "execute user Login method";
		return SUCCESS;
	}
	
	@Action(value = "/doregister", results = { @Result(location = "/user-login.jsp") })
	public String doRegister() {
		message = "execute user register method";
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
