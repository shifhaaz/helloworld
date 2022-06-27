package abc;


public class TwoD {
	  public static void main(String[] args) {
		  TwoD obj=new TwoD();
		  obj.met(new int[] {1,2,3,4,5,6,7,8});//anonymous  array.
	    int[][] myNumbers = { {1, 2, 3, 4,5}, {4,6,6,6} };
	    
	    for (int i = 0; i < myNumbers.length; i++) 
	    	{
	      for(int j = 0; j <myNumbers[i].length; j++)
	    	  {
	        System.out.print(myNumbers[i][j]+"  "+"  ");
	      }
	      System.out.println();}
	    } 
	    void met(int a[]) {
	 for(int i=0;i<a.length;i++) {
		 System.out.println(a[i]);
	 }
	 }
}