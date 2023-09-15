package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		LinkedList <Object> a = new LinkedList<>();  
		
		a.add("oranium");
		a.add(231);
		a.add(90.8);
		a.add(true);
		a.add(null);
		a.add("oranium");
		a.add('t');
		
		System.out.println(a);
		
		System.out.println(a.indexOf(true));  //3 
		System.out.println(a.lastIndexOf("oranium"));  //5 
		
		System.out.println(a.get(6));   // t 
		
		System.out.println(a.size());  //7 
		
		System.out.println(a.contains(true));   //true 
		
		System.out.println(a.remove(null));  // [oranium, 231, 90.8, true, oranium, t]
		
		System.out.println(a);
		
		System.out.println("Using normal  for loop ");
		
		for (int i=a.size()-1; i >=0; i--)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("Using enhanced for loop ");
		
		for (Object k : a)
		{
			System.out.println(k);
		}
		
		System.out.println("Using iterator method ");
		
		Iterator<Object> i = a.iterator();
		
		while(i.hasNext())
		{
		
		System.out.println(i.next());
		
		}
		
		System.out.println("Using lambda expression");
		
		a.forEach(k -> System.out.println(k));
		
		
		
	}

}
