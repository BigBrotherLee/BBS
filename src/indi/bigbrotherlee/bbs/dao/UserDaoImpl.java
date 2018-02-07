package indi.bigbrotherlee.bbs.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import indi.bigbrotherlee.bbs.entity.User;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate hTemplate;
	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}
	@Override
	public void addUser() {
		
	}
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		
	}

}
