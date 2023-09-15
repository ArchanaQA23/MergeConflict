package constructor;

public class ConstructDemo extends Parent {
	
	
	int a;     //instance variable declaration
     public ConstructDemo(int a)   //Parametrized constructor 
     {
    	
    	 this();
    	this.a=a;
    	System.out.println("This is parametrized constructor ..");
     }
     
     public ConstructDemo()     //default constructor 
     {
    	 this("Oranium " , "Tech");
    	 System.out.println("This is default constructor");
     }
     
     public ConstructDemo(int b,int c)
     {
    	 super();
    	 System.out.println(b+c);
     }
     
     public ConstructDemo(String a , String b )
     {
    	 this(20,90);
    	 System.out.println(a+b);
     }
     
     
	public static void main(String[] args) {
		
		ConstructDemo c =new ConstructDemo(100); // calling my constructor 
//		new ConstructDemo();   
//		new ConstructDemo(10,20);
//		new ConstructDemo("oranium", " Tech");
		
	
		
		
		
	}

}
