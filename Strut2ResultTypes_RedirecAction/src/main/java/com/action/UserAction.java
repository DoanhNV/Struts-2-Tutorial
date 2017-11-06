package com.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action(value = "/admin")
public class UserAction extends ActionSupport {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    private static final String REDIRECT_ACTION_TYPE = "redirectAction";

    @Action(value = "/login", results = { @Result(location = "/home/index", type = REDIRECT_ACTION_TYPE) })
    public String login() {
	return SUCCESS;
    }
    
    @Action(value="/logout",results = {@Result(location = "/login.jsp")})
    public String logout(){
	return SUCCESS;
    }
}
