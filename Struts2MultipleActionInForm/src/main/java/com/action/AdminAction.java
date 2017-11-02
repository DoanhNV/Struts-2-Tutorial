package com.action;


import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String message = "hello";

	public String login() {
		message = "login admin is execute";
		return SUCCESS;
	}

	public String register() {
		message = "register admin is execute";
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
