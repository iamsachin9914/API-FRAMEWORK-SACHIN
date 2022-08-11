package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2_0
{
	@Test
	public void oAuth2()
	{
		baseURI="http://coop.apps.symfonycasts.com";
		Response resp = given()
			.formParam("client_id", "MYAPP187")
			.formParam("client_secret","d592c6e1ce352e7cd10736c4ca654648")
			.formParam("grant_type", "client_credentials")
			.formParam("redirect_uri", "http://sachin187.com")
			.formParam("code", "authorization_code")
			
			.when()
				.post("/token");
		
		
		//step 2: capture the access token using json path
		
	
			String token=resp.jsonPath().get("access_token");
			System.out.println(token);
			
		//step 3: Use the access token
			
			given()
				.auth()
				.oauth2(token)
				.pathParam("USER_ID", 3662)
			.when()
				.post("/api/{USER_ID}/eggs-collect")
			.then().log().all();
			
			
	}

}
