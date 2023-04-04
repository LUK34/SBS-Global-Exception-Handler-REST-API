package kw.kng.app.service;

import org.springframework.stereotype.Service;

import kw.kng.app.exceptions.CustomerNotFoundException;

@Service
public class CustomerService 
{
	public String getCustomerNameById(Integer customerId) 
	{
		if(customerId>=100)
		{
			return "John";
		}
		else 
		{
			throw new CustomerNotFoundException("Invalid Customer");
		}
	}

}

/*
 1. Here if there is an exception it will go to AppExceptionHandler which is a Global Exception Handling class.
 
 2. CustomerService(Service layer) --> CustomerRestController(Controller Layer) --> AppExceptionHandler(Global exception Handler class)
 
 3.
 GET Method
 Path: localhost:8080/customer/1
 
 OUTPUT:
 {
    "code": "EXE001",
    "msg": "Invalid Customer",
    "layer": "Service Layer",
    "path": "kw.kng.app.service",
    "nmofclss": "CustomerService.java",
    "dt": "2023-04-04T19:33:16.2999703"
}
 */
