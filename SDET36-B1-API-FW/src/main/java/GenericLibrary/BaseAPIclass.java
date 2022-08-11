package GenericLibrary;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseAPIclass
{
	public DataBaseLibrary dLib=new DataBaseLibrary();
	public JavaLibrary jLib=new JavaLibrary();
	public RestAssuredLibrary rLib=new RestAssuredLibrary();
	
	@BeforeSuite
	public void bsConfig() throws SQLException
	{
		dLib.connectToDB();
		Reporter.log(".................Connection successfully established...............");
		baseURI="http://localhost";
		port=8084;
		
	}
	@AfterSuite
	public void asConfig()
	{
		
	}
}
