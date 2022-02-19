package abc;

public class AccessDemo {
	private int pri;
	int nomod ;
	protected int pro;
	public int pub;
	
	void met() {
		System.out.println(pri);	
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
		}
}
 class Apple extends AccessDemo{
	void met() {
		System.out.println(pri);	
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
		}
 }
 class ball {
	 
	
		void met() {
			 AccessDemo obj=new AccessDemo();
			System.out.println(obj.pri);	
			System.out.println(obj.nomod);
			System.out.println(obj.pro);
			System.out.println(obj.pub);
			}
	 }
