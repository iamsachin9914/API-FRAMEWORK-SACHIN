package DataDrivenTesting;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter
{
	@Test
	public void createProjectPath()
	{
		baseURI="http://localhost:8084";
		given()
			.pathParam("pId","TY_PROJ_2402")
		.when()
			.get("/projects/{pId}")
		.then().assertThat().statusCode(200).log().all();
		
	}

}
