package BasicCRUDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectWithExistingIDTest 
{
	@Test
	public void CreateProjectWithExistingID()
	{
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Sachin");
		jObj.put("projectName","Rmg");
		jObj.put("status","Completed");
		jObj.put("teamSize",15);
		jObj.put("projectId", "TY_PROJ_806");
		
		//Step2: Send the request
		
		RequestSpecification request=RestAssured.given();
		request.body(jObj);
		request.contentType(ContentType.JSON);
		
		Response resp = request.post("http://localhost:8084/addProject/TY_PROJ_806");
		
		//Step3: Validate the response
		
		ValidatableResponse validate=resp.then();
		validate.log().all();
	}
}
