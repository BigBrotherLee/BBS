package indi.bigbrotherlee.bbs.dao;

import java.util.List;
import indi.bigbrotherlee.bbs.entity.User;

public interface UserDao {
	public void addUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	public List<User> getUsers(String key);
	public User getUser(User user);
}
