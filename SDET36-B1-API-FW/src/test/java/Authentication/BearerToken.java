package Authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class BearerToken 
{
	@Test
	public void bearerAuth()
	{
		baseURI="https://api.github.com";
		HashMap hm=new HashMap();
		hm.put("name","SDET-36-AUTH");
		hm.put("description", "RestAssured bearer token check");
		given()
			.auth()
			.oauth2("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")
			.body(hm)
			.contentType(ContentType.JSON)
		.when()
			.post("/user/repos")
		.then()
			.assertThat().statusCode(201).log().all();
	}
}
