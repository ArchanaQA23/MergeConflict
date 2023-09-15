package practice;

public class NestedIfDemo {
     
	int num=4;
	
	public void checkNumbers()
	{
		if(num%2==0)   
		{
			System.out.println(num + " is completely divisble by 2");
			if(num%4==0)
			{
				
				System.out.println(num + " is completely divisble by 4");
				if(num%8==0)
				{
					System.out.println(num + " is completely divisble by 8");
					if(num%16==0)
					{
						System.out.println(num + " is completely divisble by 16");
					}
					else
					{
						System.out.println(num + " is not  completely divisble by 16");
					}
				}else
				{
					System.out.println(num + " is not completely divisble by 8");
				}
			}
			else
			{
				System.out.println(num + " is not completely divisble by 4");
			}
		}else
		{
			System.out.println(num + " is not completely divisble by 2");
		}
	}
	
	
	public static void main(String[] args) {
		NestedIfDemo n = new NestedIfDemo();
		n
		
		
		
		
		
		
		
		
		
		
		
		
		
		.checkNumbers();
	}
}
