package com.demo.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.login.dao.LoginDAO;
import com.demo.login.entity.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDAO;

	@Override
	public User authenticateUser(String userId, String password) {

		return loginDAO.findUser(userId, password);
	}

}
