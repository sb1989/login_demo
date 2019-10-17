package com.demo.login.dao;

import com.demo.login.entity.User;

public interface LoginDAO {

	public User findUser(String userid, String password);

}
