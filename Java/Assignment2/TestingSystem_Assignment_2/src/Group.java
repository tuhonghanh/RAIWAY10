
import java.util.Date;

public class Group {
	int			id;
	String		name;
	byte 		creatorID;
	Date		createDate;
	Account[] 	accounts;
	
	@Override
	public String toString() {
		return name;
	}
	
}
