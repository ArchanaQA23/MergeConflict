package abstraction;

public class Son implements Father, Mother{
	
	public void ktmBike()
	{
		System.out.println("This is son's ktm  bike");
	}

	
	public void fortunerCar() {
		System.out.println("This is son's fortuner car ..");
		
	}

	
	public void goldWatch() {
		
		System.out.println("This is son's gold watch..");
	}
	
	@Override
	public void goldJewels() {
		System.out.println("This is son's gold jewls ");
		
	}
	
	
	
	public static void main(String[] args) {
		Son s = new Son();
		s.ktmBike();  //son
		s.fortunerCar();   //son 
		s.goldWatch();   //son 
		
	   System.out.println(s.light);   
	   
	   s.goldJewels();   //son 
	   
	  // s.light= 683448; we cannot modify the static constant 
	   
	 //   Father f =new Father();  // we cannot create object for interface 
	   
	//   Mother m =new Mother();    // " " 
	   
	}



	
	
	

}
