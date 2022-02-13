import java.util.Scanner;
public class FloydTriangle {

	public static void main(String[] args) {
		int number = 1,i,j; 
         //To get the user's input 
         Scanner input = new Scanner(System.in); 
         System.out.println("Enter the number of rows for floyd's triangle:"); 
         //Copying user input into an integer variable named rows 
         int rows = input.nextInt(); 
         System.out.println("Floyd's triangle"); 
  
          
         for ( i= 1 ; i <= rows ; i++ ) 
         { 
             for ( j = 1 ; j <= i ; j++ ) 
             { 
                  System.out.print(number+" ");  
                  number++; 
             } 
             System.out.println(); 
         } 
     } 
   

	}


