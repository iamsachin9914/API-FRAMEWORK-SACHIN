package GenericLibrary;

import org.testng.annotations.Test;

import POJOclasses.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class CreateProjectVerifyInDB 
{
	@Test
	public void createAndVerifyProject()
	{
		ProjectLibrary pLib=new ProjectLibrary("Sachin","volvo","Completed",33);
		
	}
}
