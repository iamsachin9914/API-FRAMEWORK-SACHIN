package EndToEndScenarios;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIclass;
import GenericLibrary.DataBaseLibrary;
import GenericLibrary.EndPointsLibrary;
import GenericLibrary.IConstants;
import GenericLibrary.JavaLibrary;
import GenericLibrary.RestAssuredLibrary;
import POJOclasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateProjectVerifyInDB extends BaseAPIclass
{

	@Test
	public void createAndVerifyProject() throws SQLException
	{
		int ran = jLib.getRandomNumber();
		ProjectLibrary pLib=new ProjectLibrary("Sachin","volvo"+ran,"Completed",33);
		Response res = given()
			.body(pLib)
			.contentType(ContentType.JSON)
		.when()
			.post(EndPointsLibrary.createProject);
		res.then().log().all();
		
		String expData = rLib.getJsonData(res,"projectId");
		Reporter.log(expData,true);
		
		String Query="select * from project;";
		System.out.println(Query);
		
		dLib.readDataFromDBandValidate(Query,1,expData);
			
	}
}
