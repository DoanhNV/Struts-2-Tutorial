package com.model;

import com.constant.Constant;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class User implements  Comparable<User>{
    private String userName;
    private String password;
    private String email;
    private int age;

    public User() {

    }

    public User(String userName, String password, String email, int age) {
	this.userName = userName;
	this.password = password;
	this.email = email;
	this.age = age;
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

    @RequiredStringValidator(key = "password must be not null!")
    public void setPassword(String password) {
	this.password = password;
    }

    public String getEmail() {
	return email;
    }

    @RegexFieldValidator(regex = Constant.User.EMAIL_REGEX, key = "user.email.invalidformat.message")
    @RequiredStringValidator(message = "email must be not null!")
    public void setEmail(String email) {
	this.email = email;
    }

    public int getAge() {
	return age;
    }

    @IntRangeFieldValidator(min = Constant.User.MIN_AGE, max = Constant.User.MAX_AGE,key = "user.age.invalidrange.message")
    public void setAge(int age) {
	this.age = age;
    }

    public int compareTo(User user) {
	if (this.getEmail().equals(user.getEmail()) && this.getAge() == user.getAge()
		&& this.getUserName().equals(user.getUserName()) && this.getPassword().equals(user.getPassword())) {
	    return 1;
	}
	return 0;
    }
}
