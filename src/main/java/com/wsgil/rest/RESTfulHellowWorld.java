package com.wsgil.rest;

import java.util.Date;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/hellow")
public class RESTfulHellowWorld 
{
	@GET
	@Path("start")
	@Produces("text/html")
	public Response getStartingPage()
	{
		String output = "<p>RESTful Service is running-----gilllllll</p<br>";
		return Response.status(200).entity(output).build();
	}
}