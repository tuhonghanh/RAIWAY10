import java.util.Date;

public class Account {
	byte			id;
	String			email;
	String			userName;
	String			fullName;
	Department		department;
	Position		position;
	Date			createDate;
	Group[]			groups;
	
public String toString() {
	return "Email: " + email + "\nName: " + fullName + "\nDepartment: " + department.name + "\n";
	}
}