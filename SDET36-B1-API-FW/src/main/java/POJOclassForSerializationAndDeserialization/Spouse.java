package POJOclassForSerializationAndDeserialization;

public class Spouse 
{
	String sName;
	int sAge;
	
	
	public Spouse(String sName, int sAge)
	{
		this.sName = sName;
		this.sAge = sAge;
	}
	public Spouse() 
	{
		
	}

	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public int getsAge() {
		return sAge;
	}


	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	
	
}
