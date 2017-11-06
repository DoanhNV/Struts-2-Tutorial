package com.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action("/home")
public class HomeAction extends ActionSupport {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @Action(value = "/index", results = { @Result(location = "/index.jsp") })
    public String loadIndex() {
	return SUCCESS;
    }
}
