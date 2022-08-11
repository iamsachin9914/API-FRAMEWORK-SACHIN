package BasicCRUDoperations;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteOneProjectTest 
{
	@Test
	public void deleteOneProjectTest()
	{
//		Response r = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1006");
//		r.then().log().all();
		
		baseURI="http://localhost";
		port=8084;
		
		when()
	}
}
