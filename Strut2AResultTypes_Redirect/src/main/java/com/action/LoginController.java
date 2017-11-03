package com.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action(value = "/admin")
public class LoginController extends ActionSupport {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Action(value = "/login", results = { @Result(location = "/home/index", type = "redirect") })
	public String login() {
		return SUCCESS;
	}
	
	@Action(value = "/logout", results = { @Result(location = "/login.jsp", type = "redirect") })
	public String logout() {
		return SUCCESS;
	}

}
