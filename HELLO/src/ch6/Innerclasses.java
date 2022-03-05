package ch6;

public class Innerclasses {

	public static void main(String[] args) {
		outer.innernonstatic in = new outer().new innernonstatic();
		in.met();
			
		outer.innerstatic ins = new outer.innerstatic();
		ins.met();
			

	}

}
class outer{
	void outermet() {
		System.out.println("outer class non static method called....");
		
	}
	static void met2() {
		System.out.println("outer class static method called....");
	}
	 static class  innerstatic{
		 public void met() {
			 System.out.println("static method called....");	
			 met2();
		 }
	 }
	 class innernonstatic{
		 public void met() {
			 System.out.println("Non static method called....");	
			 met2();
			 met();
			 
		 }
		 
	 }
}
