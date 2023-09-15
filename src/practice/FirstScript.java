package practice;

public class FirstScript {

    int a= 100 ;     //global variable or  instance variable 
	
	public void displayNumber()   //instance method 
	{
		int b=100;            //local variable 
	System.out.println(a+b);
		
	}
	
	public void display()
	{
		System.out.println(a);
	}
	
	public static void main(String args[])  
	{ 
		FirstScript f = new FirstScript();   //instance 
        f.displayNumber();                  //mcuo
        f.display();                      //mcuo
        
	}
}
