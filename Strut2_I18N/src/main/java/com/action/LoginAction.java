package com.action;

import java.util.Date;
import java.util.Locale;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private static final String VIET_NAME_LANGUAGE = "vi";
	private static final String UNITED_STATED_LANGUAGE = "en";
	private static final int PERCENT = 20000;

	private Date curentDate = new Date();
	private long money;
	private long originalMoney = 200000;

	public String login() {
		return SUCCESS;
	}

	public String changeLanguage() {
		Locale locale = ActionContext.getContext().getLocale();
		money = convertMoney(money, locale.getLanguage());
		return SUCCESS;
	}

	public long convertMoney(long money, String language) {
		if (language.equals(VIET_NAME_LANGUAGE)) {
			money = originalMoney * PERCENT;
		} else if(language.equals(UNITED_STATED_LANGUAGE)){
			money = originalMoney;
		}
		return money;
	}

	public Date getCurentDate() {
		return curentDate;
	}

	public void setCurentDate(Date curentDate) {
		this.curentDate = curentDate;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public long getOriginalMoney() {
		return originalMoney;
	}

	public void setOriginalMoney(long originalMoney) {
		this.originalMoney = originalMoney;
	}

}
