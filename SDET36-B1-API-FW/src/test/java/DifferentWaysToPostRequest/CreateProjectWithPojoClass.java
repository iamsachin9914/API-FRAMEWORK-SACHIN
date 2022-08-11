package DifferentWaysToPostRequest;

import org.testng.annotations.Test;

import POJOclasses.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithPojoClass 
{
	@Test
	public void createP() 
	{
		baseURI = "http://localhost";
		port = 8084;
		
		Random r=new Random();
		int ran = r.nextInt(200);
		ProjectLibrary pLib=new ProjectLibrary("Sachin","TCS"+ran,"completed",25);
		
		given()
		 .body(pLib)
		 .contentType(ContentType.JSON)
		.when()                        
		 .post("/addProject")
		.then()                          
		 .assertThat().statusCode(201).log().all();
	}
	
}
