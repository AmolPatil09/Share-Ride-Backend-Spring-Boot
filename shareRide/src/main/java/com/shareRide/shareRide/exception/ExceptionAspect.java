package com.shareRide.shareRide.exception;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionAspect {

	@ExceptionHandler(RegistartionExceptipon.class)
	public ResponseEntity<ErrorInfo> patientExceptiponHandle(RegistartionExceptipon err)
	{
		ErrorInfo errorInfo=new ErrorInfo();
		
		errorInfo.setStatusCode(HttpStatus.BAD_REQUEST.value());
		errorInfo.setMsg(err.getMessage());
		return new ResponseEntity<ErrorInfo>(errorInfo,HttpStatus.BAD_REQUEST);
		
		
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	
	ResponseEntity<ErrorInfo> methodArgumentNotValidException(MethodArgumentNotValidException err)
	{
		String str="";
		List<ObjectError> list=err.getAllErrors();
		for(ObjectError obj:list)
		{
			str=str+obj.getDefaultMessage()+",";
		}
		ErrorInfo info = new ErrorInfo();
		info.setMsg(str);
		info.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ErrorInfo>(info,HttpStatus.NOT_FOUND);
	
	}
	
	
	
	
	
	
	
}
