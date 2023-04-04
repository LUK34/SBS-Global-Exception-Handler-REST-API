package kw.kng.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kw.kng.app.service.CustomerService;

@RestController
public class CustomerRestController 
{
	@Autowired
	private CustomerService cs;
	
	@GetMapping("/customer/{customerId}")
	public String getCustomerName(@PathVariable Integer customerId) throws Exception
	{
		return cs.getCustomerNameById(customerId);
	}

}


/*

CustomerService(Service layer) --> CustomerRestController(Controller Layer) --> AppExceptionHandler(Global exception Handler class)
 

==============================
REST Architecture Principles
=============================

REST : Representation State Transfer

1) Client Server Architecture (B 2 B)

2) No State / Session Management

3) Unique Addressability

4) Map REST API endpoints to HTTP Methods

5) MediaType Representation (consumes, produces & Content-Type, Accept)

6) HATEOS (Hypermedia as a engine to represent state)





 */
