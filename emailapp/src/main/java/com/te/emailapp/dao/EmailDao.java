package com.te.emailapp.dao;

import com.te.emailapp.bean.User_Info;

public interface EmailDao  {

	public User_Info login(Integer id, String password);

	public boolean register(User_Info info);

}
