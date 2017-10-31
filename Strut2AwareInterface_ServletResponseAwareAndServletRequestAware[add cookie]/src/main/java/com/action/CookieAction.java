package com.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class CookieAction extends ActionSupport implements ServletResponseAware, ServletRequestAware {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private static final String USER_NAME_COOKIE = "cookie_username";
	private static final String PASSWORD_COOKIE = "cookie_password";
	private String userName;
	private String password;
	protected HttpServletResponse response;
	protected HttpServletRequest request;

	public CookieAction() {

	}

	public String doExecute() {
		if(userName == null || password == null){
			return ERROR;
		}
		Cookie userNameCookie = new Cookie(USER_NAME_COOKIE, userName);
		Cookie passwordCookie = new Cookie(PASSWORD_COOKIE, password);
		userNameCookie.setMaxAge(60*60*24*365);
		passwordCookie.setMaxAge(60*60*24*365);
		response.addCookie(userNameCookie);
		response.addCookie(passwordCookie);
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

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

}
