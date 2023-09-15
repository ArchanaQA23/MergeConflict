package practice;

public class MethodDemo {
	
	int a =90, b =89;   //global variables
	public int  add (int a , int b)   //MN without   parameters with return type 
	{
		
		return a+b ;
	}
	
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		int sum = m.add(100,100);
		
		System.out.println(sum);
		
	}

}
