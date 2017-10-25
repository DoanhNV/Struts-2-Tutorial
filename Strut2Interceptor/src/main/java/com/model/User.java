package com.model;

/**
 * 
 * @author ASUS
 * @since 2017/10/04
 */
public class User {
	/** id */
	private int userId;
	/** UserName */
	private String userName;
	/** Password */
	private String password;

	public User() {

	}

	public User(int userId, String userName, String password) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
