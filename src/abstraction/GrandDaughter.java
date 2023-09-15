package abstraction;

public class GrandDaughter extends GrandFather {
	
	public void scootyPep()
	{
		System.out.println("This is grand daughter's scootypep ");
	}

	
	public void ambassadorCar() {
		System.out.println("This is grand daughter's ambassador car ");
		
	}
	
	public static void main(String[] args) {
		GrandDaughter g= new GrandDaughter();
		g.ambassadorCar();
		g.scootyPep();   
		
		//GrandFather g1=new GrandFather();
		
		
		
	}
	

}
