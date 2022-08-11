package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOclassForSerializationAndDeserialization.EmployeeDetails;

public class DeserializationEmployeeDetails 
{
	@Test
	public void deserializeEmpDetailsTest() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper ob=new ObjectMapper();
		EmployeeDetails value = ob.readValue(new File(".\\EmployeeDetails.json"),EmployeeDetails.class);
		System.out.println(value.geteName());
		System.out.println(value.getePhno());
	}

}

