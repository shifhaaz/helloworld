package revision;

public class AbstractDemo1 {
public static void main(String[] args) {
	Shop shop;//variable of abs class.
	Shop.met();//static method called.
	//In order to create object of the abstract class as abstract class cannot create object 
	//so we have to 100% make abstract class parent then create child class extends parent class
	//then you can create object of the child class which is like this
	shop = new Clothshop();//so here we created object of both the class abstract parent n child
	//when you write this above line JVM will create one object for parent class n one for child class.
	//so the constructor of both will get called automatically.
	shop.met1(); 
	shop = new Shoeshop();//because now the Shoe is shoe shop.
	if(shop instanceof Clothshop) {
		System.out.println("this is clothshop");
	}
		else
		{
			System.out.println("this is Shoeshop");
				
			}
		accept(new Clothshop());
		accept(new Shoeshop());
	}
	

static void accept(Clothshop shop) {//this is dynamic convocation.
	System.out.println(" cloth shop.."+shop);
}
static void accept(Shoeshop shop) {//this is dynamic convocation.
	System.out.println(" Shoeshop shop.."+shop);
}
}

abstract class Shop{
	public Shop() {
		System.out.println("this is cons of abs class");
	}
	static {
		System.out.println("this is static block of abs class");
	}
	static void met() {
		System.out.println("this is static met of abstract class");
	}
	void met1() {
		System.out.println("this is non static met of  absclass");
	}
}
class Clothshop extends Shop{
	public Clothshop() {
		System.out.println("cons of child class");
	}
	 public void mets()
	{
		System.out.println("this is child class met");
	}
}
class Shoeshop extends Shop{
	
}
