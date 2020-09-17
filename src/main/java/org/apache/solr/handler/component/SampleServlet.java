package org.apache.solr.handler.component;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;

/**
 * Servlet implementation class SampleServlet
 */
/*
@SwaggerDefinition(
        info = @Info(
                description = "This is a sample server",
                version = "1.0.0",
                title = "Swagger Sample Servlet"
        ),
        consumes = {"application/json"},
        produces = {"application/json"},
        schemes = {SwaggerDefinition.Scheme.HTTP}
        
)
*/

@Api(value = "/solr/MyParker/select", description = "gets some data from a servlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    @ApiOperation(httpMethod = "GET", value = "Resource to get a user",  nickname = "getUser")
    @ApiResponses({@ApiResponse(code = 400, message = "Invalid input")})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "User ID", required = true, dataType = "integer", paramType =
                    "query"),
            @ApiImplicitParam(name = "name", value = "User's name", required = true, dataType = "string", paramType =
                    "query"),
            @ApiImplicitParam(name = "email", value = "User's email", required = true, dataType = "string", paramType
                    = "query"),
            @ApiImplicitParam(name = "age", value = "User's age", required = true, dataType = "integer", paramType =
                    "query"),
            @ApiImplicitParam(name = "dateOfBirth", value = "User's date of birth, in dd-MM-yyyy format",
                    dataType = "java.util.Date", paramType = "query")})
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @ApiOperation(httpMethod = "POST", value = "Resource to get a user",  nickname = "getUser")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
