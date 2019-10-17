package com.demo.login.service;

import com.demo.login.entity.User;

public interface LoginService {
	public User authenticateUser(String userId, String password);
}
