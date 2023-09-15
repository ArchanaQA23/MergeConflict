package encapsulation;

public class MyHouse {
	
	public static void main(String[] args) {
		FriendHouse f =new FriendHouse();
		
//		System.out.println(f.lockerAmt);   // 5000 get 
//		
//		f.lockerAmt=2000;         //set 
//		
//		System.out.println(f.lockerAmt);    // 2000
		
		
		int lockerAmt = f.getLockerAmt();    //get 
		
		System.out.println(lockerAmt);
		
		f.setLockerAmt(2000);    //set 
		
		int lockerAmt2 = f.getLockerAmt();
		System.out.println(lockerAmt2);
		
	}

}
