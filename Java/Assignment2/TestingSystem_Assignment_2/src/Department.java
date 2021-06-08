
public class Department {
	short 	id;
	String  name;
	
	public String printDeparmentQ11(int position) {
		String t = "Thong tin deparment " + (position) +" la: \n" + "id : " + id + "\nName: " + name +"\n";
		return t;
	}
	
	public String toString() {
		return "ID: " + id + "\nName: " + name + "\n";
	}
}
