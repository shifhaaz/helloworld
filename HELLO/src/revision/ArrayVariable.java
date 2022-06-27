package revision;

public class ArrayVariable {

	public static void main(String[] args) {
	int array[]= {1,2,3,4,5,6,7,8,9};
	ArrayVariable obj=new ArrayVariable();
	//obj.met(new int [] {23,4,56,45,65,224,64});//non reuseable
	
	int copyarr[]=new int[3];
	System.arraycopy(array, 0, copyarr, 0, 3);//5 parameters the first parameter is array name which you want to copy in other
	//2.position of array
	//3.copy array variable name
	//4.first index of copy array
	//5.destination of copy array
	
	System.out.println("before passing:"+array[2]);
	obj.met(copyarr);
	System.out.println("before passing:"+copyarr[2]);
	}
	
	void met(int a[]) {
		a[2]=15;
		
	}

}
