package staticdemo;

public class StaticDemo {
	String name ;      //instance variable
	int id ;   //instance variable
	static String cname;     //static variable
	
	static    //static block
	{
		cname="SRM";
	}
	
	public void display_studDetails(String name, int id )
	{
		this.name = name;
		this.id=id;
	
		
		System.out.println("Name of the student: " +name);
		System.out.println("Id of the student : " +id);
		System.out.println("College name of the student: " +cname);
		
		System.out.println("======================================");
		
	}
	
	
	public static void method()   //static method 
	{
		System.out.println("This is my method ..");
	}
	
	
	public static void main(String[] args) {
		
		StaticDemo s = new StaticDemo();
		s.display_studDetails("Oranium", 100);  //4   4 4
		
		s.display_studDetails("Tech", 101); //4    4   4
		
		s.display_studDetails("Chrompet", 102);//4    4  4
		
		System.out.println(StaticDemo.cname); 
		
		
	     StaticDemo.method();   //static method 
		
		
		
	}

}
