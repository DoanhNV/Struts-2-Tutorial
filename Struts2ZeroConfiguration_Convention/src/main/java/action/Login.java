package action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Có thể không đã deprecate trong phiên bản struts mới
 * @author admin
 *
 */
public class Login extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String token;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
