package POJOclassForSerializationAndDeserialization;

public class EmployeeDetailsWithObject
{
	String eName;
	String eId;
	int[] phno;
	String[]mailId;
	Object Spouse;

	
	
	public EmployeeDetailsWithObject(String eName, String eId, int[] phno, String[] mailId, Object spouse) 
	{
		this.eName = eName;
		this.eId = eId;
		this.phno = phno;
		this.mailId = mailId;
		Spouse = spouse;
	}
	public EmployeeDetailsWithObject()
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


	public String[] getMailId() {
		return mailId;
	}


	public void setMailId(String[] mailId) {
		this.mailId = mailId;
	}


	public Object getSpouse() {
		return Spouse;
	}


	public void setSpouse(Object spouse) {
		Spouse = spouse;
	}
	
	
}
