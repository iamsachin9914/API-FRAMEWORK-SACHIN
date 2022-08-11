package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidation 
{
	@Test
	public void responseTimeValidation()
	{
		baseURI = "http://localhost";
		port = 8084;
		when()
			.get("/projects") 
		.then()
			.assertThat().time(Matchers.lessThan(500l),TimeUnit.MILLISECONDS)
			.log().all();
	}

}
