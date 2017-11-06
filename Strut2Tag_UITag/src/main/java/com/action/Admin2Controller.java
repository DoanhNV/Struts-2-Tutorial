package com.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.model.User;
import com.model.sub.AbstractSubEntity;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import net.arnx.jsonic.JSON;
import net.arnx.jsonic.JSONException;

@Action(value = "/admin2")
public class Admin2Controller extends ActionSupport implements ModelDriven<User> {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    private static final String STREAM_TYPE = "stream";
    private static final String UTF8_CHARSET = "utf-8";
    private InputStream inputStream;
    private User user;
    private List<String> listFavor;
    List<AbstractSubEntity> genders;

    @Action(value = "/register2", results = {
	    @Result(location = "/login2.jsp" /* type = STREAM_TYPE */) })
    public String register() throws UnsupportedEncodingException, JSONException {
	initValues();
	
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
	if (user != null) {
	    return user;
	}
	user = new User();
	setDefaultValue(user);
	return user;
    }

    public void initValues() {
	listFavor = new ArrayList<String>();
	/* 'playGame','Cook','Reading','Coding','Working','Loving' */
	listFavor.add("Playing");
	listFavor.add("Cooking");
	listFavor.add("Coding");
	listFavor.add("Reading");
	listFavor.add("Working");
	listFavor.add("Loving");
	// init gender
	genders = new ArrayList<AbstractSubEntity>();
	genders.add(new AbstractSubEntity("male", 1));
	genders.add(new AbstractSubEntity("female", 2));
    }
    
    public void setDefaultValue(User user){
	user.setGender(1);
	List<String> favors = new ArrayList<String>();
	favors.add("Working");
	favors.add("Reading");
	user.setFavorites(favors);
    }

    public List<String> getListFavor() {
	return listFavor;
    }

    public void setListFavor(List<String> listFavor) {
	this.listFavor = listFavor;
    }

    public List<AbstractSubEntity> getGenders() {
	return genders;
    }

    public void setGenders(List<AbstractSubEntity> genders) {
	this.genders = genders;
    }

}
