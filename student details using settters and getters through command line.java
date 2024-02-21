package Studentcommand;

public class Student {

	private String name,branch;
	private long id;
	private char gender;
	static Student s=new Student();
	private Student() {
		
	}
	static Student getinstance() {
		return s;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
 String getBranch() {
		
		return branch;
	}
	 public long getId() {
	return id;
}
void setId(long id) {
	this.id = id;
}
char getGender() {
	return gender;
}
void setGender(char gender) {
	this.gender = gender;
}
	void setBranch(String branch) {
		this.branch = branch;
	}
	public String toString() {
		return "name:" +getName() + ", "
	+ "branch=" + getBranch() + ", id=" + getName() + ", gender=" + getGender();
	}
	 
	


 }
