package com.te.resumeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumeapp.beans.ProjectDetails;
import com.te.resumeapp.dao.ProjectDetailsDao;

@Service
public class ProjectDetailsServiceImpl implements ProjectDetailsService{

	@Autowired
	private ProjectDetailsDao dao;
	
	@Override
	public List<ProjectDetails> registerProjectDetails(List<ProjectDetails> projectDetails) {
		return dao.saveAll(projectDetails);
	}

}
