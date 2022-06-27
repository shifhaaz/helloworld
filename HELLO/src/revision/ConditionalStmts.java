
package revision;

import java.util.Scanner;

public class ConditionalStmts {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = reader.nextInt();
		
		System.out.println("enter the value of b");
		int b = reader.nextInt();
		
		System.out.println("enter the value of c");
		int c = reader.nextInt();
	
		if(a<b && c<b)
			System.out.println("b is greater than a and c");
		
		else if(b<a && c<a)
			System.out.println("a is greater than b and c");
		else
			System.out.println("c is greater than b and a");
	}
}
