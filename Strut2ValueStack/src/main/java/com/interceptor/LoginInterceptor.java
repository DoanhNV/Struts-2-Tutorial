package com.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

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
		// reuturn null sẽ không đi tiếp được
		return actionInvocation.invoke();
	}

}
