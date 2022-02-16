package com.te.resumeapp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumeapp.beans.PersonalDetails;
import com.te.resumeapp.beans.UserRegister;
import com.te.resumeapp.dao.RegisterDao;
import com.te.resumeapp.exception.RegisterException;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterDao dao;
	
	@Override
	@Transactional
	public UserRegister register(UserRegister info) {
		if(info != null) {
			return dao.save(info);
		}
			throw new RegisterException("Data already Exist");
	}

	@Override
	public UserRegister login(String email, String password) {
		if ((!email.isEmpty() && email != null) && (!password.isEmpty() && password != null)) {
			UserRegister logg = dao.findByEmailAndPassword(email, password);
			if (logg != null) {
				return logg;
			} else {
				throw new RegisterException("Invalid Credentials");
			}
		} else {
			throw new RegisterException("Enter valid Login Details");
		}
	}

	@Override
	public UserRegister fetchData(Integer id) {
		
		return  dao.findById(id).get();
	}

	

	

}
