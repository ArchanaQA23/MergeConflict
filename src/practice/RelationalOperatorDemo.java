package practice;

public class RelationalOperatorDemo {
	
	
	int a=20;
	int b=30;
	
	public void demoRelational()
	{
		
		System.out.println(a<b);//t
		System.out.println(a>b);//f
		System.out.println(a<=b);//f//20<=30
		System.out.println(a>=b);//f
		System.out.println(a!=b);//t
		System.out.println(a==b);//f
		
		
	}
	
	public static void main(String[] args) {
		
		
		RelationalOperatorDemo r = new RelationalOperatorDemo();
		r.demoRelational();
	}

}
