package stringconcepts;

import java.util.*;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		//ArrayList<String>=new ArrayList<String>();
		
		HashSet<String> hs = new HashSet<String>();
		//LinkedHashSet<String> hs = new LinkedHashSet<String>();
		//TreeSet<String> hs = new TreeSet<String>();
		hs.add("pintu");
		hs.add("tinku");
		hs.add("tikku");
		
		//hs.add(null);
		//Collections.sort(hs);
		TreeSet<String> hs1 = new TreeSet<String>(hs);
		
		Iterator<String> itr = hs1.iterator();
		while (itr.hasNext()) {
		
			System.out.println(itr.next());
			hs1.remove("tikku");
		}
	}

}
