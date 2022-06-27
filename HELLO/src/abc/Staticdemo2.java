package abc;

public class Staticdemo2 {
public static void main(String[] args) {
outer.innerstatic ins = new outer.innerstatic();
outer.innernonstatic in=new outer().new innernonstatic();
ins.met();
in.met();
}	
}
class outer{
	void outmet()
	{
		System.out.println("non static outer methd called");
	}
	static void met1()
	{
		System.out.println("static outer method called");
	}
	static class innerstatic{
		public void met()
		{
			System.out.println("static inner class method called");
			outer.met1();
			//we cannot call non static method in static class.
		}
	}
		class innernonstatic{
			public  void met() {
				System.out.println("inner non static class called");
				outer.met1();
				outmet();//we can call static n non static method in non static class
			}
		}
}