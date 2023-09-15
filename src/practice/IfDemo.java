package practice;

public class IfDemo {
	
	int age=12; 
	
	
	public void checkAge()     //instance method 
	{
	
		if (age>=18)     // 12>=18 
		{

		System.out.println( age +  " is eligible to vote ");

		}
		else 
		{
			System.out.println(age + " is not eligible to vote");
		}
	}
	
	
	public static void main(String[] args) 
	{
		IfDemo i = new IfDemo();  
		
		i.checkAge();
	}

}
