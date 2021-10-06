package com.springboot.thyem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.thyem.model.User;
import com.springboot.thyem.repository.UserDao;

@Service
public class UserService {
	@Autowired
	public UserDao userDao;

	public User AddUser(User user) {

		User addUser = userDao.save(user);

		return addUser;
	}

}
