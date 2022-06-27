package revision;

import java.lang.reflect.Array;

import javax.print.attribute.IntegerSyntax;

public class Methodoverloading {

	public static void main(String[] args) {
	Methodoverloading obj=new Methodoverloading();
	obj.met();
	obj.met(100,12);
	met("helllo", 99);
	int array[]={34,67,87,34};
	obj.varagrs(array);	
	
	System.out.println(obj.met(10));
	}
	void met()
	{
		System.out.println("this is met method called");
	}
	void met(int i,int b) {
		System.out.println("this is another method with one parameter"+i+" "+b);
	}
	public static void met(String s, int a)
	{
		System.out.println("this is met method with 2parammeters...."+s+""+a);
		
	}
	String met(int a) {
		
		return "hello";}
 void varagrs(int...a)
 {
	 for (int i=0;i<a.length;i++) {
		 System.out.println(a[i]);
	 }
 }
 
}
