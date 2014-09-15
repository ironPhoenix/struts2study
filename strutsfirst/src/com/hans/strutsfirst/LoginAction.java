package com.hans.strutsfirst;

import com.hans.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() {
		if (user.getUsername().equals("a")) {
			ActionContext.getContext().getSession().put("username", user.getUsername());
			return SUCCESS;
		}

		return ERROR;
	}
}
