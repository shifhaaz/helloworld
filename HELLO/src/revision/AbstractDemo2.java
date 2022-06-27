package revision;

public class AbstractDemo2 {

	public static void main(String[] args) {
		MumbaiBiryani food= new UkBiryani();//made the object of child class so we also made object 
		//for abstract class
		food.MakeBiryani();
		food.DeliveredBy();
		food.Getpayment();
	}

}
abstract class MumbaiBiryani{
	final private void BiryaniMasala() {
		System.out.println("Biryani masala prepared here according to the recipe");
	}
	final private void BiryaniRice() {
		System.out.println("Biryani rice prepared here according to the recipe");
	}
	final private void BiryaniChicken() {
		System.out.println("Biryani chicken prepared hereaccording to the recipe");
	}
	public void MakeBiryani() {
		BiryaniMasala();
		BiryaniRice();
		BiryaniChicken();
	}
	 public abstract void Getpayment();
	 public abstract void DeliveredBy();
}
class UkBiryani extends MumbaiBiryani{
	@Override
	public void Getpayment() {
		System.out.println("take payment according to the country currency");
	}
	@Override
	public void DeliveredBy() {
		System.out.println("Delivered by car");
		
	}
	
}

