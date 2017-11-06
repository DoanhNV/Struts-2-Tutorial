package com.admin.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action(value = "/admin")
public class LoginController extends ActionSupport {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static final String PLAIN_TEXT_TYPE = "plainText";

    @Action(value = "/login", results = { @Result(location = "/index.jsp", type = PLAIN_TEXT_TYPE) })
    public String login() {
	return SUCCESS;
    }
}
