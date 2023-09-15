package practice;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s = "oraniumi";    // String literal --> SCP 
		
		String s1= new String ("oranium tech");   // new keyword , heap memory 
		String s2= "ORANIUM";    //string literal ---> scp 
		
		String s3 = "welcome to java programming"; 
		
		System.out.println(s.contains("ran"));   //true 
		
		System.out.println(s.equals(s1));    // false 
		
		System.out.println(s.toUpperCase());    //ORANIUM
		
		System.out.println(s2.toLowerCase());   //oranium
		
		System.out.println(s.indexOf("i"));     //4  // first occurence of character 
		 
		System.out.println(s.lastIndexOf("i"));   // 7 
		
		System.out.println(s.charAt(6));   // m   
		
		System.out.println(s.substring(1));   // raniumi
		
		System.out.println(s.substring(1,6));   // raniu
		
		System.out.println(s.startsWith("oran"));   // true 
		
		System.out.println(s.endsWith("good"));   // false 
		// s = "oraniumi" ;    
		   //{ 'o' , 'r' , 'a' , 'n' , 'i' , u, m }
		
		char[] carr= s.toCharArray();   //  breaking it as individual characters 
		
		System.out.println("Using normal for loop ");
		
		for ( int i =0 ; i < carr.length; i++)
		{
			System.out.println(carr[i]);
		}
		
		System.out.println();
		// {"welcome" , "to" ,"java " , "programming"}
		String[] split = s3.split(" ");
		
		for (int i =0 ; i < split.length; i++)
		{
			System.out.println(split[i]);
		}
		
		
		System.out.println(s.replace("u", "o"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
