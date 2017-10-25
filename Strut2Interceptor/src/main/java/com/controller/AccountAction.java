package com.controller;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Account Action class
 * 
 * @author ASUS
 * @since 2017/10/04
 */
public class AccountAction extends ActionSupport {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * User
	 */
	private User user;
	/**
	 * id
	 */
	private String id;

	/** default UserName */
	private static final String USER_NAME = "ngovandoanh";
	/** default password */
	private static final String PASSWORD = "admin";

	/**
	 * @author ASUS
	 * @return String
	 * @since 2017/10/04
	 */
	public String login() {
		if (!user.getUserName().equals(USER_NAME) || !user.getPassword().equals(PASSWORD)) {
			return ERROR;
		}
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
