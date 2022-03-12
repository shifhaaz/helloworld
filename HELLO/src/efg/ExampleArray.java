package efg;

public class ExampleArray {

	public static void main(String[] args) {
		a1 obj=new a1();
		int array[] = {12,45,32,65};
		int copyarray[]=new int [4];
		
		System.arraycopy(array, 0, copyarray, 0, 4);
		System.out.println("before coppying"+array[1]);
		obj.met(copyarray);
		System.out.println("after coppying "+array[1]);
		System.out.println(" copy Array "+ copyarray[1]);
	
	}
}
class a1{
	public void met(int a[]) 
	{
		a[1]=100;
	}
}