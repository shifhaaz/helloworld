package abc;
 
 public class Staticdemo {
public Staticdemo() {
	System.out.println("cons called");
	
}
static {
	System.out.println("this is static block");
}
public static void met()
{
	System.out.println("static method gets called");
}
public void met1()
{
	System.out.println("this is non static method");
}
	public static void main(String[] args) {
		Staticdemo obj  =new Staticdemo();
		Staticdemo.met();
		obj.met1();
	}

}
