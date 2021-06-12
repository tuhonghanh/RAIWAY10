import java.time.LocalDate;

public class Account {
	byte			id;
	String			email;
	String			userName;
	String			fullName;
	Department		department;
	Position		position;
	LocalDate		createDate;
	Group[]			groups;
	
public String toString() {
	return "Email: " + email + "\nName: " + fullName + "\nDepartment: " + department.name + "\n";
	}
}