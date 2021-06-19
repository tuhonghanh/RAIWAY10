package frontend;

import entity.Department;
import entity.Position;
import entity.ScannerUtils;

public class Demo_Question9 {
	public static void main(String[] args) {
		Department dep = new Department();
		
		Position pos = new Position();
		
		System.out.println("Department ID: " + dep.getID() + ", Department name: " + dep.getName()
		                   + ", Position ID: " + pos.getId() + ", Position name: " + pos.getName());
}
}
