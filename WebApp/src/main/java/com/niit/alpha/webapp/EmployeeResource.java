package com.niit.alpha.webapp;


import javax.ws.rs.*;

@Path ("employee")
public class EmployeeResource {
	@GET
	@Path("{empno}")
	@Produces("application/json")
	public String getJson(@PathParam("empno") int empno)
	{
		switch(empno)
		{
		case 1: return "{'name' : 'John Snow', 'age' : 28}";
		case 2: return "{'name' : 'Arya Stark', 'age' : 18}";
		case 3: return "{'name' : 'Sansa Stark', 'age' : 25}";
		default: return "{'name' : 'Bran Stark', 'age' : 18}";
		}
	}
}