package org.malli.view;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "test", eager = true)
public class Test {

	private String username;

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String loginCheck() {
		String res = "error";
		if("admin".equals(username) && "password".equals(password)) {
			res = "home";
		}
		return res;
	}

}
