package com.te.medifit.service;

import com.te.medifit.bean.Demographics;
import com.te.medifit.bean.DietPlan;
import com.te.medifit.bean.UserInfo;

public interface MedifitService {

	public Object register(UserInfo info);

	public Object login(String userName, String password);

	public Object demographics(Demographics info);

	public Object dietplan(DietPlan info);

}
