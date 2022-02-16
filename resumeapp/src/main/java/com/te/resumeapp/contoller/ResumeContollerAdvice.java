package com.te.resumeapp.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.resumeapp.beans.ResumeResponse;
import com.te.resumeapp.exception.DetailsNotFoundException;
import com.te.resumeapp.exception.RegisterException;

@RestControllerAdvice
public class ResumeContollerAdvice {

	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResumeResponse> methodArgumentNotValidException(MethodArgumentNotValidException exp){
		ResumeResponse res = new ResumeResponse(true,exp.getFieldError().getDefaultMessage());
		return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DetailsNotFoundException.class)
	public ResponseEntity<ResumeResponse> exception(DetailsNotFoundException found) {
		ResumeResponse response = new ResumeResponse(true, found.getMessage());	
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(RegisterException.class)
	public ResponseEntity<ResumeResponse> registerException(RegisterException reg){
		ResumeResponse response = new ResumeResponse(true, reg.getMessage());
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.NOT_FOUND);
	}
}
