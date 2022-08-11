package RequestChaining;

import org.testng.annotations.Test;

import POJOclasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateGetDeleteProject
{
	@Test
	public void requestChain()
	{
		Random r=new Random();
		int ran = r.nextInt(200);
		baseURI="http://localhost:8084";
		ProjectLibrary pLib=new ProjectLibrary("Sachin","Infosys"+ran,"Started",40);
	
		Response resp = given()
			.body(pLib)
			.contentType(ContentType.JSON)
		.when()
			.post("/addProject");
			
		String proId = resp.jsonPath().get("projectId");
		System.out.println(proId);
		resp.then().log().all();
		
		given()
			.pathParam("pid", proId)
		.when()
			.get("/projects/{pid}")
		.then()
			.assertThat().statusCode(200).log().all();
		
		given()
			.pathParam("prId",proId)
		.when()
			.delete("/projects/{prId")
		.then()
			.assertThat().statusCode(204).log().all();		
			
	}

}
