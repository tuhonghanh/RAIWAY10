package entity;
import java.util.Arrays;
import java.util.Date;

public class Account {

	private int 		id;
	private String 		userName;
	private String 		fullName;
	private String 		email;
	private Department 	department;
	private Position	position;
	private Date 		createDate;
	private Group[] 	groups;
	
	public String toString() {
		return "Account ID: " + this.id + ", Username: " + this.userName + 
				", Fullname: " + this.fullName + ", Email: " + this.email;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

		
	

}

