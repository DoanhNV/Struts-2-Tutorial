package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.ValueStack;

public class LoginAction extends ActionSupport implements Preparable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String currency;
	private String birthday;

	public String login() {
		return SUCCESS;
	}

	public void prepare() throws Exception {
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		/*String birthDate = valueStack.findString("birthday");
		String money = valueStack.findString("currency");
		birthday = birthDate.substring(0, 4) + "/" + birthDate.substring(4, 6) + "/" + birthDate.substring(6, 8);
		currency = money + "$";*/ //=> đoạn này sẽ bị exception vì birthdat null
		System.out.println("execute prepare method...");
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
