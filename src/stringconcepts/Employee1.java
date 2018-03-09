package stringconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "pintu", 2056);
		Employee emp2 = new Employee(102, "Tinku", 2058);
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(emp1);
		ar.add(emp2);

		Iterator<Employee> itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
