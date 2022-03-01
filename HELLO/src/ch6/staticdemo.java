package ch6;

 class parent{
	int i = 33;
}

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
	int i = 3;
}
static void met(int i)
{
	System.out.println("static met is called"+i);
	new staticdemo().i=200;
	i = 40;
}
static void met22() {
	System.out.println("static met22 is called");
}
void met2(int i) {
	System.out.println(" Non static met is called"+i);
	System.out.println(super.i);
}
}
