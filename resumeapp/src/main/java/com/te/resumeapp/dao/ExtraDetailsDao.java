package com.te.resumeapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumeapp.beans.ExtraDetails;

@Repository
public interface ExtraDetailsDao extends JpaRepository<ExtraDetails, Integer>{

}
