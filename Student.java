
public class Student {
	private String fName;
	private String lName;
	private int eid;	
	private static int classCount =1;
	public static void changeCount() {
		classCount += 1;
	}
	public Student(String fName, String lName, int eid) {
		this.fName = fName;
		this.lName = lName;
		this.eid = eid;
	}
	public Student(String lName, int eid, String fName) {
		this.fName = fName;
		this.lName = lName;
		this.eid = eid;
	}
	public static int getClassCount() {
		return classCount;
	}	
	public void setFName(String fName) {
		this.fName = fName;
	}
	public String getFName() {
		return fName;
	}
	public void setLName(String lName) {
		this.lName = lName;
	}
	public String getLName() {
		return lName;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEid() {
		return eid;
	}
	public boolean equals(Object other) {
		Student s = (Student)other;
		if(s.getEid()==this.getEid()) return true;
		else return false;
	}
}
