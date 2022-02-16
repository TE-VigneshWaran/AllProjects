package com.te.medifit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.te.medifit.bean.Demographics;
import com.te.medifit.bean.DietPlan;
import com.te.medifit.bean.MedifitResponse;
import com.te.medifit.bean.UserInfo;
import com.te.medifit.service.MedifitService;

@Controller
public class MedifitController {

	@Autowired
	private MedifitService service;

	@PostMapping("/register")
	public ResponseEntity<MedifitResponse> register(@RequestBody UserInfo info) {
		MedifitResponse res = new MedifitResponse(false, service.register(info));
		return new ResponseEntity<MedifitResponse>(res, HttpStatus.CREATED);
	}

	@PostMapping("/login")
	public ResponseEntity<MedifitResponse> login(UserInfo info) {
		MedifitResponse res = new MedifitResponse(false, service.login(info.getUserName(), info.getPassword()));
		return new ResponseEntity<MedifitResponse>(res, HttpStatus.OK);
	}

	@PostMapping("/demographics")
	public ResponseEntity<MedifitResponse> demographics(@RequestBody Demographics info) {
		MedifitResponse res = new MedifitResponse(false, service.demographics(info));
		return new ResponseEntity<MedifitResponse>(res, HttpStatus.OK);
	}

	@PostMapping("/dietplan")
	public ResponseEntity<MedifitResponse> dietplan(@RequestBody DietPlan info) {
		MedifitResponse res = new MedifitResponse(false, service.dietplan(info));
		return new ResponseEntity<MedifitResponse>(res, HttpStatus.OK);

	}

}
