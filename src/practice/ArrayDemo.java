package practice;

public class ArrayDemo {
	
	int arr[]= {10,20,30,40,50,60};  //collection of individual elemnts 
	
	public void checkArray()
	{
		
		
		//Accessing the elements 
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[5]);
		
		
		//Number of elements present in an array
		
		System.out.println(arr.length);   //6
		
		//ITerate the elements using for loop 
		for(int i=arr.length-1; i>=2;i--)    //i=6   6<6
		{
			System.out.println(arr[i]);   // arr[5]
		}
		
		
		System.out.println("Using enhance for loop ");
		//Unidirectional loop or enhanced for loop or advanced loop 
		
		for(int a:arr)
		{
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		ArrayDemo a = new ArrayDemo();
		a.checkArray();
	}

}
