package kw.kng.app.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler 
{
	@ExceptionHandler(value=CustomerNotFoundException.class)
	public ResponseEntity<ExceptionInfo> hndleCnfe(CustomerNotFoundException cnfe)
	{
		ExceptionInfo info=new ExceptionInfo();
		info.setCode("EXE001");
		info.setMsg(cnfe.getMessage());
		info.setPath("kw.kng.app.service");
		info.setLayer("Service Layer");
		info.setNmofclss("CustomerService.java");
		info.setDt(LocalDateTime.now());
		
		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
	}

}
/*
 
 CustomerService(Service layer) --> CustomerRestController(Controller Layer) --> AppExceptionHandler(Global exception Handler class)
 
 
1. This is a global exception handling class responsible for handling all exceptions in any layer present.
The above is just one simple example to handle Customer not found exception if the customer id <100.

2. Here Exception Info is a binding class responsible of passing data.

*/