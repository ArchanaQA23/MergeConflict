package practice;

public class Equals {
	
	public int a =90;    
	
	public static void main(String[] args) {
		
		String s ="oranium";   // String literal 
		
		String s1 = new String  ( "oranium");  //heap memory 
	
		
		System.out.println(s.equals(s1));   // true 
		
		System.out.println(s==s1);   // false
		
		

	}

}
