import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Value for Length...:");
		int num1=sc.nextInt();
		
		Scanner sc1 =new Scanner(System.in);
		System.out.println("Enter the Value for Width...:");
		int num2=sc.nextInt();
		
		int rec ;
		rec=num1*num2;
		
		System.out.println("Area of Rectangle is..:"+rec);
		
		
		

	}

}
