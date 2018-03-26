package indi.bigbrotherlee.bbs.service.impl;

import indi.bigbrotherlee.bbs.dao.UserDao;
import indi.bigbrotherlee.bbs.entity.User;
import indi.bigbrotherlee.bbs.service.UserService;

public class UserServiceImpl  implements UserService{
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public String login(User user) {
		User isUser=userDao.getUser(user);
		if(isUser==null) {
			return "not_find"; //查找失败，无匹配行
		}
		return "success";//查找成功
	}
	
}
