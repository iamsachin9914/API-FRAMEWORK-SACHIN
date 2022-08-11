package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOclassForSerializationAndDeserialization.EmployeeDetailsWithArray;
import POJOclassForSerializationAndDeserialization.EmployeeDetailsWithObject;

public class DeserializationEmployeeDetailsWithObject 
{
	@Test
	public void DeserializationEmployeeDetailsWithObject() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper ob3=new ObjectMapper();
		EmployeeDetailsWithObject value = ob3.readValue(new File(".\\EmployeeDetailsWithObject.json"),EmployeeDetailsWithObject.class);
		System.out.println(value.geteName());
		System.out.println(value.getPhno());
		System.out.println(value.getSpouse());
	
	}
	
}
