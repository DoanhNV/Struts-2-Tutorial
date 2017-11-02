package com.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

// custom URL
@Action(value = "/admin")
public class AdminAction {
	private String token;

	// custom url
	@Action(value = "/login", results = { 
	@Result(name = "success", location = "/index.jsp"),
	@Result(name = "error", location = "/login.jsp") })
	public String login() {
		if (token == null || token.equals("")) {
			return "error";
		}
		return "success";
	}

	public String register() {
		return "success";
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
