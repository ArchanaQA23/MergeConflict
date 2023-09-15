package practice;

public class LogicalOperator {
	
	
	int a=40;
	int b=50;
	
	public void demoLogical()
	{
		
		//and operator
		
		//a=40, b=50
		
		System.out.println((a<b)&&((a>b)));//t&&f--f
		System.out.println((a!=b)&&(a==b));//t&&f-->f
		
		//or operator
		
		System.out.println((a==b)||(a>=b));//f||f--> f
		System.out.println((a!=b)||(a>b));//t||f-->t
	
		//not operator
		
		System.out.println(!(a!=b));//t-->f
	
	}
	
	public static void main(String[] args) {
		
		
		LogicalOperator l = new LogicalOperator();
		l.demoLogical();
		
	}

}
