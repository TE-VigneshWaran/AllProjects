package com.te.resumeapp.service;


import com.te.resumeapp.beans.UserRegister;


public interface RegisterService {

	public UserRegister register(UserRegister info);
	
	public UserRegister login(String email, String password);

	public UserRegister fetchData(Integer id);

	
	
}
