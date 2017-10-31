package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    public void doExecute() {
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();
	ActionContext context = ServletActionContext.getContext();
	ActionMapping actionMapping = ServletActionContext.getActionMapping();
	System.out.println(actionMapping);
    }

}
