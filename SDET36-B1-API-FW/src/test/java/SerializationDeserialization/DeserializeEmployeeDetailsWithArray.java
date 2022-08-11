package SerializationDeserialization;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;
import POJOclassForSerializationAndDeserialization.EmployeeDetailsWithArray;

public class DeserializeEmployeeDetailsWithArray 
{
	@Test
	public void DeserializationEmployeeDetailsWithArray() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper ob1=new ObjectMapper();
		EmployeeDetailsWithArray value = ob1.readValue(new File(".\\EmployeeDetailsWithArray.json"),EmployeeDetailsWithArray.class);
		System.out.println(value.geteName());
		System.out.println(value.geteAddress());
		System.out.println(value.getEmailId()[1]);

	}
}
