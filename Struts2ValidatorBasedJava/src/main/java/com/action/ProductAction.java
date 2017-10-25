package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;

/**
 * Annotation Validator
 * 
 * @author DuongLTD
 *
 */
public class ProductAction extends ActionSupport {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String productName;

	public String showAll() {
		return SUCCESS;
	}

	public String getProductName() {
		return productName;
	}

	@RequiredStringValidator(key = "productname.null.error")
	@StringLengthFieldValidator(minLength = "7", key = "productname.length.error")
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getMessage(String key) {
		return this.getText(key);
	}

}
