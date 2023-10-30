package hybrid_framework;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
public class Get_user 
{
	public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	given().when().get("/api/users/2").then().statusCode(200);
	System.out.println("done");	
	}

}
