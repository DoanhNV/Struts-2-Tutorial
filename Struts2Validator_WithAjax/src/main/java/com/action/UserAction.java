package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

/**
 * 
 * @author ASUS
 * @since 2017/10/21
 */
public class UserAction extends ActionSupport {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private User user;

    public String login() {
	return SUCCESS;
    }

    public User getUser() {
	return user;
    }

   @VisitorFieldValidator
    public void setUser(User user) {
	this.user = user;
    }

}
