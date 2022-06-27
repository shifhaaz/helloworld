package exceppack;
//https://fluvid.com/videos/detail/6B-o2iQ2LjteDBdGd#.Yii7mSy-_oI.link
public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("before exception...");
		LLRDriver llr=new LLRDriver();
		try {
			llr.drive("bumpy");
		}catch(Exception e) {
			System.out.println(e);
		}
	System.out.println("After Exception");
}
}

class LLRDriver{
	public void drive(String road) throws Exception{//we use throws to let user know we are capable of throwing an error
		if(road.equals("bumpy")) {
			throw new Exception();//throw is used to explicitly throw an error
		}
	}}
