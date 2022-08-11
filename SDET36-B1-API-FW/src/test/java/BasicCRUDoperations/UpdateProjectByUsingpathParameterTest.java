package BasicCRUDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectByUsingpathParameterTest 
{
	@Test
	public void updateProjectByUsingpathParameter()
	{	
		
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Sachin");
		jObj.put("projectName","TYSS-NEW");
		jObj.put("status","Created");
		jObj.put("teamSize",20);
		RequestSpecification request=RestAssured.given();
		request.body(jObj);
		request.contentType(ContentType.JSON);
		request.pathParam("pId", "TY_PROJ_806");
		Response resp = request.put("http://localhost:8084/projects/{pId}");
		resp.then().log().all();
	}
}
