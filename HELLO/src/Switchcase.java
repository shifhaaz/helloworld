
public class Switchcase {

	public static void main(String[] args) {
		int ch=3; 
		int ch1=3;
		switch(ch)
		{
		case 1:{
			System.out.println("this is Jan");
			break;
			}
		case 2:{
			System.out.println("this is feb");
			break;	
		}
		case 3:{
			switch(ch1)
			{
			case 1 :{
				System.out.println("this is sunday");
				break;
			}
			case 2 : {
				System.out.println("this is monday");
				break;
			}
			case 3:{
				System.out.println("this  is tuesday");
				break;
				
			}
			}
			
		}
		
		}
		}	
	}


