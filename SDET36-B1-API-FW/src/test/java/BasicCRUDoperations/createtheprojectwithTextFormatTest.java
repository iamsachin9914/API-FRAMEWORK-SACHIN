package BasicCRUDoperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createtheprojectwithTextFormatTest 
{
	@Test
	public void createtheprojectwithTextFormat()
	{

		Random r=new Random();
		int random=r.nextInt(500);
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Sachin");
		jObj.put("projectName","TYSS"+random);
		jObj.put("status","Created");
		jObj.put("teamSize",20);
		RequestSpecification request=RestAssured.given();
		request.body(jObj);
		request.contentType(ContentType.TEXT);
		Response resp = request.post("http://localhost:8084/addProject");
		ValidatableResponse validate=resp.then();
		validate.log().all();
	}
}
