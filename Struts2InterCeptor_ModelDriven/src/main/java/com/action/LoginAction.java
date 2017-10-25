package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private User user;

	public String login() {
		System.out.println(user);
		return SUCCESS;
	}

	public User getModel() {
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		System.out.println(valueStack.findString("user.userName"));
		System.out.println(user);
		return null;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
