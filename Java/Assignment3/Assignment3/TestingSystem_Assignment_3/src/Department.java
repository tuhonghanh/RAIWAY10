import java.util.Comparator;

public class Department implements Comparable<Department> {
	int id;
	String name;

	@Override
	public String toString() {
		return "id: " + id + ", name: " + name ;
	}


	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		Department department = (Department) obj;
		if (name.equals(department.name)) {
			return true;
		}

		return false;
	}
	

	@Override
	public int compareTo(Department other) {
		if (other == null) {
			return -1;
		}
		return name.compareTo(other.name);
	}
}
