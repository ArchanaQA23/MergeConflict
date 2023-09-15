package practice;

public final class Sample {
	
	final int a =100;     //instance variable
	
	public final  void display()
	{
		System.out.println("This is my display method..");
	}
	
	
	public static void main(String[] args) {
		
		
		Sample s = new Sample();
		
		s.display();
		
		System.out.println(s.a);
		
//		s.a =200;
//		
		
		
		
		
	}

}
