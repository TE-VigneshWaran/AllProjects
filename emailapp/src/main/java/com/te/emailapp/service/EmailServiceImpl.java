package com.te.emailapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.emailapp.bean.User_Info;
import com.te.emailapp.dao.EmailDao;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private EmailDao dao;

	@Override
	public User_Info login(Integer id, String password) {
		if(id<=1) {
			return null;
		}
		return dao.login(id,password);
			
		
	}

	@Override
	public boolean register(User_Info info) {
		return dao.register(info);
		
	}
}
