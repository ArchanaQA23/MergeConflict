package inheritance;

public class Son  extends Father
{
	
	public void audiCar()
	{
		System.out.println("This is son's audi car ");
	}
	
	
	public void r15()
	{
		System.out.println("This is son's r15");
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.audiCar();   // son 
		s.r15();    //son 
		s.fortunerCar();    // father 
		s.hondabike();    //father 
		
		System.out.println(s.wheels);
		
	
		
		Father f = new Father();
		f.fortunerCar();
		f.hondabike();  
		
		Daughter d = new Daughter();
		d.scootyPep(); //daughter 
		d.hondabike();
		d.fortunerCar();
		System.out.println(d.wheels);
		  
		
	}

}
