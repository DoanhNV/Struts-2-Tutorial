package com.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements RequestAware {
	Map<String, Object> requestMap;

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private static final String USER_NAME_FIELD = "username";
	private static final String PASSWORD_FIELD = "password";

	public String login() {
		requestMap.put(USER_NAME_FIELD, "ngovandoanh");
		requestMap.put(PASSWORD_FIELD, "admin");
		return SUCCESS;
	}

	public void setRequest(Map<String, Object> arg0) {
		this.requestMap = arg0;
	}

}
