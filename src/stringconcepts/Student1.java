package stringconcepts;

import java.util.*;

public class Student1 {

	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(101, "pintu", 23));
		ar.add(new Student(121, "sinku", 15));
		ar.add(new Student(151, "aikku", 30));
		ar.add(new Student(161, "bimpl", 18));

		Collections.sort(ar, new Namecomparator());
		System.out.println("Student Sort by name");
		Iterator<Student> itr = ar.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + "," + st.name + "," + st.age);
		}
		System.out.println("Student Sort by age");
		Collections.sort(ar, new Agecomparator());
		Iterator<Student> itr1 = ar.iterator();
		while (itr1.hasNext()) {
			Student st1 = (Student) itr1.next();
			System.out.println(st1.rollno + "," + st1.name + "," + st1.age);
		}
	}
}
