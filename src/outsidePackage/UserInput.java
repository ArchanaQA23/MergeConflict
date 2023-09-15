package outsidePackage;

import java.util.Scanner;

public class UserInput {
	
public static void main(String[] args) {
	
	System.out.println("Enter the two numbers: ");
	
	Scanner sc = new Scanner (System.in);  // Getting the input from the user 
	
	int num1 = sc.nextInt();  //100
	
	int num2 = sc.nextInt();  //200
	

	
	System.out.println(num1+num2);
	
	
	
	
	
}

}
