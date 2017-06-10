package cn.zyyz.service;

import java.util.List;

import cn.zyyz.model.User;


public interface UserService {
	void save(User user);
	boolean update(User user);
	boolean delete(int id);
	User findById(int id);
	List<User> findAll();
}
