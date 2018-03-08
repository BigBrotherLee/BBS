package indi.bigbrotherlee.bbs.dao;

import java.util.List;
import indi.bigbrotherlee.bbs.entity.User;
/**
 * User表操作类
 * @author li
 *
 */
public interface UserDao {
	/**
	 * 添加User
	 * @param user 要添加的User对象
	 */
	public void addUser(User user);
	/**
	 * 删除User
	 * @param user 要删除的User对象
	 */
	public void deleteUser(User user);
	/**
	 *	更新用户信息
	 *	@param user 信息更新后的User对象
	 * 
	 */
	public void updateUser(User user);
	/**
	 * 得到匹配关键字的User
	 * @param key String类型的关键字
	 * @return 一个User的list
	 */
	public List<User> getUsers(String key);
	/**
	 * 得到一个User对象，其对象的属性值与参数相同
	 * @param user User对象
	 * @return 相匹配的User对象
	 */
	public User getUser(User user);
}
