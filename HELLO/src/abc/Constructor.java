package abc;

public class Constructor {
	String s;
	public Constructor() {
		System.out.println("constructor called");
	}
	Constructor(String s){
		System.out.println("Constructor called:"+s);
		this.s=s;
		System.out.println(this.s);
	}

	public static void main(String[] args) {
//		new Constructor();
		Constructor obj0 =new Constructor();
		Constructor obj=new Constructor("Hello World");

	}

}
