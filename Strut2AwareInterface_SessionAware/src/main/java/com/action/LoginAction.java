package com.action;

import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware, ServletResponseAware {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private static final String ADMIN_USERNAME = "admin";
	private static final String ADMIN_PASSWORD = "admin";
	private static final String USER_NAME_FIELD = "username";
	private static final String PASSWORD_FIELD = "password";
	private String userName;
	private String password;
	Map<String, Object> session;

	public LoginAction() {

	}

	public String login() {
		if (!this.userName.equals(ADMIN_USERNAME) || !this.password.equals(ADMIN_PASSWORD)) {
			return ERROR;
		}
		session.put(USER_NAME_FIELD, ADMIN_USERNAME);
		session.put(PASSWORD_FIELD, ADMIN_PASSWORD);
		return SUCCESS;
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

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setServletResponse(HttpServletResponse response) {

	}

}
