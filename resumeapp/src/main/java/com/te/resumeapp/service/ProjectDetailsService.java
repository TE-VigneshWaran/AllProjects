package com.te.resumeapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.te.resumeapp.beans.ProjectDetails;


public interface ProjectDetailsService {

	public List<ProjectDetails> registerProjectDetails(List<ProjectDetails> projectDetails);
}
