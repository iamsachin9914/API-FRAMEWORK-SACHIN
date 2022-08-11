package BasicCRUDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest
{
	@Test
	public void updateProjectTest()
	{
		
//		//Step1: Create the data
//		JSONObject jObj=new JSONObject();
//		jObj.put("createdBy","Sachin");
//		jObj.put("projectName","TYSS");
//		jObj.put("status","On going");
//		jObj.put("teamSize",30);
//		
//		//Step2: Send the request
//		
//		RequestSpecification rp=new RestAssured().given();
//		rp.body(jObj);
//		rp.contentType(ContentType.JSON);
//		Response resp = rp.put("http://localhost:8084/projects/TY_PROJ_1006");
//		resp.then().log().all();
	}

}
