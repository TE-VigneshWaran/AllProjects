package com.te.resumeapp.contoller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.resumeapp.beans.EducationInfo;
import com.te.resumeapp.beans.ExperienceDetails;
import com.te.resumeapp.beans.ExtraDetails;
import com.te.resumeapp.beans.PersonalDetails;
import com.te.resumeapp.beans.ProjectDetails;
import com.te.resumeapp.beans.ResumeResponse;
import com.te.resumeapp.beans.UserRegister;
import com.te.resumeapp.service.EducationInfoService;
import com.te.resumeapp.service.ExperienceDetailsService;
import com.te.resumeapp.service.ExtraDetailsService;
import com.te.resumeapp.service.PersonalDetailsService;
import com.te.resumeapp.service.ProjectDetailsService;
import com.te.resumeapp.service.RegisterService;



@RestController
public class ResumeController {

	@Autowired
	private RegisterService service;
	
	@Autowired
	private PersonalDetailsService personalService;
	
	@Autowired
	private EducationInfoService educationService;
	
	@Autowired
	private ExperienceDetailsService experienceService;
	
	@Autowired
	private ProjectDetailsService projectService;
	
	@Autowired
	private ExtraDetailsService extraService;
	
	@PostMapping(path = "/register")
	public ResponseEntity<ResumeResponse> storeData(@Valid @RequestBody UserRegister info) {
		ResumeResponse response = new ResumeResponse(false, service.register(info));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<ResumeResponse> login(@Valid @RequestBody UserRegister login) {
		ResumeResponse response = new ResumeResponse(false, service.login(login.getEmail(), login.getPassword()));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerpersonal")
	public ResponseEntity<ResumeResponse> storeDataPersonal(@Valid @RequestBody PersonalDetails personalDetails) {
		ResumeResponse response = new ResumeResponse(false, personalService.registerPersonalDetails(personalDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registereducation")
	public ResponseEntity<ResumeResponse> storeDataEducation(@Valid @RequestBody List<EducationInfo> educationinfo) {
		ResumeResponse response = new ResumeResponse(false, educationService.registerEducationInfo(educationinfo));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerexperience")
	public ResponseEntity<ResumeResponse> storeDataExperience(@Valid @RequestBody List<ExperienceDetails> experienceDetails) {
		ResumeResponse response = new ResumeResponse(false, experienceService.registerExperienceDetails(experienceDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerproject")
	public ResponseEntity<ResumeResponse> storeDataProject(@Valid @RequestBody List<ProjectDetails> projectDetails) {
		ResumeResponse response = new ResumeResponse(false, projectService.registerProjectDetails(projectDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerextra")
	public ResponseEntity<ResumeResponse> storeDataExtra(@Valid @RequestBody List<ExtraDetails> extraDetails) {
		ResumeResponse response = new ResumeResponse(false, extraService.registerExtraDetails(extraDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@GetMapping(path ="fetch/{id}")
	public ResponseEntity<ResumeResponse> fetchData(@PathVariable Integer id){
		ResumeResponse res=new ResumeResponse(false,service.fetchData(id));
		return new ResponseEntity<ResumeResponse>(res,HttpStatus.OK);
	}
	
}
