package BasicCRUDoperations;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createtheprojectwithkeyValuePairTest 
{
	@Test
	public void createtheprojectwithkeyValuePair()
	{
		Random r=new Random();
		int random=r.nextInt(500);
		RequestSpecification request=RestAssured.given();
		request.formParam("createdBy","Sachin");
		request.formParam("projectName","TYSS"+random);
		request.formParam("status","Created");
		request.formParam("teamSize",10);
		Response resp = request.post("http://localhost:8084/addProject");
		ValidatableResponse validate=resp.then();
		validate.log().all();
	}
}
