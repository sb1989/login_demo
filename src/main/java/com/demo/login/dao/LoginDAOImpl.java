package com.demo.login.dao;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.login.entity.User;

@Repository
public class LoginDAOImpl implements LoginDAO {

	private EntityManager entityManager;

	@Autowired
	public LoginDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public User findUser(String userId, String password) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		return (User) currentSession.createQuery("from User where userid=:userId and password=:password")
				.setParameter("userId", userId).setParameter("password", password).list().stream().findFirst().orElse(null);
//		return (User) currentSession.createQuery("from User where userid=:userId and password=:password")
//				.setParameter("userId", userId).setParameter("password", password).list().get(0);
	}

}
