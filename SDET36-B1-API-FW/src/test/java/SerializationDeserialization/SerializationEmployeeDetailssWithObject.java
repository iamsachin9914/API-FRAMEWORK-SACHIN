package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOclassForSerializationAndDeserialization.EmployeeDetailsWithObject;
import POJOclassForSerializationAndDeserialization.Spouse;

public class SerializationEmployeeDetailssWithObject
{
	int[]phno= {1234,4321};
	String[]mail= {"sachin@gmail.com","sachin@ty.com"};
	@Test
	public void serializeEmpDetailsWithObjectTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		Spouse sp=new Spouse("abc",25);
		EmployeeDetailsWithObject emp2=new EmployeeDetailsWithObject("Sachin","s123",phno,mail,sp);
		ObjectMapper obj3=new ObjectMapper();
		obj3.writeValue(new File("./EmployeeDetailsWithObject.json"), emp2);
	}
}
