package indi.bigbrotherlee.bbs.service;

import indi.bigbrotherlee.bbs.dao.UserDao;
import indi.bigbrotherlee.bbs.entity.User;

public interface UserService {
	/**
	 * 处理登录业务
	 * @param user 想要查找的User对象
	 * @return
	 */
	public String login(User user);
	
}
