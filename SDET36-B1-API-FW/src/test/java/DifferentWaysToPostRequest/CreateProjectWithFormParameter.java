package DifferentWaysToPostRequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

import static io.restassured.RestAssured.*;

public class CreateProjectWithFormParameter 
{
	@Test
	public void creareReq()
	{
		baseURI = "http://localhost";
		port = 8084;
		Random r=new Random();
		int ran = r.nextInt(200);
		
		
		given()
			.formParam("createdBy", "Sachin")
			.formParam("projectName", "Xylem"+ran)
			.formParam("status", "On going")
			.formParam("teamSize", 50)
		 .contentType(ContentType.JSON)
		.when()                       
		 .post("/addProject")
		.then()                  
		 .assertThat().statusCode(201)
		 .log().all();
	}

}
