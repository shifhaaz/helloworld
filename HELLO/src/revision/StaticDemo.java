package revision;

public class StaticDemo {
	int i=10;
public StaticDemo() {
	System.out.println("this is constructor called");
}
	static{
		System.out.println("this is common block which gets exceuted first");
	}
	static void met(int i) {
		
		System.out.println("this is static method");
	}
	static void met(int i,String s) {
		System.out.println("this is static method overloading"+i+"/t"+s);
	}
	public void met1(int i) {//
		this.i=i;
		System.out.println("this is normal method");
	}
	public static void main(String[] args) {
		StaticDemo obj=new StaticDemo();
		StaticDemo.met(101);
		StaticDemo.met(1000, "Helo");
		new StaticDemo().met1(10);//for non static method.
	}
}
