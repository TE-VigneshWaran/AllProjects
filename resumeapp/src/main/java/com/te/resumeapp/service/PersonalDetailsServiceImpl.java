package com.te.resumeapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumeapp.beans.PersonalDetails;
import com.te.resumeapp.dao.PersonalDetailsDao;
import com.te.resumeapp.exception.DetailsNotFoundException;

@Service
public class PersonalDetailsServiceImpl implements PersonalDetailsService{

	@Autowired
	private PersonalDetailsDao dao;
	
	@Override
	public PersonalDetails registerPersonalDetails(PersonalDetails personalDetails) {
		return dao.save(personalDetails);
	}

	

}
