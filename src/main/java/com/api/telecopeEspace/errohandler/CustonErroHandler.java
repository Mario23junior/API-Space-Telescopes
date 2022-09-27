package com.api.telecopeEspace.errohandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.api.telecopeEspace.exception.ExceptionReturnMessageObjectFailed;
import com.api.telecopeEspace.modelerro.ModelErroInterface;

@RestControllerAdvice
public class CustonErroHandler {
   
	@ExceptionHandler(ExceptionReturnMessageObjectFailed.class)
 	public ModelErroInterface CustonErroHandlerReturn(ExceptionReturnMessageObjectFailed ex, WebRequest request) {
		ModelErroInterface error = new ModelErroInterface(
				HttpStatus.NO_CONTENT.value(),
				new Date(),
				ex.getMessage(),
				request.getDescription(false));
				
		return error;
				
 	}
}
