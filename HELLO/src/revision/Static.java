package revision;

public class Static {
	
	public Static() {//nON DEFAULT cONSTRUCTOR.
		System.out.println("constructor called");
	}
	static {
		System.out.println("this is static block so this gets exceuted first");
	}
	static void met(int i)//Static method
	{
		System.out.println("this is static method "+i);
		
	}
	void met1() {//Normal method
		System.out.println("this is normal method");
	}

	public static void main(String[] args) {
		Static.met(101);//for static syntax is classname.methodname();
		new Static().met1();//here constructor get called first because we used newkeyword ,then it will call non static method.
		

	}

}
