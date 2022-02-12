import java.util.Scanner;
public class vowelOrNot {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		char ch= reader.next().charAt(0);
		
		
	
		if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			 System.out.println("this alphabet is vowel");
		else
			System.out.println("this is not a vowel");
		

	}

}
