package pojo2;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Runner_List_user 
{
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"/api/users?page=2");
		List_user s = res.as(List_user.class);
		List<Data> data = s.getData();
		for(Data d1:data)
		{
			String email = d1.getEmail();
			String first_name = d1.getFirst_name();
			
			System.out.println(email+"==="+first_name);
		}
		
		
		
		
		
	}

}
