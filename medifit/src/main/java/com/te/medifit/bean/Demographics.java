package com.te.medifit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "demographics_table")
public class Demographics {

	@Id
	private Integer id;

	@Column
	private Integer weight;
	
	@Column
	private Integer height;

	@Column
	private String bloodGroup;

	@Column
	private String healthIssue;

	@Column
	private String goal;

}
