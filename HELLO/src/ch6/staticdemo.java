package ch6;

public class staticdemo {
	public staticdemo() {
		System.out.println ("cons called....");
		}
	static {
		System.out.println("this is common block ");
	}

public static void main(String args[]) {
	new staticdemo().met2(100);
	staticdemo.met(10);
	staticdemo.met22();
	
}
static void met(int i)
{
	System.out.println("static met is called");
}
static void met22() {
	System.out.println("static met22 is called");
}
void met2(int i) {
	System.out.println(" Non static met is called");
}
}
