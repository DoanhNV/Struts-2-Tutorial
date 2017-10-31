package com.action;

import java.util.Map;

import org.apache.struts2.interceptor.CookiesAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Không khả thi
 * 
 * @author admin
 */
public class CookieAction extends ActionSupport implements CookiesAware {

	private Map<String, String> cookieMap;

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private static final String USER_NAME_COOKIE = "cookie_username";
	private static final String PASSWORD_COOKIE = "cookie_password";
	private String userName;
	private String password;

	public String doExecute() {
		if (userName == null || password == null || userName.equals("") || password.equals("")) {
			return ERROR;
		}
		cookieMap.put(USER_NAME_COOKIE, userName);
		cookieMap.put(PASSWORD_COOKIE, password);
		return SUCCESS;
	}

	public void setCookiesMap(Map<String, String> arg0) {
		this.cookieMap = arg0;
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