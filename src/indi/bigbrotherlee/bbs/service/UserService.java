package indi.bigbrotherlee.bbs.service;

import indi.bigbrotherlee.bbs.dao.UserDao;
import indi.bigbrotherlee.bbs.entity.User;

public class UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public String login(User user) {
		User isUser=userDao.getUser(user);
		if(isUser==null) {
			return "not_find"; 
		}
		return "success";
	}
	
}
