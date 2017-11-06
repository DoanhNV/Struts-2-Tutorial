package com.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action(value = "/amdin")
public class LoginAction extends ActionSupport {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static final String FREMARKER_TYPE = "freemarker";

    @Action(value = "/login", results = { @Result(name = "success", location = "/index.ftl" ,type = FREMARKER_TYPE) })
    public String login() {
	return SUCCESS;
    }
}
