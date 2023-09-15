package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet <Object>   h = new TreeSet<>();
		
		h.add("Oranium");
		h.add("Tech");
		h.add("chrompet");
		h.add("Oranium");
		h.add("Velachery");
		h.add("438u");
		
        //h.add(null);  
		
		System.out.println(h);
		
		System.out.println(h.contains("Tech"));  //true 
		
//		System.out.println(h.remove(true));
		
		System.out.println(h);
		
		int size = h.size();
		
		System.out.println(size);
		
	System.out.println("Using enhanced for loop ");
	
	for (Object k : h )
		
	{
		System.out.println(k);
	}
		Iterator<Object> i = h.iterator();
		System.out.println("Using iterator method ");
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		System.out.println("Using lambda expression");
		
	   h.forEach(k->System.out.println(k));
		
		
		
		
	}

}
