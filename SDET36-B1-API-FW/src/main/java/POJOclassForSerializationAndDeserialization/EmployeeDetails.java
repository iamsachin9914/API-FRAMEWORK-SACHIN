package POJOclassForSerializationAndDeserialization;

public class EmployeeDetails 
{
	String eName;
	String eId;
	int ePhno;
	String eAddress;
	
	
	public EmployeeDetails(String eName, String eId, int ePhno, String eAddress)
	{
		
		this.eName = eName;
		this.eId = eId;
		this.ePhno = ePhno;
		this.eAddress = eAddress;
	}
	
	//creating another constructor to reinitialize deserialization
	public EmployeeDetails()
	{
		
	}

	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public String geteId() {
		return eId;
	}


	public void seteId(String eId) {
		this.eId = eId;
	}


	public int getePhno() {
		return ePhno;
	}


	public void setePhno(int ePhno) {
		this.ePhno = ePhno;
	}


	public String geteAddress() {
		return eAddress;
	}


	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	
	
}
