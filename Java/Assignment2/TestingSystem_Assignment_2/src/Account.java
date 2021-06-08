import java.util.Arrays;
import java.util.Date;

public class Account {

	int 		id;
	String 		userName;
	String 		fullName;
	String 		email;
	Department 	department;
	Position	position;
	Date 		createDate;
	Group[] 	groups;
	
	@Override
	public String toString() {
		return Arrays.toString(groups);
	}
	
	public String toStringQ10() {
		return "Email : " + email + "\nFull name: " + fullName + "\nDeparment: " + department.name + "\n";
	}
	public String toStringQ13() {
		return "ID: " + id + "\nUser name: " + userName + "\nFull name: " + fullName + "\n";
	}
}

