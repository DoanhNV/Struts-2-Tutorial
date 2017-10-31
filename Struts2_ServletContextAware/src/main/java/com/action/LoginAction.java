package com.action;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

public class LoginAction implements ServletContextAware {
    
    public void setServletContext(ServletContext context) {
	context.setAttribute("applicationId","h35781");
	context.setAttribute("applicationVersion", "1.0");
    }
    
    public String login(){
	return "success";
    }

}
