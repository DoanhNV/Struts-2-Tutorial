package com.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.comparator.AgeComparator;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;

@Action(value = "/home")
public class HomeController extends ActionSupport {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    private List<User> users = new ArrayList<User>();
    private AgeComparator ageComparator;
    private List<User> list1 = new ArrayList();
    private List<User> list2 = new ArrayList();
    private List<User> list3 = new ArrayList();

    @Action(value = "/index", results = { @Result(location = "/home/index.jsp") })
    public String loadIndex() {
	initListUser(users);
	initListUser(list1);
	initListUser(list2);
	initListUser(list3);
	return SUCCESS;
    }

    public void initListUser(List<User> users) {
	users.add(new User("Doanh", 21));
	users.add(new User("Aoanh", 20));
	users.add(new User("Hoanh", 19));
	users.add(new User("Boanh", 22));
    }

    public List<User> getUsers() {
	return users;
    }

    public void setUsers(List<User> users) {
	this.users = users;
    }

    public AgeComparator getAgeComparator() {
	return ageComparator;
    }

    public void setAgeComparator(AgeComparator ageComparator) {
	this.ageComparator = ageComparator;
    }

    public List<User> getList1() {
	return list1;
    }

    public void setList1(List<User> list1) {
	this.list1 = list1;
    }

    public List<User> getList2() {
	return list2;
    }

    public void setList2(List<User> list2) {
	this.list2 = list2;
    }

    public List<User> getList3() {
	return list3;
    }

    public void setList3(List<User> list3) {
	this.list3 = list3;
    }

}
