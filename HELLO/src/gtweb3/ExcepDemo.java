package gtweb3;

public class ExcepDemo {
public static void main(String[] args) {
	System.out.println("Before Exception");
	try {
		int i= 1/0;
	}catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception occured"+ e);
	}
	catch(NumberFormatException e2) {
		System.out.println(e2);
	}
	catch(Exception e3) {//this exception is the parent class of all the exception
		System.out.println("unknown Exception"+e3);
	}
	finally {
		System.out.println("this gets always executed, exception handled or not");
	}
	System.out.println("After Exception");

	
}
}
