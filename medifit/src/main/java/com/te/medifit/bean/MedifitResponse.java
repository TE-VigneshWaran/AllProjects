package com.te.medifit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedifitResponse {

	private boolean err;
	
	private Object data;
}

