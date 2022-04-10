package efg;

public class GenericDemo {

	public static void main(String[] args) {
		Printer <Integer,?>printer=new  Printer<>(100,34.21);
		Printer <Double,String>printer0=new  Printer<>(100.00,"Hello World");
		Printer <?,?>printer1=new  Printer<>("Hello There",1234);
		printer.print();
		printer0.print();
		printer1.print();

	}
}

 class Printer<T,V>{
	T thingsToprint;
	V OtherThingsToPrint;
	public Printer(T thingsToprint,V OtherThingsToPrint)//constructor 
	{
		this.thingsToprint=thingsToprint;
		this.OtherThingsToPrint=OtherThingsToPrint;
	}
	public void print()//method
	{
		System.out.println(thingsToprint);
		System.out.println(OtherThingsToPrint);
	}
	
}

