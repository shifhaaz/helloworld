package gtweb3;
//1st week class
public class InterDemo1 {
 public static void main(String[] args) {
	ceo oo=new Shifha();
	oo.work();
	oo.GiveProfitToUS();
	
}
}
interface ceo{
	private void reportToUs() {
		System.out.println("report to US");
	}
	private void workForUs() {
		System.out.println("work for US...");
	}
	default void work() {
		workForUs();
		reportToUs();
	}
	public abstract void GiveProfitToUS();
}
class  Shifha implements ceo{
	@Override
	public void GiveProfitToUS() {
		System.out.println("Profit for US.......");
		
	}
	
}
