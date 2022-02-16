package com.te.medifit.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.medifit.bean.Demographics;
import com.te.medifit.bean.DietPlan;
import com.te.medifit.bean.UserInfo;

@Repository
public interface MedifitDao extends CrudRepository<UserInfo, Integer> {

	public UserInfo findByUserNameAndPassword(String userName, String password);

	public Demographics save(Demographics info);

	public DietPlan save(DietPlan info);

}
