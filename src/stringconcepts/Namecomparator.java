package stringconcepts;

import java.util.Comparator;

public class Namecomparator implements Comparator<Object>
{
	 
		public int compare(Object obj1, Object obj2)
		{
		Student s1=(Student) obj1;
		Student s2=(Student) obj2;
		
		
		return s1.name.compareTo (s2.name);
		}
	}


