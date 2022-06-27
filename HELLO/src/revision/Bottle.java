package revision;

public class Bottle {
	
 public Bottle() {//non default constructor because we provide return type.
	 String Bottle[]={"Plastic","Stainless Steel","Copper","Glass"};
	 System.out.println("Water Bottle Material can be of any type are as follows:");
		for(int i=0;i < Bottle.length;i++) {
			System.out.println(Bottle[i]);
		}
		System.out.println("I Choose "+Bottle[3]+"..out of all");
 }
	public static void main(String[] args) {
	Waterbottle buy =new Waterbottle();
	buy.BottleDetails();

	}

}
class Waterbottle extends Bottle{
 Waterbottle() {//this is default cons of water bottle.
	System.out.println("this is waterbottle cons");
}
	void BottleDetails()
	{
		int BottleCapacity= 3;//3litres.
		float BottleHeight= 12.5f ;//12inches.
		String BottleBrand= "John Lewis";
		String BottleColor="Transparent";
		String BottleShape="Sqaure";
		System.out.println("The capacity of the Bottle is--"+BottleCapacity+"Ltrs..");
		System.out.println("The Height of the Bottle is--"+BottleHeight+"inches.");
		System.out.println("The Brand of the Bottle is--"+BottleBrand);
		System.out.println("The Color of the Bottle is--"+BottleColor);
		System.out.println("The Shape of the Bottle is--"+BottleShape);
			}
}
class Drinkbottle extends Bottle{
	
}
