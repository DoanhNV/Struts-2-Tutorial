package com.interceptor;

import com.constant.UtilConstant;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * Account Interceptor
 * 
 * @author ASUS
 * @since 2017/10/04
 */
public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public void init() {
		super.init();
	}

	@Override
	public void destroy() {
		super.destroy();
	}

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		ValueStack stack = actionInvocation.getStack();
		String userName = stack.findString(UtilConstant.USER_NAME);
		String password = stack.findString(UtilConstant.PASSWORD);
		System.out.println("userName: "+userName+" --  password: "+password);
		System.out.println("size of ValueStack Object: "+stack.size());
		return null;
	}

}
