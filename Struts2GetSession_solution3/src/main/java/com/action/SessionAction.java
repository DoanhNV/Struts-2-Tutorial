package com.action;

import java.util.Locale;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Không khả thi
 * 
 * @author admin
 */
public class SessionAction extends ActionSupport {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private static final String USER_NAME_SESSION = "session_username";
	private static final String PASSWORD_SESSION = "session_password";
	private String userName;
	private String password;

	public String doExecute() {
		if (userName == null || password == null || userName.equals("") || password.equals("")) {
			return ERROR;
		}
		setSession();
		return SUCCESS;
	}

	public void setSession() {
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		sessionMap.put(USER_NAME_SESSION, userName);
		sessionMap.put(PASSWORD_SESSION, password);
		
		// LOCALE ,don't care it
		Locale.setDefault(new Locale("vi", "VN"));
		Locale locale = ActionContext.getContext().getLocale();
		System.out.println("language: " + locale.getLanguage() + " country: " + locale.getCountry());
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