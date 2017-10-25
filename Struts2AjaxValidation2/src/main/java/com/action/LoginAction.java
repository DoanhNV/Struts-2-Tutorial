package com.action;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;

import net.arnx.jsonic.JSON;

public class LoginAction extends ActionSupport {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private InputStream inputStream;

	public String login() {
		String userName = this.userName;
		String password = this.password;
		Map<String, String> resultMap = new HashMap<String, String>();
		resultMap.put("userName", "123");
		resultMap.put("password", "123");
		String encode = JSON.encode(resultMap);
		ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
		try {
			inputStream = new ByteArrayInputStream(encode.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

}
