package javaHomework2;

public class Student extends User {
	private String email;
	
	public Student() {
		
	}
	
	
	public Student(String name,String userName,String password ,String email) {
		super(name,userName,password);
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
}
