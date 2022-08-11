package BasicCRUDoperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class LoginRMGYantrawithAuthenticationTest 
{
	@Test
	public void LoginRMGYantrawithAuthentication()
	{
		RequestSpecification r=RestAssured.given();
		r.auth().basic("rmgyantra", "rmgy@9999").when().get("http://localhost:8084/login").then().log().all();
	}
}
