package com.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action(value = "/user")
@ParentPackage("json-default")
public class AccountAction extends ActionSupport {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private static final String JSON_TYPE = "json";
	private List<String> userIds = new ArrayList<String>();
	private String userName;
	
	@Action(value = "/get", interceptorRefs = { @InterceptorRef(value = "json") }, results = {
			@Result(type = JSON_TYPE) })
	public String getInfo() {
		initUserId();
		return SUCCESS;
	}

	public void initUserId() {
		for (int i = 0; i < 10; i++) {
			userIds.add("id" + i);
		}
	}

	public List<String> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
