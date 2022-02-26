package ch6;

public class consdemo {
	consdemo()
	{
		System.out.println("Cons called......");
	}
	String s;
	
	consdemo(String s)
	{
		System.out.println("cons called........."+ s);
		this.s=s;
		System.out.println("cons called"+s);
	}

	public static void main(String[] args) {
	consdemo obj=new consdemo();	
	consdemo obj2=new consdemo("hello");	
	
	new consdemo();//new keyword used to call constructor

	}

}
