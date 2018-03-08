package indi.bigbrotherlee.bbs.service;

import indi.bigbrotherlee.bbs.dao.UserDao;
import indi.bigbrotherlee.bbs.entity.User;

public class UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/**
	 * 处理登录业务
	 * @param user 想要查找的User对象
	 * @return
	 */
	public String login(User user) {
		User isUser=userDao.getUser(user);
		if(isUser==null) {
			return "not_find"; //查找失败，无匹配行
		}
		return "success";//查找成功
	}
	
}
