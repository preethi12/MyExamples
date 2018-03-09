package stringconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("pintu");
		ar.add("tinku");
		ar.add("tikku");
		Iterator<String> itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
