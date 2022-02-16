package com.te.medifit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "diet_plan")
public class DietPlan {
	
	@Column
	private int exercise;

	@Column
	private String colories;

	@Column
	private String hydration;

}
