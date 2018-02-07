package indi.bigbrotherlee.bbs.dao;

import java.util.List;
import indi.bigbrotherlee.bbs.entity.User;

public interface UserDao {
	public void addUser();
	public List<User> getUsers();
	public void deleteUser();
	public void updateUser();
}
