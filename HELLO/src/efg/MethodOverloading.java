package efg;
//Method  Overloading and Method overriding.
public class MethodOverloading {
public static void main(String Args[])
{
	boys b1=new boys();
	girls g1 = new girls();
	g1.met();
	b1.met();
	//b1.met(100);
	//b1.met("Hello",200);
}
	
}
class boys{
void met() {
	System.out.println("met  method is of boys class");
}
void met(int  i) {
	System.out.println("met with one parameter\n"+ i);
}
void met(String s,int i) {
	System.out.println(s+"  "+i);
}
}
class girls extends boys{
	void met() {
		System.out.println("this is method of girls class");
	}
}