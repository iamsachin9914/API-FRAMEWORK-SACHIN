package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation
{
	@Test
	public void staticResponse()

	{
		String expData = "TY_PROJ_002";
		baseURI = "http://localhost";
		port = 8084;
		Response resp = when()
				        .get("/projects");
		
		String actData = resp.jsonPath().get("[1].projectId");
		Assert.assertEquals(actData, expData);
		System.out.println("verfied ");
		//resp.then().log().all();
	}
}
