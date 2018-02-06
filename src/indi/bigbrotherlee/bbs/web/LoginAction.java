package indi.bigbrotherlee.bbs.web;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Test;

import com.opensymphony.xwork2.ActionSupport;

import indi.bigbrotherlee.bbs.service.UserService;

public class LoginAction extends ActionSupport {
	private String name;
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String execute() throws Exception {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
        Session se = sessionFactory.getCurrentSession();
        se.beginTransaction();
		List list=se.createQuery("from user").list();
		for(Object ob:list) {
			System.out.println(ob.toString());
		}
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
