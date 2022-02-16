package com.te.emailapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.emailapp.bean.User_Info;
import com.te.emailapp.exception.EmailException;

@Repository
public class EmailDaoImpl implements EmailDao {

	@Override
	public User_Info login(Integer id, String password) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("email");
		EntityManager manager = factory.createEntityManager();
		User_Info info = manager.find(User_Info.class, id);

		if (info != null) {
			if (info.getPassword().equals(password)) {
				return info;
			}
		}

		throw new EmailException("Invalid Credentials");
	}

	@Override
	public boolean register(User_Info info) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("email");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			return false;

		}

	}
}
