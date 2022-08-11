package DifferentWaysToPostRequest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateProjectWithHashMap 
{
	@Test
	public void createR()
	{

		HashMap hm=new HashMap();
		Random r=new Random();
		int ran = r.nextInt(200);
		hm.put("createdBy", "sachin");
		hm.put("projectName", "pactum"+ran);
		hm.put("status","created");
		hm.put("teamSize", 20);
		
		given()
			.body(hm)
			.contentType(ContentType.JSON)
		.when()
			.post("/addProject")
		.then()
			.assertThat().statusCode(201).log().all();
	}

}
