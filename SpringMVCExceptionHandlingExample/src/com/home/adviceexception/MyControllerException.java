package com.home.adviceexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerException {
	
	@ExceptionHandler(value = RuntimeException.class)
	public String exceptionHandler(){
		return "runTimeException";
	}

}
