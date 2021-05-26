package com.example.springdemo.rest;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.ControllerAdvice;
	import org.springframework.web.bind.annotation.ExceptionHandler;
	
@ControllerAdvice
public class CustomerRestExceptionHandler {

		//add exceptions
		
		@ExceptionHandler
		public ResponseEntity<CustomerErrorResponse> handleExeption(CustomerNotFoundException exc){
			//create CustomerErrorResponse
			CustomerErrorResponse error = new CustomerErrorResponse();
			error.setStatus(HttpStatus.NOT_FOUND.value());
			error.setMessage(exc.getMessage());
			error.setTimeStamp(System.currentTimeMillis());
			
			//return response
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
		
		@ExceptionHandler
		public ResponseEntity<CustomerErrorResponse> handleExeption(Exception exc){
			//create CustomerErrorResponse
			CustomerErrorResponse error = new CustomerErrorResponse();
			error.setStatus(HttpStatus.BAD_REQUEST.value());
			error.setMessage(exc.getMessage());
			error.setTimeStamp(System.currentTimeMillis());
			//return response
			
			return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		}
}


