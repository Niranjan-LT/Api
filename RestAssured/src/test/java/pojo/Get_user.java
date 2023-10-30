package pojo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_user 
{
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"/api/users/2");
		Single_User s = res.as(Single_User.class);
		//To fetch Data
		Data d = s.getData();
		//to fetch Support
		Support supp = s.getSupport();
		
		String url = supp.getUrl();
		
		System.out.println(url);
		
		String email = d.getEmail();
		System.out.println(email);
		System.out.println(d.getFirst_name());
		System.out.println(d.getLast_name());
		System.out.println(d.getAvatar());


		
	}

}
