package restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post 
{
	//@Test
	public void Post()
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		JSONObject js=new JSONObject();
		//create object for json to load
		js.put("name", "suraj");
		js.put("job", "tester");
		//specify the key and value
		
		req.contentType(ContentType.JSON);
		//specify the req in which Formate
		
		req.body(js.toJSONString());
		//convert object into jsonString
		
		Response res = req.request(Method.POST,"/api/users");
		//perform post Action
		
		System.out.println(res.getStatusCode());
		// get status code
		
		res.prettyPrint();
		
		System.out.println(res.getTime());
		//get response time
	}	
	@Test
	public void get()
	{

		RestAssured.baseURI="https://reqres.in/";
	
		RequestSpecification req = RestAssured.given();
		
		Response res = req.request(Method.GET,"/api/users/2");
		String value = res.asString();
		JsonPath js=new JsonPath(value);
		String value1 = js.getString("data.first_name");
		System.out.println(value1);
		

		
	}
	

}
