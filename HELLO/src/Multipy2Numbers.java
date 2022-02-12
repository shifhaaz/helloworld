import java.util.Scanner;
public class Multipy2Numbers {
public static void main(String args[])
{
	Scanner reader1= new Scanner (System.in);
	System.out.println("Enter the Number:");
	int number1 = reader1.nextInt();
	
	Scanner reader2= new Scanner (System.in);
	System.out.println("Enter the Number anothernumber for multiplication:");
	int number2 = reader2.nextInt();
	
	int A = number1*number2;
	System.out.println("this is the multiplication of 2 numbers which is entered by user:"+A);
}
}
