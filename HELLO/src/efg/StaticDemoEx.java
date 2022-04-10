package efg;
class parent{
	int i=200;
}

public class StaticDemoEx extends parent {
 public StaticDemoEx() {
	 System.out.println("Cons called");
 }
 static {
	 System.out.println("COMMON STATIC BLOCK FOR  ALL");
 }
 public static void main (String args[]) {
	 int i=10;
	 StaticDemoEx.met(2);
	 StaticDemoEx.met22();
	 new StaticDemoEx().met2(3);
 }
 static void met(int i) {
	 new StaticDemoEx().i=20;
	 System.out.println(i);
	 i=10;
 }
 static void   met22()
{System.out.println("Static method 22 called");
	 }
 void met2(int i) {
	 System.out.println("Non static met called");
	 System.out.println(i);
	 System.out.println(this.i);
	 System.out.println(super.i);
	 
 }
}