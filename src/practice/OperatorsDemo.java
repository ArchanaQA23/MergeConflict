package practice;

public class OperatorsDemo {
	
	
	int a=10;// Gloabl level variables
	int b=20;
	
	public void addNumbers()// no arguments/ no parameters
	{
		
		System.out.println(a+b);
	}
	
	public void subNumbers()
	{
		
		System.out.println(a-b);
	}
	
	public void mulNumbers()
	{
		
		System.out.println(a*b);
	}
	public void divNumber()
	{
		
		System.out.println(a/b);
	}
	public void modNumber()
	{
		
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		
		OperatorsDemo o = new OperatorsDemo();

		o.addNumbers();
		o.subNumbers();
		o.mulNumbers();
		o.divNumber();
		o.modNumber();
	}
	

}
