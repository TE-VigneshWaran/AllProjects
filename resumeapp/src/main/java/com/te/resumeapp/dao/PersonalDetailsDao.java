package com.te.resumeapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumeapp.beans.PersonalDetails;

@Repository
public interface PersonalDetailsDao extends JpaRepository<PersonalDetails, Integer>{

}
