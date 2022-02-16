package com.te.resumeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumeapp.beans.EducationInfo;
import com.te.resumeapp.dao.EducationInfoDao;

@Service
public class EducationInfoServiceImpl implements EducationInfoService{

	@Autowired(required = false)
	private EducationInfoDao dao; 
	
	@Override
	public List<EducationInfo> registerEducationInfo(List<EducationInfo> educationInfo) {
		return dao.saveAll(educationInfo);
	}

}
