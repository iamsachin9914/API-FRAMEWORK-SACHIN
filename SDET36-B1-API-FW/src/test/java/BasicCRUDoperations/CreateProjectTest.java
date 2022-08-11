package BasicCRUDoperations;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class CreateProjectTest 
{
	@Test
	public void createProjectTest()
	{
//		//Create Random Number
//		Random r=new Random();
//		int random=r.nextInt(500);
//	
//		//Step1: Create the necessary data
//	
//		JSONObject jObj=new JSONObject();
//		jObj.put("createdBy","Sachin");
//		jObj.put("projectName","TYSS"+random);
//		jObj.put("status","Created");
//		jObj.put("teamSize",20);
//		
//		//Step2: Send the request
//		
//		RequestSpecification request=RestAssured.given();
//		request.body(jObj);
//		request.contentType(ContentType.JSON);
//		
//		Response resp = request.post("http://localhost:8084/addProject");
//		
//		//Step3: Validate the response
//		
//		ValidatableResponse validate=resp.then();
//		validate.log().all();
		
		
		baseURI="http://localhost";
		port=8084;
		
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Sachin");
		jObj.put("projectName","TYSS");
		jObj.put("status","Created");
		jObj.put("teamSize",20);
		
		given()
			.body(jObj)
			.contentType(ContentType.JSON)
		.when()
			.post("/addProject")
		.then()
			.assertThat().statusCode(201).log().all();
	}
}
