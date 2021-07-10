package frontend;

import entity.Account;
import entity.Group;

public class Demo_Question10 {
	public static void main(String[] args) {
		Group group = new Group();
		
		Account acc = new Account();
		
		group.isInputAccount();
		System.out.println("Group ID: " + group.getId()
		+ ", Group name: " + group.getName() 
		+ acc.toString());
}
}
