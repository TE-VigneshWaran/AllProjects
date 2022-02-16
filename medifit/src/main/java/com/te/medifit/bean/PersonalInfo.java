package com.te.medifit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "personal_info")
public class PersonalInfo {

	@Column
	private int age;
	
	@Column
	private String qualification;
	
	@Column
	private String designation;
	
	@Column
	private String streat;
	
	@Column
	private String city;
	
	@Column
	private int pincode;
	
	
}
