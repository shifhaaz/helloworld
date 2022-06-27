package exceppack;

public class ExceptionDemo1 {

	public static void main(String[] args) {
	Main obj=new Main();
	try {
	obj.CheckAge(19);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
class Main{
	public void CheckAge(int age)throws ArithmeticException{
		if(age<18) {
			throw new ArithmeticException("you must be 18 years old");
		}
		else {
			System.out.println("Access GRANTED....");
		}
	}
	
}

