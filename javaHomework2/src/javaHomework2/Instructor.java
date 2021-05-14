package javaHomework2;

public class Instructor extends User{
	
	private String department;
	
	
	public Instructor() {
		
	}
	
	public Instructor(String name,String userName,String password,String department) {
		super(name,userName,password);
		this.department=department;
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
