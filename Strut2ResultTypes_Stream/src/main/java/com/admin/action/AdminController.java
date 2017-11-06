package com.admin.action;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;

@Action(value = "/admin")
public class AdminController extends ActionSupport {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static final String STREAM_TYPE = "stream";
    private static final String UTF8_CHARSET = "utf-8";
    private static final String FILE_PATH = "C:/Users/ASUS/Downloads/Alan Walker - All Falls Down (feat. Noah Cyrus with Digital Farm Animals).mp3";
    private String fileName;
    private InputStream inputStream;

    @SuppressWarnings("deprecation")
    @Action(value = "/get", params = { "contentType", "application/json", "inputName", "inputStream", "bufferSize",
	    "1024" }, results = { @Result(type = STREAM_TYPE) })
    public String getInfo() throws IOException {
	List<User> users = new ArrayList<User>();
	users.add(new User("admin", "admin"));
	users.add(new User("Ngô Doanh", "12345678"));
	/* String encode = " ngo van doanh"; */
	String encode = net.arnx.jsonic.web.WebServiceServlet.JSON.encode(users);
	/*
	 * inputStream = new
	 * ByteArrayInputStream(encode.getBytes(UTF8_CHARSET));
	 */
	inputStream = new StringBufferInputStream("Ngô Văn Doanh");
	return SUCCESS;
    }

    @Action(value = "/download", results = {
	    @Result(type = STREAM_TYPE, params = { "contentType", "application/octet-stream", "inputName",
		    "inputStream", "bufferSize", "4096", "contentDisposition", "attachment;filename='${fileName}'" }) })
    public String download() throws IOException {
	List<User> users = new ArrayList<User>();
	users.add(new User("admin", "admin"));
	users.add(new User("Ngô Doanh", "12345678"));
	String encode = net.arnx.jsonic.web.WebServiceServlet.JSON.encode(users);
	File file = new File(FILE_PATH);
	fileName = file.getName();
	inputStream = new FileInputStream(file);
	return SUCCESS;
    }
    
    @Action(value = "/downloadContent", results = {
	    @Result(type = STREAM_TYPE, params = { "contentType", "application/octet-stream", "inputName",
		    "inputStream", "bufferSize", "4096", "contentDisposition", "attachment;filename='content.txt'" }) })
    public String downloadContent() throws IOException {
	List<User> users = new ArrayList<User>();
	users.add(new User("admin", "admin"));
	users.add(new User("Ngô Doanh", "12345678"));
	String encode = net.arnx.jsonic.web.WebServiceServlet.JSON.encode(users);
	inputStream = new ByteArrayInputStream(encode.getBytes(UTF8_CHARSET));
	return SUCCESS;
    }

    public InputStream getInputStream() {
	return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
	this.inputStream = inputStream;
    }

    public String getFileName() {
	return fileName;
    }

    public void setFileName(String fileName) {
	this.fileName = fileName;
    }

}
