package indi.bigbrotherlee.bbs.control;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String name;
	@Override
	public String execute() throws Exception {
		if(name==null || name.isEmpty()) {
			return "not-defined";
		}
		return SUCCESS;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
