package polymorphism;

public class Father {
	
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.display();  //Accessible within the package 
		
		System.out.println(d.c);    //Accessible within the package 
		}
	
	
}
