package BasicCRUDoperations;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.response.Response.*;


public class GetOneProject 
{
	@Test
	public void getOneProject()
	{
//		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_806");
//		ValidatableResponse validate=resp.then();
//		validate.log().all();
		
		
		baseURI="http://localhost";
		port=8084;
		when()
			.get("/projects/TY_PROJ_806")
		.then()
			.assertThat().statusCode(200).log().all();
	}

}
