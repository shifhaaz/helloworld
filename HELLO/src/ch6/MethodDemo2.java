package ch6;

public class MethodDemo2 {

	public static void main(String[] args) {
		MethodDemo2 obj=new MethodDemo2();
		
		System.out.println(obj.met());
		System.out.println(obj.met(10));
		System.out.println(obj.met(100l));
		
	}
	int  met() {
		return 10;
	}
	String met(int i) {
		return "hi";

	}
	Boolean met(long l) {
		if(l == 100) {
			return true;
		}
		else
		{
			return false;
		}
		
		}
	}

