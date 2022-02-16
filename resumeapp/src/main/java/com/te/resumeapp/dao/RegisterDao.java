package com.te.resumeapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumeapp.beans.UserRegister;

@Repository
public interface RegisterDao extends JpaRepository<UserRegister, Integer>{

	public UserRegister findByEmailAndPassword(String email,String password);
}
