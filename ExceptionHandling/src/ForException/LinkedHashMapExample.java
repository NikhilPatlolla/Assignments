package ForException;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap hm = new LinkedHashMap();
		hm.put(10, "sachin");
		hm.put(7, "dhoni");
		hm.put(18, "kohli");
		hm.put(45, "rohith");
		System.out.println(hm);// hm.toString() will be called
		System.out.println();

		Set s = hm.keySet();// To get the keys from Map
		System.out.println(s);
		System.out.println(s.getClass().getName());
		System.out.println();
		Collection c = hm.values();// To get the values from Map
		System.out.println(c);
		System.out.println(c.getClass().getName());
		System.out.println();
		Set mapData = hm.entrySet();// To get the K,V from Map as Set
		System.out.println(mapData);
		System.out.println(mapData.getClass().getName());
		System.out.println();
		Iterator itr = mapData.iterator();
		while (itr.hasNext()) {
			Map.Entry data = (Map.Entry) itr.next();
			System.out.println(data.getKey() + ": " + data.getValue());
			if (data.getKey().equals(10)) {
				data.setValue("SRT");
			}
		}
		System.out.println();
		System.out.println(hm);
	}
}
