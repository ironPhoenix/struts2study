package com.hans.strutsfirst;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAttribute extends ActionSupport {
	public String execute() {
		String a = (String) ActionContext.getContext().getSession()
				.get("username");
		System.out.println(a);
		return SUCCESS;
	}
}
