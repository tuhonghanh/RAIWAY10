
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise5 {
	public static void main(String[] args) {

		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Waiting room";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Boss of director";

		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Sale";

		Department department5 = new Department();
		department5.id = 5;
		department5.name = "Accounting";
		Department[] departments = {department1, department2, department3, department4, department5};

		// Question 1:
		System.out.println("Question 1: In ra thông tin của phòng ban thứ 1");
		System.out.println(department1.toString());

		// Question 2:
		System.out.println("Question 2: In ra thông tin của tất cả phòng ban");
		for (Department department : departments) {
			System.out.println(department.toString());
		}

		// Question 3:
		System.out.println("Question 3: In ra địa chỉ của phòng ban thứ 1");
		System.out.println(department1.hashCode());

		// Question 4:
		System.out.println("Question 4: Kiểm tra xem phòng ban thứ 1 có tên là \"Phòng A\" không");
		if (department1.name.equals("Phòng A")) {
			System.out.println("Phòng ban thứ 1 tên là Phòng A");
		} else {
			System.out.println("Phòng ban thứ 1 không phải tên là Phòng A");
		}
	
		// Question 5: 
		System.out.println("Question 5:  So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không");
		if (department1.equals(department2)) {
			System.out.println("Có bằng nhau");
		} else {
			System.out.println("Không bằng nhau");
		}
	
		// Question 6:
		System.out.println("Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban theo thứ tự tăng dần theo tên"); 
		Collections.sort(Arrays.asList(departments));
		for (Department department : departments) {
			System.out.println(department);
		}
	}

		// Question 7:
}
