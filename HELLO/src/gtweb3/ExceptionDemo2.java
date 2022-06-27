package gtweb3;

public class ExceptionDemo2 {
public static void main(String[] args) {
	a1 obj=new a1();
	System.out.println("Before Exception");
	try {
		obj.checkage(18);
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("After Exception");
	
}
}
class a1{
	public void checkage(int age) throws ArithmeticException{
		if (age<20) {
			throw new ArithmeticException ("access denied you must be atleast 20 yrs old");
		}
		else
			System.out.println("Access Granted");
	}
}
