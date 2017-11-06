package com.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import net.arnx.jsonic.JSON;
import net.arnx.jsonic.JSONException;

@Action(value = "/admin")
public class AdminController extends ActionSupport implements ModelDriven<User> {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    private static final String STREAM_TYPE = "stream";
    private static final String UTF8_CHARSET = "utf-8";
    private InputStream inputStream;
    private User user;

    @Action(value = "/register", results = { @Result(location="/login.jsp" /*type = STREAM_TYPE*/) })
    public String register() throws UnsupportedEncodingException, JSONException {
	inputStream = new ByteArrayInputStream(JSON.encode(user).getBytes(UTF8_CHARSET));
	return SUCCESS;
    }

    public InputStream getInputStream() {
	return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
	this.inputStream = inputStream;
    }

    public User getModel() {
	return user = new User();
    }
    
}
