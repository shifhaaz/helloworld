package ch6;

public class variale2demo {

	public static void main(String[] args) {
	A obj = new A();
	A obj2 = new A();
	
	obj.s=100;
	obj.ss=200;
	obj.s=300;
	
	obj2.s=8;
	obj2.ss=9;
	 obj.met(1);
	 obj.met(0);
	 obj.met2(100000L);
	System.out.println(obj.s+":"+obj.ss);
	System.out.println(obj2.s+":"+obj2.ss);
	}
}
class  A{
	int s;//instance scope/variable
	static int ss;//class variable
	
	public void met(int n)//n is local variable
	{
		System.out.println(n);
	}
	public void met2(long ll)//ll is  local variable
	{
		System.out.println(ll);
	}
}