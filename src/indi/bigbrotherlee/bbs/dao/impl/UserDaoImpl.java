package indi.bigbrotherlee.bbs.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import indi.bigbrotherlee.bbs.dao.UserDao;
import indi.bigbrotherlee.bbs.entity.User;
/**
 * UserDao接口的实现类
 */
public class UserDaoImpl implements UserDao {
	private HibernateTemplate hTemplate;
	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}
	@Override
	public void addUser(User user) {
		hTemplate.save(user);
		hTemplate.flush();
		
	}
	@Override
	public User getUser(User user) {
		try{
			return hTemplate.findByExample(user).get(0);
		}catch(Exception e) {
			return null;
		}
	}
	@Override
	public void deleteUser(User user) {
		hTemplate.delete(user);
	}
	@Override
	public void updateUser(User user) {
		hTemplate.update(user);
		hTemplate.flush();
	}
	@Override
	public List<User> getUsers(String key) {
		return (List<User>) hTemplate.find("from indi.bigbrotherlee.entity.User u where u.name like %?%",key);
	}

}
