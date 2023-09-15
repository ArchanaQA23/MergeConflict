package practice;

public class Sumof10Nos {
	
	public void printNums()
	{
		int mind =0; 
		
		for(int num=1;num<=10 ; num++)    //num=5    5<=10
		{
			mind = mind+num;    // 15  = 10+5   mind = 10
			
		}
		
		System.out.println(mind);
	}
	
	
	public static void main(String[] args) {
		Sumof10Nos s = new Sumof10Nos();
		s.printNums();
	}

}
