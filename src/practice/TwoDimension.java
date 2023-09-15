package practice;

public class TwoDimension {
	
	int tarr[][]= { {10,20,30} , 
			        {40,50,60 ,70,80}, 
			        {70,80,90}
	};   

	public void checkTwoD()
	{
		//Accessing the elements 
		System.out.println(tarr[0][2]);   //30
		System.out.println(tarr[2][2]);   //90
		
		// Number of rows 
		System.out.println(tarr.length);  // 3 
		//Number of columns 
		System.out.println(tarr[1].length);   //5
		
		
		//Iterating the elements using for loop 
		for(int row =tarr.length-1; row>=0; row--)   // row =1   1<3
		{
			for (int col=0; col<tarr[row].length; col++)  //0   0<5
			{
				System.out.print(tarr[row][col]+" ");  //tarr[1][0]
				                                       //10 20 30 
				                                      // 40 50 60  70 80
			}
			System.out.println();
		}
		
		System.out.println("Using enhanced for loop ");
		
		// {10,20,30} 
		for (int[] k : tarr)
		{
			for(int a:k)
			{
				System.out.print(a +" ");
			}
			System.out.println();
			
		}
		
		
		
		
	}
	

		
		
		
		

	
	public static void main(String[] args) {
		TwoDimension t = new TwoDimension();
		t.checkTwoD();
		
	}
}
