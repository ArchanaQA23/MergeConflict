package practice;

public class Operators {
	
	int a =25, b =5;    //instance variables 
	
	public void arithmeticOps()    //instance method
	{
		System.out.println("****ARITHMETIC OPERATOR******");
		System.out.println(a+b);    // 30
		System.out.println(a-b);   //20
		System.out.println(a*b);    // 125
		System.out.println(a/b);    // 5
		System.out.println(a%b);   // 0
	}
	
	public void relationalOps()
	{
		System.out.println();   
		System.out.println("**RELATIONAL OPERATORS****");
		System.out.println(!(a<b));   // 25 <5  false 
		System.out.println(a>b);   // 25>5   true  
		System.out.println(a<=b);  // 25<=5 false
		System.out.println(a>=b);   // 25>=5  true
		System.out.println(!(a==b));   //25 ==5   false 
		System.out.println(!(a!=b));  // 25!=5     true 
	}
	
	public void incDecOps()
	{
		int a=10;     //lOCAL vaRIABLE 
		System.out.println("***INC/DEC OPERATORS***");
		System.out.println(a++); //10
		System.out.println(a);     //11
		System.out.println(++a);   //12
		System.out.println(a--);   //12
		System.out.println(a);       //11
		System.out.println(--a);    //10 
		
		
	}
	
	public void conditionalOps()
	
	{
		System.out.println((a>b) ? "A is greater than B" : "A is not greater than B " );
	}
	
	public void shortHandOps()
	{
		int a =20, b =80;
		
		
		
		a*=b;  // a= a-b 
		System.out.println(a);
		
		
	}
	
	public void concatOps()
	{
		String s ="Oranium"; 
		System.out.println(s + " Tech " );
	}
	
	public static void main(String args[])
	{
		Operators o = new Operators();  //oc
		
		o.arithmeticOps();   //mcuo
		o.relationalOps();  
		o.incDecOps();  
		o.conditionalOps();
		o.shortHandOps();
		o.concatOps();
	}

}
