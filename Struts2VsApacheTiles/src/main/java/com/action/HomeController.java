package com.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("tiles-default")
@Action(value = "/home")
public class HomeController extends ActionSupport {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @Action(value = "index", results = { @Result(location = "load-success", type = "tiles") })
    public String loadIndex() {
	return SUCCESS;
    }
}
