package revision;

public class Outer {
	
 public static void met1() {
	 System.out.println("this is static method of outer class");
	
 }
 public void met2() {
	 System.out.println("this is non static method of outer class");
 }
  static class InnerStatic{
	 void met3() {
		 System.out.println("this is inner class method");
		met1();
		//met2();non static cannot be called here.
		// met4();static class only accepts static methods
	 }
 }
 class InnernonStatic{
	 void met4()
	 {
		 System.out.println("this is met of inner non static class");
		met1();
		met2();
	 }
 }
 public static void main(String[] args) {
	Outer.InnerStatic objs = new Outer.InnerStatic();
	Outer.InnernonStatic objnon=new Outer().new InnernonStatic();//for calling non static inner class
	objs.met3();
	objnon.met4();
	}
}
