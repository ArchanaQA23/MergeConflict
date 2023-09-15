package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		LinkedHashMap <String, Integer>   h = new LinkedHashMap<>();
		
		h.put("English", 90);  //PAir of entry 
		h.put("Computer", 91);
		h.put("Math", 100);
		h.put("Computer", 89);
		h.put("Science", 90);
		
		
		System.out.println(h);
		
		System.out.println("Iterate only keyys ");
		Set<String> k = h.keySet();
		
		for (String a: k )
		{
			System.out.println(a);
		}
		
		System.out.println("Iterate only values ");
		
		Collection<Integer> values = h.values();
		
		for(Integer i : values)
		{
			System.out.println(i);
		}
		
		
		System.out.println("Using entries ..");
		
		Set<Entry<String, Integer>> entrySet = h.entrySet();
		
		
		for (Entry<String, Integer> a: entrySet)  
		{
			System.out.println(a.getKey() + "=="  +a.getValue());
		}
		
	}

}
