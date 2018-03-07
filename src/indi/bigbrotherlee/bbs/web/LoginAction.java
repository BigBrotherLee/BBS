package indi.bigbrotherlee.bbs.web;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import indi.bigbrotherlee.bbs.entity.User;
import indi.bigbrotherlee.bbs.service.UserService;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	private User user =new User();
	private UserService userService;
	public String login(){
		return userService.login(user);
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
