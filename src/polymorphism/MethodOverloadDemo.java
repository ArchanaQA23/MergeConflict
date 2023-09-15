package polymorphism;
public class MethodOverloadDemo {
	public void add ()
	{
		int a =90, b =100;
		System.out.println(a+b);
	}
	public void add (int a , int b)
	{
		System.out.println(a+b);
	}
	public void add(int a, double b)
	{
		System.out.println(a+b);
	}
	public double add(double a, int  b)
	{
		return a+b;
	}
	public double add(double a , int b, int c)
	{
		return a+b+c;   
	}
	public static void main(String[] args) {
		MethodOverloadDemo m = new MethodOverloadDemo();
		m.add();
		m.add(89,90);
		m.add(10, 100.0);
		double add = m.add(10.0, 10);
		System.out.println(add);
		double add2 = m.add(100.0, 89,89);
		System.out.println(add2);
	}
}