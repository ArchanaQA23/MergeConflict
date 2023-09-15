package polymorphism;
public class Son extends Father {
	public void ktmBike()
	{
		System.out.println("This is son's ktm bike ");
	}
	public void audiCar()
	{
		System.out.println("This is son's audi car ");
	}
	public static void main(String[] args) {
		Son s=new Son();
		s.ktmBike();//son 
		s.audiCar();  //son 
		Father f =new Father();
		f.audiCar();  //father 
		f.bike();  //father 
		Father f1=new Son();  //upcasting 
		f1.audiCar();     // son
		//Son s1=new Father();  //Invalid 
	}
}