package collection;

import java.util.TreeMap;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeMap<Integer, String>   t = new TreeMap<>();
		
		
		t.put(100, "Ram");
		t.put(78, "Raju");
		t.put(134, "Ram");
		t.put(7, "Janu");
//		t.put(null, 90);
		
		System.out.println(t);
	}

}
