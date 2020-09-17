package com.parker.webservice;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/sample")
@Api(value="sample")
public class ServiceInit {
	private static String getResponse = "{\"response\": {\"success\":\"Get Response\"}}";
	private static String postResponse = "{\"response\": {\"success\":\"Post Response\"}}";
	
	@GET
	@Path("/get")
	@ApiOperation(value = "Get request API")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRequest(@ApiParam(value = "name that need to be updated", required = true) @QueryParam("username") String username) {
		return Response.status(200).entity(getResponse).build();
	}
	@POST
	@Path("/post")
	@ApiOperation(value = "Post request API")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	 @ApiImplicitParams({
		    @ApiImplicitParam(name = "name", value = "User's name", required = true, dataType = "string", paramType = "body"),
		    @ApiImplicitParam(name = "email", value = "User's email", required = false, dataType = "string", paramType = "body"),
		    @ApiImplicitParam(name = "id", value = "User ID", required = true, dataType = "long", paramType = "body")
		  })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied")})
	
	public Response postRequest() {
		return Response.status(200).entity(postResponse).build();
	}
}
