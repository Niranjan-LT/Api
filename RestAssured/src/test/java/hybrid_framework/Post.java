package hybrid_framework;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Post 
{
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		Object obj="{"
				+ "name\": \"morpheus\","
				+ "job\": \"leader\""
				+ "}";
		  Response res = given().body(obj).when().post("/api/users").then().statusCode(201)
		.and().contentType(ContentType.JSON).extract().response();
		  System.out.println(res.asString());
	
		System.out.println("done");
	}

}
