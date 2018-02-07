package indi.bigbrotherlee.bbs.service;

import indi.bigbrotherlee.bbs.dao.UserDao;

public class UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
