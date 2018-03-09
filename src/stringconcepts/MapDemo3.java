package stringconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class MapDemo3 {

	public static void main(String[] args) {
	TreeMap<Integer, String> hs=new TreeMap<Integer, String>();
	hs.put(9,"pintu");
	hs.put(1,"tinku");
	hs.put(3,"apple");
	hs.put(8,"beetroot");
	hs.put(4, null);
	hs.put(2, null);
	for(Map.Entry<Integer,String> entry:hs.entrySet())
	{
		
		System.out.println(entry.getKey()+","+entry.getValue());
	}
	//Set<Entry<Integer, String>> s=hs.entrySet();
	//Iterator<Entry<Integer, String>> itr=s.iterator();
	//while(itr.hasNext())
	//{
	//Map.Entry entry=(Map.Entry)itr.next();
	//System.out.println(entry.getKey()+","+entry.getValue());
	//}
	}

}
