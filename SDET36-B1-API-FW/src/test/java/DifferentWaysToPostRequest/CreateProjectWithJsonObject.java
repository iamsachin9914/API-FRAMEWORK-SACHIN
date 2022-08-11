package DifferentWaysToPostRequest;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithJsonObject
{
	@Test
	public void createReq()
	{
		baseURI="http://localhost:8084";
		Random r=new Random();
		int ran = r.nextInt(200);
		JSONObject jb=new JSONObject();
		jb.put("createdBy", "sachin");
		jb.put("projectName", "pactum"+ran);
		jb.put("status","created");
		jb.put("teamSize", 20);
		
		
		given()
			.body(jb)
			.contentType(ContentType.JSON)
		.when()
			.post("/addProject")
		.then()
			.assertThat().statusCode(201).log().all();
			
	}
}
