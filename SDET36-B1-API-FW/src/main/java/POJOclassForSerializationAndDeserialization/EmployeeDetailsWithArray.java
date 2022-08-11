package POJOclassForSerializationAndDeserialization;

public class EmployeeDetailsWithArray 
{
	String eName;
	String eId;
	int[] phno=new int[2];
	String[] emailId=new String[2];
	String eAddress;
	



	public EmployeeDetailsWithArray(String eName, String eId, int[] phno, String[] emailId, String eAddress) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.phno = phno;
		this.emailId = emailId;
		this.eAddress = eAddress;
	}
	public EmployeeDetailsWithArray()
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


	public int[] getPhno() {
		return phno;
	}


	public void setPhno(int[] phno) {
		this.phno = phno;
	}


	public String[] getEmailId() {
		return emailId;
	}


	public void setEmailId(String[] emailId) {
		this.emailId = emailId;
	}


	public String geteAddress() {
		return eAddress;
	}


	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	
}
