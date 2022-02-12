import java.util.Scanner;
public class Multipy2Numbers {
public static void main(String args[])
{
	Scanner reader= new Scanner (System.in);
	System.out.println("Enter the Number:");
	int number = reader.nextInt();
	int A = number*2;
	System.out.println("this is the multiplication with 2 of the  number you have entered :"+A);
}
}
