package com.te.resumeapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumeapp.beans.ProjectDetails;

@Repository
public interface ProjectDetailsDao extends JpaRepository<ProjectDetails, Integer>{

}
