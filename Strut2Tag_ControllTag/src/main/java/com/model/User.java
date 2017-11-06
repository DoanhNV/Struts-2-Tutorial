package com.model;

import java.util.Comparator;

public class User {
    private String userName;
    private int age;

    public User() {
	// TODO Auto-generated constructor stub
    }

    public User(String userName, int age) {
	super();
	this.userName = userName;
	this.age = age;
    }

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

}
