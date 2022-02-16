package com.te.emailapp.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_info")
public class User_Info implements Serializable {

	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;

	@Column
	private String userName;

	
	private String email;

	
	private String password;

}
