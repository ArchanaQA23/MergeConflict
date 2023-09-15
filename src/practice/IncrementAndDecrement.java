package practice;

public class IncrementAndDecrement {
	
	int x=10;
	
	public void demoOperator()
	{
		System.out.println(x);//10
		System.out.println(++x);//11
		System.out.println(x);//11
		System.out.println(x++);//11
		System.out.println(x);//12
		System.out.println(--x);//11
		System.out.println(x);//11
		System.out.println(x--);//11
		System.out.println(x);//10
		
		
	}
	public static void main(String[] args) {
		
		IncrementAndDecrement i = new IncrementAndDecrement();
		i.demoOperator();
	}

}
