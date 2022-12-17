package miniproject;

public class Student {
	private int sId;
	private String sName;
	private String address;
	public Student()
	{
		
	}
	
	

	public Student(int sId, String sName, String address) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.address = address;
	}

	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", address=" + address + "]";
}
	}
