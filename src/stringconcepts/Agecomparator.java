package stringconcepts;

import java.util.Comparator;

public class Agecomparator implements Comparator<Object> {

	public int compare(Object obj1, Object obj2) {
		Student s1 = (Student) obj1;
		Student s2 = (Student) obj2;
		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age < s2.age) {
			return -1;
		} else {
			return 1;
		}

	}
}
