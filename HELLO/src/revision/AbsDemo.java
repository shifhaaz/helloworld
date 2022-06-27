package revision;

public class AbsDemo {

	public static void main(String[] args) {
	hall2.metS();
	hall2 hall;//abstract class variable hall
	
	hall=new Birthdayhall();//MODERN WAY OF CREATING OBJECT 
	hall=new Partyhall();
	hall.met();
	
	
	if(hall instanceof Birthdayhall) {
		System.out.println("this is Birthday hall");
	}
	else {
		System.out.println("this is not birthday hall");
	}
	hall.met22();
	hall=new Partyhall();
	hall.met22();
}
}
abstract class hall2{
	public abstract void met22();
	public hall2() {
		System.out.println("cons called");
	}
	static {
		System.out.println("this is common for ALL");
	}
	public void met()//normal method
	{
		System.out.println("met called");
	}
	public static void metS() {//static method
		System.out.println("static met called");
	}
}
class Partyhall extends hall2{
	@Override
	public void met22() {
		System.out.println("this is met22 in partyhall");
		
	}
	public Partyhall() {
		
		System.out.println("party hall cons called");
	}
}
class  Birthdayhall extends hall2{
	@Override
	public void met22() {
		System.out.println("this is met22 in birthdayhall");
		
	}
	public Birthdayhall() {
		System.out.println("birthday hall cons called");
	}
}
