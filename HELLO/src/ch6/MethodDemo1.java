package ch6;

public class MethodDemo1 {

	public static void main(String[] args) {
		MethodDemo1 obj = new MethodDemo1();
		obj.met();
		obj.met(10);
		obj.met(100,"hi");
		obj.met("hi",200);
		obj.call(834759479794793L);
		
		System.out.println("\n***********************\n");
		obj.varmet(10,20,30,40,50,60,60,80);
		int a[]= {12,34,54,21,43,66,43};
		obj.out(a);
		
	}
	
	void met()
	{
		System.out.println("met method called");
		
	}
void met(int a) {
	System.out.println("met method called" + a);
}
void  met(int n, String s) {
	System.out.println(n+ "  :  "   +s  );
}

void met(String s ,int n) {
	System.out.println(s+"  :   "+n);

}
void call (Long a) {
	System.out.println("Longgggggggggggggg"+ a);
}
void varmet(int... a) {
	System.out.println("Variable Arg"+  
a);

}
void out(int a[]) {
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+ "\t");
	}
	System.out.println();

for (int n:a)
{
	System.out.print(n+ "\t");
}
}
}
