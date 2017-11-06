package com.action;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "struts-default")
@Namespace(value = "/home")
public class HomeController extends ActionSupport {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    private String id;
    private String userId;

    @Action(value = "/login/{userId}", results = { @Result(location = "/home.jsp") })
    public String login() {
	Map<String, Object> application = ActionContext.getContext().getApplication();
	application.put("domain", "Strut2Tag_WildCard");
	return SUCCESS;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getUserId() {
	return userId;
    }

    public void setUserId(String userId) {
	this.userId = userId;
    }

}
