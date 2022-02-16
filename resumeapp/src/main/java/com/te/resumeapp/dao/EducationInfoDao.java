package com.te.resumeapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumeapp.beans.EducationInfo;

@Repository
public interface EducationInfoDao extends JpaRepository<EducationInfo, Integer>{

	
}
