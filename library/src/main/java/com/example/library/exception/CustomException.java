package com.example.library.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomException {
	
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<Object> bookNotFoundException(BookNotFoundException e){
		
		return new ResponseEntity<Object>("Product not found!",HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> userNotFoundException(UserNotFoundException e){
		
		return new ResponseEntity<Object>("User not Found!",HttpStatus.NOT_FOUND);
		
	}

}
