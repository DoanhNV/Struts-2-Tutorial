package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String userName;
    private String password;
    private List<String> favorites;
    private int gender;
    private String country;
    private Date birthOfDate;

    public User() {
	favorites = new ArrayList<String>();
    }

    public User(String userName, String password, List<String> favorites, int gender, String country) {
	this.userName = userName;
	this.password = password;
	this.favorites = favorites;
	this.gender = gender;
	this.country = country;
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

    public List<String> getFavorites() {
	return favorites;
    }

    public void setFavorites(List<String> favorites) {
	this.favorites = favorites;
    }

    public int getGender() {
	return gender;
    }

    public void setGender(int gender) {
	this.gender = gender;
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public Date getBirthOfDate() {
	return birthOfDate;
    }

    public void setBirthOfDate(Date birthOfDate) {
	this.birthOfDate = birthOfDate;
    }

}
