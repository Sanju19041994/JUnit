package com.shruteekaTech.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ResponseApi> handlerResourceNotFoundException(ResourceNotFoundException ex){
		
		String message = ex.getMessage();
		ResponseApi api = new ResponseApi();
		api.setMsg(message);
		api.setStatus(false);
		
		return new ResponseEntity<ResponseApi>(api,HttpStatus.NOT_FOUND);
	}
}
