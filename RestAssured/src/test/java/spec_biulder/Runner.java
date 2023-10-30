package spec_biulder;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Runner 
{
	@Test
	public void test()
	{ Object obj="{"
			+ "name\": \"morpheus\","
			+ "job\": \"leader\""
			+ "}";
		Response response = given().body(obj).spec(Req_Res_spec.req_spec()).when()
				.post("/api/users")
		.then().spec(Req_Res_spec.res_Spec(201)).extract().response();
		
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
		
	}
}
