package practice;

public class LoopDemo {
	
	public void printNums()
	{
		
	for(int num=1; num<=15; num++)    
	{
		
		System.out.println("5x" +num +"=" + num*5);
	}
	}
	
	public static void main(String[] args) {
		LoopDemo l = new LoopDemo();
		l.printNums();
		
}
}
