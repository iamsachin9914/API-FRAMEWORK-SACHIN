package DataDrivenTesting;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import POJOclasses.ProjectLibrary;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import java.util.Random;

public class CreateMultipleProject 
{
	@Test(dataProvider = "pDetails")
	public void createNewProjects(String createdBy,String projectName,String status,int teamSize)
	{
		Random r=new Random();
		int ran=r.nextInt(500);
		ProjectLibrary pl=new ProjectLibrary(createdBy,projectName+ran,status,teamSize);
		basePath="http://localhost:8084";
		
		given()
		 .body(pl)
		 .contentType(ContentType.JSON)
	   
		.when()
		 .post("/addProject")
		 .then().log().all();
	}
	
	@DataProvider(name="pDetails")
	public Object[][] details()
	{
		Object[][] details=new Object[3][4];
		details[0][0]="Gokul";
		details[0][1]="TYSS";
		details[0][2]="Completed";
		details[0][3]=30;
		
		details[1][0]="Divya";
		details[1][1]="QSP";
		details[1][2]="on Going";
		details[1][3]=20;
		
		details[2][0]="Soumya";
		details[2][1]="TCS";
		details[2][2]="started";
		details[2][3]=10;
		return details;
	}

}
