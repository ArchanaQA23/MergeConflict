package practice;

public class JumpingDemo {
	
	
	public void checkJump()
	{
		for (int num=1 ; num<=10; num++)  
		{
			if(num==5 ||num==8 ||num==2)    
			{
				continue;
			}
			System.out.println(num);   
		}
		
	}
	
	
	public static void main(String args[])
	{
		JumpingDemo j = new JumpingDemo();
		j.checkJump();    //mcuo
		
	}

}
