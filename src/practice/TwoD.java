package practice;

public class TwoD {
	
	int tarr[][]= {
			
			{10,20,30},   
			{40,50,60,90}, 
			{70,80,90} 
	};
	
	public void checkTwoD()
	{
		//Access the elements 
		
		System.out.println(tarr[0][1]);
		
		System.out.println(tarr[1][2]);
		
		System.out.println(tarr.length);     // Number of rows 3 
		System.out.println(tarr[1].length);   // Number of columns for the respective row 
		
		for (int row =0 ; row<tarr.length; row++)    // 1   1<3 
		{
			for(int col=0; col<tarr[row].length; col++)    // 0   0<4 
			{
				System.out.print(tarr[row][col]+"  ");   // 10  20  30  
				                                         //
			}
			System.out.println();
		}
		
		
		System.out.println("Using enhanced for loop ");
		
		for (int[] a : tarr)
		{
			for (int k: a)
			{
				System.out.print(k +"  " );
			}
			
			System.out.println();
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		TwoD t = new TwoD();
		t.checkTwoD();
		
	}

}
