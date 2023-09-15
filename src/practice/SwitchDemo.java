package practice;
public class SwitchDemo {
	String proof = "ration card";
	public void checkSwitchCase()
	{
		switch(proof)
		{
		case "aadhar": 
			System.out.println(proof +" is a valid proof to open the bank account");
			break;
		case "pan" :
			System.out.println(proof +" is a valid proof to open the bank account");
			break;
		case "passport": 
			System.out.println(proof +" is a valid proof to open the bank account");
			break;
			default: 
				System.out.println("PRovide a valid proof ...!!! ");
		}
	}
	public static void main(String[] args) {
		SwitchDemo s = new SwitchDemo();
		s.checkSwitchCase();
	}
}