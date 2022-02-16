package com.te.emailapp.service;

import com.te.emailapp.bean.User_Info;

public interface EmailService {

	public User_Info login(Integer id, String password);

	public boolean register(User_Info info);

}
