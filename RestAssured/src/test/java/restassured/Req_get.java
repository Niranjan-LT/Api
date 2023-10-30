package restassured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Req_get 
{
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		//base URL
		RequestSpecification req = RestAssured.given();
		//Specify EndPoints and Http method
		 Response res = req.request(Method.GET,"/api/users/2");
		//single line output
		System.out.println(res.asString());
		//Json body
		res.prettyPrint();
		//status code
		System.out.println(res.getStatusCode());
		//to fetch server name
		System.out.println(res.getHeader("server"));
		//respose time
		System.out.println(res.getTime());
		//get respose time
		
		
	}

	}
	
