package ch6;
//https://fluvid.com/videos/detail/-KRkYhGjmmSEzEOE_#.Yh7cRI6mtks.link
public class AbstractDemo2 {

	public static void main(String[] args) {
		DominoPizza dominos=new IndianDominoPizza();//
		dominos.makepizza();
		dominos.collectPayment();
		dominos.deliverPizza();

	}

}
abstract class DominoPizza{
	final private void makeDough() {
		System.out.println("Dominos secret of making dough");
	}
	final private void addIngredient() {
		System.out.println("Domino secret ingredient added");
	}
	final private void bakePizza() {
		System.out.println("Domino secret baking");
	}
	final public void makepizza() {
		System.out.println("Pizza domino making started....");
		makeDough();
		addIngredient();
		bakePizza();
		System.out.println("Pizza created as per Domino Standard....");
	}
	public abstract void deliverPizza();
	public abstract void collectPayment();
}
class IndianDominoPizza extends DominoPizza{
	@Override
	public void collectPayment() {
		System.out.println("Collect payment as per indian standard...");		
	}
	 @Override
	public void deliverPizza() {
		 System.out.println("Delivered Pizza as per indian standard...");
	}
}