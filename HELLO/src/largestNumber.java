import java.util.Scanner;
public class largestNumber {

	public static void main(String[] args) {
		Scanner reader1=new Scanner(System.in);
		System.out.println("Enter your first Number....");
		int N1=reader1.nextInt();
		
		Scanner reader2=new Scanner(System.in);
		System.out.println("Enter your second Number...");
		int N2=reader2.nextInt();
		
		Scanner reader3=new Scanner(System.in);
		System.out.println("Enter your Third Number...");
		int N3=reader3.nextInt();
		
		if(N1>=N2 && N1>=N3)
			System.out.println("N1 is Greater than N2 AND N3");
		else
			if(N2>=N1 && N2>=N3)
				System.out.println("N2 is Greater than N1 AND N3");
			else
				System.out.println("N3 is Greater than N1 AND N2");		
	}

}
