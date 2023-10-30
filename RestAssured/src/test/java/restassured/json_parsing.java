package restassured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class json_parsing
{
	public static void main(String[] args) 
		
	
	{

		RestAssured.baseURI="https://reqres.in/";
	
		RequestSpecification req = RestAssured.given();
		
		Response res = req.request(Method.GET,"/api/users?page=2");
		String value = res.asString();
		
		JsonPath js=new JsonPath(value);
		
		String value1 = js.getString("data[0].email");
		
		System.out.println(value1);
		
	}
	

}
