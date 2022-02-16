package com.te.resumeapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumeapp.beans.ExperienceDetails;

@Repository
public interface ExperienceDetailsDao extends JpaRepository<ExperienceDetails, Integer>{

}
