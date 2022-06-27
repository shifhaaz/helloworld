package revision;

public class Overriding {

	public static void main(String[] args) {
		Human obj1=new Human();//parent class instance created
		Male obj2=new Male();//child class instance created
		obj1.met();	
		obj2.met();
		
	}
}
class Human{
	void met() {
		System.out.println("parent class met called");
	}
}
class Male extends Human{
	void met()
	{
		System.out.println("child class met called");
	}
}
