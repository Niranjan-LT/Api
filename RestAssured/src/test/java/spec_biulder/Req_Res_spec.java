package spec_biulder;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Req_Res_spec 
{
	public static RequestSpecification req_spec()
	{
		RequestSpecBuilder req=new RequestSpecBuilder();
		RequestSpecification request = req.setBaseUri("https://reqres.in/")
		.setContentType(ContentType.JSON).build();
		return request;
	}
	public static ResponseSpecification res_Spec(int code)
	{
		ResponseSpecBuilder res=new ResponseSpecBuilder();
		ResponseSpecification response = res.expectContentType(ContentType.JSON)
		.expectStatusCode(code).build();
		return response;
	}

}
