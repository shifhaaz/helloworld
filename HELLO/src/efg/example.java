package efg;
import java.util.Scanner;
public class example {
	public static void  main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Plz enter a nnumber");
		//int n1=scan.nextInt();
		int n1 = Integer.parseInt(scan.next());
		System.out.println("Plz enter other a nnumber");
		int n2=scan.nextInt();
		System.out.println("Addition...:"+(n1+n2));
	}

}
