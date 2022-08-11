package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOclassForSerializationAndDeserialization.EmployeeDetailsWithArray;

public class SerializeForEmployeeDetailsWithArray
{
	int[]phno= {1234,4321};
	String[]mail= {"sachin@gmail.com","sachin@ty.com"};
	@Test
	public void empDetailsWithArray() throws JsonGenerationException, JsonMappingException, IOException
	{
		EmployeeDetailsWithArray emp1=new EmployeeDetailsWithArray("Sachin","S0304",phno,mail,"Bangalore");
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./EmployeeDetailsWithArray.json"), emp1);
	}
}
