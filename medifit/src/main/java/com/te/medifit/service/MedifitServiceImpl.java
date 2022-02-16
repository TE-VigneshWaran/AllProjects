package com.te.medifit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.medifit.bean.Demographics;
import com.te.medifit.bean.DietPlan;
import com.te.medifit.bean.UserInfo;
import com.te.medifit.dao.MedifitDao;
import com.te.medifit.exception.MedifitException;

@Service
public class MedifitServiceImpl implements MedifitService {

	@Autowired
	private MedifitDao dao;

	@Override
	public Object register(UserInfo info) {
		if (info != null) {

			return dao.save(info);
		}
		throw new MedifitException("Data Already Exist");
	}

	@Override
	public Object login(String userName, String Password) {
		UserInfo info = dao.findByUserNameAndPassword(userName, Password);
		if ((userName != null && !userName.isEmpty()) && (Password != null && !Password.isEmpty())) {
			if (info != null) {
				return info;
			} else {
				throw new MedifitException("Invalid Credential");
			}
		}
		throw new MedifitException("Please Enter The Valid Email and Password");
	}

	@Override
	public Object demographics(Demographics info) {
		Demographics demographics = dao.save(info);
		return demographics;
	}

	@Override
	public Object dietplan(DietPlan info) {
		DietPlan dietPlan=dao.save(info);
		return null;
	}

}
