package com.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {
	private List<String> productNames;
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public String showAll(){
		initProduct();
		return SUCCESS;
	}
	
	public void initProduct(){
		productNames = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			productNames.add("Iphone"+i);
		}
	}

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}

}
