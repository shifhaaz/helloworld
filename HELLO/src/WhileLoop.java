import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter Any Number Less Than 10....:");
		int  number=reader.nextInt();
		
		int sum=0;
		while(number <= 10)
		{
			sum = sum + number;
			System.out.println("This is the Sum of the Number You have Entered....  "+ number);
			number++;
			
		}
		System.out.format("sum of the NUMBER from while loop is:%d",sum);
		
	}

}
