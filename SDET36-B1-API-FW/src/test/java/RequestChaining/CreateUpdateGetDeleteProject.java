package RequestChaining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import POJOclasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateUpdateGetDeleteProject 
{
	@Test
	public void requestChain()
	{

		//Step 1: Create the project

		baseURI="http://localhost:8084";
		Random r=new Random();
		int ran = r.nextInt(200);
		ProjectLibrary pl=new ProjectLibrary("Sachin","HP"+ran,"Created",20);
		Response resp = given()
					.body(pl)
					.contentType(ContentType.JSON)
				.when()
					.post("/addProject");

		String proId1 = resp.jsonPath().get("projectId");
		System.out.println(proId1);
		System.out.println("Project created");
		resp.then().log().all();

		//Step2: Update the project

		ProjectLibrary plb=new ProjectLibrary("Sachin","HP"+ran,"Completed",20);
		given()
			.pathParam("pid1", proId1)
			.body(plb)
			.contentType(ContentType.JSON)
		.when()
			.put("projects/{pid1}")
		.then()
			.assertThat().statusCode(200).log().all();
		System.out.println("Project Updated");

		//Step 3: Get the project

		String proId2 = resp.jsonPath().get("projectId");
		System.out.println(proId2);
		resp.then().log().all();

		given()
			.pathParam("pid2", proId2)
		.when()
			.get("/projects/{pid2}")
		.then()
			.assertThat().statusCode(200).log().all();


		//Step 4 : Delete the project

		given()
		.pathParam("prId",proId2)
		.when()
		.delete("/projects/{prId}")
		.then()
		.assertThat().statusCode(204).log().all();	
		System.out.println("Project Deleted");



	}

}
