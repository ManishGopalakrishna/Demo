package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler
	public ResponseEntity<String> customExceptionHandler(CustomException ce){
		 return new ResponseEntity<>(ce.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
