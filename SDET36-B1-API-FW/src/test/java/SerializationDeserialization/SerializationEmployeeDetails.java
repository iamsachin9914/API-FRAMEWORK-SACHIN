package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOclassForSerializationAndDeserialization.EmployeeDetails;

public class SerializationEmployeeDetails

{
	@Test
	public void serializeEmpDetailsTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		//Create object for pojo class and provide values
		EmployeeDetails emp=new EmployeeDetails("Sachin","s187",812923,"Bangalore");
		
		//Create object for object Mapper from jackson mapper
		ObjectMapper obj=new ObjectMapper();
		
		//Write data into JSON file
		obj.writeValue(new File("./EmployeeDetails.json"), emp);
	}
	
}
